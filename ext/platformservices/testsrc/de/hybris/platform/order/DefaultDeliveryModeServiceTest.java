/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.order;

import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.order.daos.DeliveryModeDao;
import de.hybris.platform.order.impl.DefaultDeliveryModeService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Tests the {@link DefaultDeliveryModeService}.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class DefaultDeliveryModeServiceTest
{

	private DefaultDeliveryModeService deliveryModeService;

	@Mock
	private DeliveryModeDao deliveryModeDao;

	@Before
	public void setUp()
	{
		deliveryModeService = new DefaultDeliveryModeService();
		deliveryModeService.setDeliveryModeDao(deliveryModeDao);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSupportedDeliveryModes()
	{
		deliveryModeService.getSupportedDeliveryModes(null);
		fail("should throw IllegalArgumentException.");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetDeliveryMode()
	{
		deliveryModeService.getDeliveryModeForCode(null);
		fail("should throw IllegalArgumentException.");
	}
}
