/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.catalog;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.catalog.enums.ClassificationAttributeTypeEnum;
import de.hybris.platform.catalog.model.ProductFeatureModel;
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeModel;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeValueModel;
import de.hybris.platform.catalog.model.classification.ClassificationClassModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemVersionModel;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.impex.ImportConfig;
import de.hybris.platform.servicelayer.impex.ImportResult;
import de.hybris.platform.servicelayer.impex.ImportService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.testframework.PropertyConfigSwitcher;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Test;

@IntegrationTest
public class FeatureValueImpexImportIntegrationTest extends ServicelayerBaseTest
{
	private static final PropertyConfigSwitcher product2FeatureRelation = new PropertyConfigSwitcher(
			"relation.Product2FeatureRelation.reordered");
	private static final Duration MAX_IMPORT_DURATION = Duration.ofSeconds(15);

	@Resource
	private ImportService importService;
	@Resource
	private ModelService modelService;
	@Resource
	private FlexibleSearchService flexibleSearchService;

	@After
	public void after()
	{
		product2FeatureRelation.switchBackToDefault();
	}

	@Test
	public void shouldNotRecreateProductFeatureWhenImportedTwice()
	{
		//given
		final ProductModel product = createClassificationSystemData(0);

		modelService.saveAll();

		final ImportConfig config = createImpexConfig();


		//when
		final ImportResult importResult = importService.importData(config);
		waitForImport(importResult);

		final Map<String, PK> queryParams = Map.of("prod", product.getPk());
		final String query = "SELECT {" + ItemModel.PK + "} FROM {" + ProductFeatureModel._TYPECODE + "} WHERE {" +
				ProductFeatureModel.PRODUCT + "} = ?prod";

		final SearchResult<Object> searchBefore = flexibleSearchService.search(query, queryParams);
		final Long featurePk = ((ProductFeatureModel) searchBefore.getResult().get(0)).getPk().getLong();
		assertThat(((ProductFeatureModel) searchBefore.getResult().get(0)).getFeaturePosition()).isZero();

		final ImportResult importResult2 = importService.importData(config);
		waitForImport(importResult2);

		//then
		final SearchResult<Object> searchAfter = flexibleSearchService.search(query, queryParams);

		assertThat(searchAfter.getResult()).hasSize(1);
		final ProductFeatureModel returnedProductFeature = (ProductFeatureModel) searchAfter.getResult().get(0);
		assertThat(returnedProductFeature.getPk().getLong()).isEqualTo(featurePk);
	}

	@Test
	public void shouldPreservePositionOfProductFeatureFromContainerWhenImported()
	{
		//given
		product2FeatureRelation.switchToValue("always");
		final int position = 5;
		final ProductModel product = createClassificationSystemData(position);

		modelService.saveAll();

		final ImportConfig config = createImpexConfig();

		//when
		final ImportResult importResult = importService.importData(config);
		waitForImport(importResult);

		//then
		assertProductFeaturePositionIs(product, position);
	}

	@Test
	public void shouldPreservePositionOfProductFeatureWhenImportedWhenFlagSetToSync()
	{
		//given
		product2FeatureRelation.switchToValue("sync");
		final int position = 5;
		final ProductModel product = createClassificationSystemData(position);

		modelService.saveAll();

		final ImportConfig config = createImpexConfig();

		//when
		final ImportResult importResult = importService.importData(config);
		waitForImport(importResult);

		assertProductFeaturePositionIs(product, 5);
	}

	@Test
	public void shouldPreservePositionOfProductFeatureWhenImportedWhenFlagSetToSyncAndDuringSync()
	{
		//given
		product2FeatureRelation.switchToValue("sync");
		final int position = 5;
		final ProductModel product = createClassificationSystemData(position);

		modelService.saveAll();

		withinSynchronization(() -> {
			final ImportConfig config = createImpexConfig();

			//when
			final ImportResult importResult = importService.importData(config);
			waitForImport(importResult);
		});

		assertProductFeaturePositionIs(product, position);
	}

	@Test
	public void shouldPreservePositionOfProductFeatureFromContainerWhenImportedAndPropertyIsEmpty()
	{
		//given
		product2FeatureRelation.switchToValue("");
		final int position = 5;
		final ProductModel product = createClassificationSystemData(position);

		modelService.saveAll();

		final ImportConfig config = createImpexConfig();

		//when
		final ImportResult importResult = importService.importData(config);
		waitForImport(importResult);

		assertProductFeaturePositionIs(product, position);
	}

