/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.catalog.job.diff.impl;

import static org.mockito.ArgumentMatchers.nullable;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.catalog.enums.CategoryDifferenceMode;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.CategoryCatalogVersionDifferenceModel;
import de.hybris.platform.catalog.model.CompareCatalogVersionsCronJobModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import junit.framework.Assert;


/**
 * Test covering {@link RemovedCategoryCatalogVersionDiffFinder} logic.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class RemovedCategoryCatalogVersionDiffFinderTest
{
	private static final Logger LOG = Logger.getLogger(RemovedCategoryCatalogVersionDiffFinderTest.class.getName());

	@Mock
	private ModelService modelService;

	@Mock
	private EnumerationService enumerationService;

	private RemovedCategoryCatalogVersionDiffFinder finder;

	@Before
	public void prepare()
	{
		finder = Mockito.spy(new RemovedCategoryCatalogVersionDiffFinder());


		finder.setModelService(modelService);
		finder.setEnumerationService(enumerationService);

		Mockito.when(modelService.create(CategoryCatalogVersionDifferenceModel.class)).thenReturn(
				new CategoryCatalogVersionDifferenceModel());

		Mockito.doAnswer(new Answer<CategoryDifferenceMode>()
		{

			@Override
			public CategoryDifferenceMode answer(final InvocationOnMock invocation) throws Throwable
			{
				final Object[] args = invocation.getArguments();
				if (CategoryDifferenceMode.CATEGORY_NEW.getCode().equals(args[1]))
				{
					return CategoryDifferenceMode.CATEGORY_NEW;
				}
				if (CategoryDifferenceMode.CATEGORY_REMOVED.getCode().equals(args[1]))
				{
					return CategoryDifferenceMode.CATEGORY_REMOVED;
				}
				return null;
			}
		}).when(enumerationService).getEnumerationValue(Mockito.anyString(), Mockito.anyString());

	}


	@Test
	public void testPopulateDifferenceModel()
	{
		final CatalogVersionModel source = new CatalogVersionModel();
		source.setVersion("source");

		final CatalogVersionModel target = new CatalogVersionModel();
		target.setVersion("target");

		final CompareCatalogVersionsCronJobModel cronJob = new CompareCatalogVersionsCronJobModel();
		cronJob.setTargetVersion(target);
		cronJob.setSourceVersion(source);


		final CategoryModel srcCategory = new CategoryModel();
		srcCategory.setCode("sourceCategory");

		final CategoryModel tgtCategory = new CategoryModel();
		tgtCategory.setCode("tgtCategory");

		final CategoryCatalogVersionDifferenceModel diff = finder.populateDifferenceModel(srcCategory, tgtCategory, cronJob);


		Assert.assertEquals(diff.getSourceVersion(), cronJob.getSourceVersion());
		Assert.assertEquals(diff.getTargetVersion(), cronJob.getTargetVersion());
		Assert.assertEquals(diff.getMode().getType(),
				de.hybris.platform.catalog.enums.CategoryDifferenceMode.CATEGORY_REMOVED.getType());
		Assert.assertEquals(diff.getMode().getCode(),
				de.hybris.platform.catalog.enums.CategoryDifferenceMode.CATEGORY_REMOVED.getCode());
		Assert.assertEquals(diff.getSourceCategory(), null);

		Assert.assertEquals(diff.getDifferenceText(), "Category " + srcCategory.getCode() + " new in version: "
				+ cronJob.getTargetVersion().getVersion());
		Assert.assertEquals(diff.getTargetCategory(), srcCategory);
		Assert.assertEquals(diff.getCronJob(), cronJob);

	}

	@Test
	public void testSkipSearches()
	{
		final CompareCatalogVersionsCronJobModel cronJob = new CompareCatalogVersionsCronJobModel();

		cronJob.setSearchMissingCategories(Boolean.FALSE);

		Assert.assertEquals(0, finder.processDifferences(cronJob));

		Mockito.verifyNoInteractions(modelService);
		Mockito.verifyNoInteractions(enumerationService);

	}

	@Test
	public void testProcessSearchesWithEmptyCategoryCount()
	{
		final CompareCatalogVersionsCronJobModel cronJob = new CompareCatalogVersionsCronJobModel();

		cronJob.setSearchMissingCategories(Boolean.TRUE);

		Mockito.doReturn(Integer.valueOf(0)).when(finder).getAllCategoryCount(nullable(CatalogVersionModel.class));
		Mockito.doReturn(Collections.EMPTY_LIST).when(finder)
		       .getAllCategories(nullable(CatalogVersionModel.class), Mockito.anyInt(), Mockito.anyInt());

		Assert.assertEquals(0, finder.processDifferences(cronJob));

		Mockito.verifyNoInteractions(modelService);
		Mockito.verifyNoInteractions(enumerationService);

	}


	@Test
	public void testProcessSearchesWithFewCategoriesNoDifferences()
	{
		final CategoryModel categoryOne = new CategoryModel();
		final CategoryModel categoryTwo = new CategoryModel();

		final Collection<CategoryModel> categories = Arrays.asList(categoryOne, categoryTwo);

		final CompareCatalogVersionsCronJobModel cronJob = new CompareCatalogVersionsCronJobModel();

		cronJob.setSearchMissingCategories(Boolean.TRUE);

		Mockito.doReturn(Integer.valueOf(5)).when(finder).getAllCategoryCount(nullable(CatalogVersionModel.class));

		Mockito.doReturn(categories).when(finder)
		       .getAllCategories(nullable(CatalogVersionModel.class), Mockito.anyInt(), Mockito.anyInt());

		//same returns equal categories - no differences
		Mockito.doReturn(categories).when(finder)
		       .getSameCategories(nullable(CatalogVersionModel.class), Mockito.any(CategoryModel.class));

		finder.setBlockSize(1);//block size to iterate by 1

		Assert.assertEquals(0, finder.processDifferences(cronJob));

		for (int i = 0; i < 5; i++)
		{
			Mockito.verify(finder).getAllCategories(cronJob.getTargetVersion(), i, 1);
		}
	}

	@Test
	public void testProcessSearchesWithFewCategoriesWithDifferences()
	{
		final CategoryModel categoryOne = new CategoryModel();
		categoryOne.setCode("category1");

		final CatalogVersionModel target = new CatalogVersionModel();
		target.setVersion("target");

		final CatalogVersionModel source = new CatalogVersionModel();
		source.setVersion("source");

		final Collection<CategoryModel> categories = Arrays.asList(categoryOne);

		final CompareCatalogVersionsCronJobModel cronJob = new CompareCatalogVersionsCronJobModel();
		cronJob.setTargetVersion(target);
		cronJob.setSourceVersion(source);
		cronJob.setSearchMissingCategories(Boolean.TRUE);

		Mockito.doReturn(Integer.valueOf(5)).when(finder).getAllCategoryCount(nullable(CatalogVersionModel.class));

		Mockito.doReturn(categories).when(finder)
		       .getAllCategories(nullable(CatalogVersionModel.class), Mockito.anyInt(), Mockito.anyInt());

		//same returns null
		Mockito.doReturn(null).when(finder)
		       .getSameCategories(nullable(CatalogVersionModel.class), Mockito.any(CategoryModel.class));


		finder.setBlockSize(1);

		Assert.assertEquals(6, finder.processDifferences(cronJob));

		final ArgumentMatcher<CategoryCatalogVersionDifferenceModel> matcher = new ArgumentMatcher<CategoryCatalogVersionDifferenceModel>()
		{

			@Override
			public boolean matches(final CategoryCatalogVersionDifferenceModel model)
			{
				if (model.getTargetCategory() != categoryOne)
				{
					LOG.info("Target category for a differnce model is  different  than " + categoryOne);
					return false;
				}
				if (model.getSourceCategory() != null)
				{
					LOG.info("Source category for a differnce model is not null ");
					return false;
				}

				if (!"Category category1 new in version: target".equalsIgnoreCase(model.getDifferenceText()))
				{
					LOG.info("Differnce text for model is not equal " + "Category category1 new in version: target");
					return false;
				}

				if (model.getSourceVersion() != source)
				{
					LOG.info("Source catalog version for the difference should be " + source);
					return false;
				}

				if (model.getTargetVersion() != target)
				{
					LOG.info("Target catalog version for the difference should be " + target);
					return false;
				}

				if (model.getMode().getCode() != CategoryDifferenceMode.CATEGORY_REMOVED.getCode())
				{
					LOG.info("Difference mode is not a " + CategoryDifferenceMode.CATEGORY_REMOVED.getCode());
					return false;
				}
				return true;
			}
		};
		for (int i = 0; i < 5; i++)
		{
			Mockito.verify(finder).getAllCategories(cronJob.getTargetVersion(), i, 1);
		}

		Mockito.verify(modelService, Mockito.times(6)).save((ArgumentMatchers.argThat(matcher)));
	}


}
