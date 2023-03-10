/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.media.impl;

import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.servicelayer.security.permissions.PermissionCheckResult;
import de.hybris.platform.servicelayer.security.permissions.PermissionCheckValue;
import de.hybris.platform.servicelayer.security.permissions.PermissionCheckingService;
import de.hybris.platform.servicelayer.security.permissions.PermissionManagementService;
import de.hybris.platform.servicelayer.security.permissions.PermissionsConstants;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;


/**
 * JUnit class for {@link DefaultMediaPermissionService}
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class DefaultMediaPermissionServiceTest
{

	private DefaultMediaPermissionService mediaPermissionService;

	@Mock
	private PermissionCheckingService mockPermissionCheckingService;
	@Mock
	private PermissionManagementService mockPermissionManagementService;

	private MediaModel testMediaItem;
	private PrincipalModel testPrincipal;

	/**
	 *
	 */
	@Before
	public void setUp() throws Exception
	{
		mediaPermissionService = new DefaultMediaPermissionService();
		mediaPermissionService.setPermissionCheckingService(mockPermissionCheckingService);
		mediaPermissionService.setPermissionManagementService(mockPermissionManagementService);

		testMediaItem = new MediaModel();
		testPrincipal = new PrincipalModel();
	}

	/**
	 * Test method for
	 * {@link de.hybris.platform.servicelayer.media.impl.DefaultMediaPermissionService#isReadAccessGranted(de.hybris.platform.core.model.media.MediaModel, de.hybris.platform.core.model.security.PrincipalModel)}
	 * .
	 */
	@Test
	public void testIsReadAccessGrantedTrue()
	{
		final PermissionCheckResult expectedResult = new PermissionCheckResult()
		{
			@Override
			public boolean isGranted()
			{
				return true;
			}

			@Override
			public boolean isDenied()
			{
				return false;
			}

			@Override
			public PermissionCheckValue getCheckValue()
			{
				return PermissionCheckValue.ALLOWED;
			}
		};
		given(mockPermissionCheckingService.checkItemPermission(testMediaItem, testPrincipal, PermissionsConstants.READ))
				.willReturn(expectedResult);

		final boolean result = mediaPermissionService.isReadAccessGranted(testMediaItem, testPrincipal);
		Assert.assertTrue(result);
	}

	/**
	 * Test method for
	 * {@link de.hybris.platform.servicelayer.media.impl.DefaultMediaPermissionService#isReadAccessGranted(de.hybris.platform.core.model.media.MediaModel, de.hybris.platform.core.model.security.PrincipalModel)}
	 * .
	 */
	@Test
	public void testIsReadAccessGrantedFalse()
	{
		final PermissionCheckResult expectedResult = new PermissionCheckResult()
		{
			@Override
			public boolean isGranted()
			{
				return false;
			}

			@Override
			public boolean isDenied()
			{
				return true;
			}

			@Override
			public PermissionCheckValue getCheckValue()
			{
				return PermissionCheckValue.DENIED;
			}
		};
		given(mockPermissionCheckingService.checkItemPermission(testMediaItem, testPrincipal, PermissionsConstants.READ))
				.willReturn(expectedResult);

		final boolean result = mediaPermissionService.isReadAccessGranted(testMediaItem, testPrincipal);
		Assert.assertFalse(result);
	}

}