	@Test
	public void shouldSetNewPositionOfProductFeatureFromContainerWhenImportedAndPropertyIsFalse()
	{
		//given
		product2FeatureRelation.switchToValue("false");
		final int position = 5;
		final ProductModel product = createClassificationSystemData(position);

		modelService.saveAll();

		final ImportConfig config = createImpexConfig();

		//when
		final ImportResult importResult = importService.importData(config);
		waitForImport(importResult);

		assertProductFeaturePositionIs(product, 0);
	}

	private void assertProductFeaturePositionIs(final ProductModel product, final int position)
	{
		modelService.refresh(product);
		assertThat(product.getFeatures()).hasSize(1);
		assertThat(product.getFeatures().get(0).getFeaturePosition()).isEqualTo(position);
	}

	private void waitForImport(final ImportResult importResult)
	{
		await().pollInSameThread().atMost(MAX_IMPORT_DURATION).until(importResult::isFinished);
	}

	private ProductModel createClassificationSystemData(final int position)
	{
		final ClassificationSystemModel classificationSystem = modelService.create(ClassificationSystemModel.class);
		classificationSystem.setId("classificationSystem1");

		final ClassificationSystemVersionModel classificationSystemVersion = modelService.create(
				ClassificationSystemVersionModel.class);
		classificationSystemVersion.setCatalog(classificationSystem);
		classificationSystemVersion.setVersion("1.0");

		final ClassificationClassModel ccm = modelService.create(ClassificationClassModel.class);
		ccm.setCatalogVersion(classificationSystemVersion);
		ccm.setCode("ccm1");

		final ProductModel product = modelService.create(ProductModel.class);
		product.setCode("productWithFeature1");
		product.setCatalogVersion(classificationSystemVersion);
		product.setSupercategories(List.of(ccm));

		final ClassificationAttributeModel classificationAttribute = modelService.create(ClassificationAttributeModel.class);
		classificationAttribute.setCode("Colour of product, 1234"); //here
		classificationAttribute.setName("Colour of product");
		classificationAttribute.setSystemVersion(classificationSystemVersion);

		final ClassificationAttributeValueModel classificationAttributeValue = modelService.create(
				ClassificationAttributeValueModel.class);
		classificationAttributeValue.setCode("classificationAttributeValue1");
		classificationAttributeValue.setSystemVersion(classificationSystemVersion);


		final ClassAttributeAssignmentModel classAttributeAssignment = modelService.create(ClassAttributeAssignmentModel.class);
		classAttributeAssignment.setClassificationAttribute(classificationAttribute);
		classAttributeAssignment.setClassificationClass(ccm);
		classAttributeAssignment.setAttributeType(ClassificationAttributeTypeEnum.STRING);
		classAttributeAssignment.setPosition(position);
		return product;
	}

	private ImportConfig createImpexConfig()
	{
		final ImportConfig config = new ImportConfig();
		config.setScript("#% impex.setLocale(Locale.ENGLISH);\n" +
				"\n" +
				"$catalog-id=TestCatalog\n" +
				"$catalog-version=TestCatalogVersion\n" +
				"$catalogVersion=catalogversion(catalog(id),version)[default=$catalog-id:$catalog-version]\n" +
				"$clAttrModifiers=system='classificationSystem1',version='1.0',translator=de.hybris.platform.catalog.jalo.classification.impex.ClassificationAttributeTranslator,lang=en\n" +
				"\n" +
				"$feature1=@Colour of product, 1234[$clAttrModifiers];  # Colour of product\n" +
				"UPDATE Product;code[unique=true];$feature1;$catalogVersion;\n" +
				";productWithFeature1;Silver/Black;");
		config.setSynchronous(false);
		config.setFailOnError(true);
		config.setRemoveOnSuccess(false);
		config.setEnableCodeExecution(Boolean.TRUE);
		config.setMaxThreads(4);
		return config;
	}

	private void withinSynchronization(final Runnable logic)
	{
		try
		{
			final SessionContext ctx = JaloSession.getCurrentSession().createLocalSessionContext();
			ctx.setAttribute("catalog.sync.active", true);
			logic.run();
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}
	}
}
