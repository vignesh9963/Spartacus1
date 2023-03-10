/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.catalog.interceptors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class DefaultCatalogVersionPrepareInterceptorTest
{

	private CatalogVersionPrepareInterceptor interceptor;

	@Mock
	private InterceptorContext mockInterceptorContext;
	@Mock
	private ModelService mockModelService;

	@Mock
	private UserService userService;
	@Mock
	private UserModel user;

	private CatalogModel catalog;
	private Object catalogSource;
	private CatalogVersionModel catalogVersionActive;
	private Object catalogVersionActiveSource;
	private CatalogVersionModel catalogVersion;
	private Object catalogVersionSource;

	@Before
	public void setUp() throws Exception
	{
		interceptor = new CatalogVersionPrepareInterceptor();
		interceptor.setUserService(userService);

		catalogVersion = new CatalogVersionModel();
		catalogVersionActive = new CatalogVersionModel();
		catalog = new CatalogModel();

		catalogSource = new Object();
		catalogVersionSource = new Object();
		catalogVersionActiveSource = new Object();

		Mockito.lenient().when(mockInterceptorContext.getModelService()).thenReturn(mockModelService);
		Mockito.lenient().when(mockModelService.getSource(catalog)).thenReturn(catalogSource);
		Mockito.lenient().when(mockModelService.getSource(catalogVersion)).thenReturn(catalogVersionSource);
		Mockito.lenient().when(mockModelService.getSource(catalogVersionActive)).thenReturn(catalogVersionActiveSource);

		when(userService.getCurrentUser()).thenReturn(user);
	}

	/**
	 * Test method for
	 * {@link de.hybris.platform.catalog.interceptors.CatalogVersionPrepareInterceptor#onPrepare(java.lang.Object, de.hybris.platform.servicelayer.interceptor.InterceptorContext)}
	 * .
	 *
	 * @throws InterceptorException
	 */
	@Test
	public void testOnPrepareSetActive() throws InterceptorException
	{
		when(Boolean.valueOf(mockInterceptorContext.isModified(catalogVersion, CatalogVersionModel.ACTIVE))).thenReturn(
				Boolean.TRUE);
		catalogVersionActive.setCatalog(catalog);
		catalogVersionActive.setActive(Boolean.TRUE);

		catalogVersion.setCatalog(catalog);
		catalogVersion.setActive(Boolean.FALSE);

		final Set<CatalogVersionModel> cvs = new HashSet();
		cvs.add(catalogVersion);
		cvs.add(catalogVersionActive);
		catalog.setCatalogVersions(cvs);
		catalog.setActiveCatalogVersion(catalogVersionActive);

		catalogVersion.setActive(Boolean.TRUE);
		interceptor.onPrepare(catalogVersion, mockInterceptorContext);


		Assert.assertTrue(catalogVersion.getActive().booleanValue());
		Assert.assertEquals(catalogVersion, catalog.getActiveCatalogVersion());

	}

	@Test
	public void testOnPrepareUnSetActive() throws InterceptorException
	{
		when(Boolean.valueOf(mockInterceptorContext.isModified(catalogVersionActive, CatalogVersionModel.ACTIVE))).thenReturn(
				Boolean.TRUE);
		catalogVersionActive.setCatalog(catalog);
		catalogVersionActive.setActive(Boolean.TRUE);

		catalogVersion.setCatalog(catalog);
		catalogVersion.setActive(Boolean.FALSE);

		final Set<CatalogVersionModel> cvs = new HashSet();
		cvs.add(catalogVersion);
		cvs.add(catalogVersionActive);
		catalog.setCatalogVersions(cvs);
		catalog.setActiveCatalogVersion(catalogVersionActive);

		catalogVersionActive.setActive(Boolean.FALSE);
		interceptor.onPrepare(catalogVersionActive, mockInterceptorContext);


		Assert.assertFalse(catalogVersionActive.getActive().booleanValue());
		Assert.assertNull(catalog.getActiveCatalogVersion());
	}

	@Test
	public void testOnPrepareNullCatalog() throws InterceptorException
	{
		when(Boolean.valueOf(mockInterceptorContext.isModified(catalogVersionActive, CatalogVersionModel.ACTIVE))).thenReturn(
				Boolean.TRUE);
		try
		{
			interceptor.onPrepare(catalogVersionActive, mockInterceptorContext);
		}
		catch (final Exception e)
		{
			Assert.fail("No exception expected, but cought :" + e.getMessage());
		}
	}

	@Test
	public void testAssigningCurrentUserReadWritePermissions()
	{
		//given
		final UserModel currentUser = mock(UserModel.class);
		final PrincipalModel writePrincipal = mock(PrincipalModel.class);
		final PrincipalModel readPrincipal = mock(PrincipalModel.class);
		catalogVersionActive = new CatalogVersionModel();
		catalogVersionActive.setWritePrincipals(List.of(writePrincipal));
		catalogVersionActive.setReadPrincipals(List.of(readPrincipal));
		given(userService.getCurrentUser()).willReturn(currentUser);

		//when
		interceptor.assignCurrentUserReadWritePermissions(catalogVersionActive, mockInterceptorContext);

		//then
		assertThat(catalogVersionActive.getWritePrincipals()).containsOnly(currentUser, writePrincipal);
		assertThat(catalogVersionActive.getReadPrincipals()).containsOnly(currentUser, readPrincipal);
	}

	@Test
	public void testAssigningCurrentUserReadWritePermissionsIfPrincipalsAreNull()
	{
		//given
		final UserModel currentUser = mock(UserModel.class);
		catalogVersionActive = new CatalogVersionModel();
		given(userService.getCurrentUser()).willReturn(currentUser);

		//when
		interceptor.assignCurrentUserReadWritePermissions(catalogVersionActive, mockInterceptorContext);

		//then
		assertThat(catalogVersionActive.getWritePrincipals()).containsOnly(currentUser);
		assertThat(catalogVersionActive.getReadPrincipals()).containsOnly(currentUser);
	}


}
