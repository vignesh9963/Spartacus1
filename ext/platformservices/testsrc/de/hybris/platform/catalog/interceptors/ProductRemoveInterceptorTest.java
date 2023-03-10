/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.catalog.interceptors;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.catalog.model.ProductFeatureModel;
import de.hybris.platform.catalog.model.ProductReferenceModel;
import de.hybris.platform.catalog.references.daos.ProductReferencesDao;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class ProductRemoveInterceptorTest
{
	private ProductRemoveInterceptor productRemoveInterceptor;

	@Mock
	private ModelService modelService;
	@Mock
	private ProductReferencesDao productReferencesDao;
	@Mock
	private InterceptorContext ctx;

	@Before
	public void setup()
	{
		productRemoveInterceptor = new ProductRemoveInterceptor();
		productRemoveInterceptor.setProductReferencesDao(productReferencesDao);
	}

	@Test
	public void Remove() throws InterceptorException
	{
		final ProductModel product = new ProductModel();
		final ProductFeatureModel feature1 = new ProductFeatureModel();
		final ProductFeatureModel feature2 = new ProductFeatureModel();
		final ProductFeatureModel feature3 = new ProductFeatureModel();
		product.setFeatures(Arrays.asList(feature1, feature2, feature3));

		final ProductReferenceModel productReference1 = new ProductReferenceModel();
		final ProductReferenceModel productReference2 = new ProductReferenceModel();
		final ProductReferenceModel productReference3 = new ProductReferenceModel();

		when(productReferencesDao.findAllReferences(product)).thenReturn(
				Arrays.asList(productReference1, productReference2, productReference3));

		productRemoveInterceptor.onRemove(product, ctx);

		verify(ctx).registerElementFor(productReference1, PersistenceOperation.DELETE);
		verify(ctx).registerElementFor(productReference2, PersistenceOperation.DELETE);
		verify(ctx).registerElementFor(productReference3, PersistenceOperation.DELETE);
	}

}
