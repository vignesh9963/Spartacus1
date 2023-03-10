/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.order.interceptors;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.order.DeliveryModeService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Tests {@link RemoveDeliverModesOnPaymentModeRemovalInterceptor}
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class RemoveDeliverModesOnPaymentModeRemovalInterceptorTest
{

	private RemoveDeliverModesOnPaymentModeRemovalInterceptor interceptor;

	@Mock
	ModelService mockModelService;
	@Mock
	InterceptorContext mockInterceptorContext;
	@Mock
	DeliveryModeService mockDeliveryModeService;

	@Before
	public void setUp()
	{
		interceptor = new RemoveDeliverModesOnPaymentModeRemovalInterceptor();

		interceptor.setDeliveryModeService(mockDeliveryModeService);
		when(mockInterceptorContext.getModelService()).thenReturn(mockModelService);
	}

	@Test
	public void testOnRemovePaymentModeHasDeliveryModes() throws InterceptorException
	{
		final PaymentModeModel testPaymentMode = new PaymentModeModel();
		final DeliveryModeModel testDeliveryMode = new DeliveryModeModel();

		//record the service response - yes there is deliveryMode
		when(mockDeliveryModeService.getSupportedDeliveryModes(testPaymentMode)).thenReturn(
				Collections.<DeliveryModeModel>singletonList(testDeliveryMode));

		interceptor.onRemove(testPaymentMode, mockInterceptorContext);
		verify(mockModelService, times(1)).removeAll(Collections.singletonList(testDeliveryMode));
	}

	@Test
	public void testOnRemovePaymentModeHasNoDeliveryModes() throws InterceptorException
	{
		final PaymentModeModel testPaymentMode = new PaymentModeModel();

		//record the service response - yes there is deliveryMode
		when(mockDeliveryModeService.getSupportedDeliveryModes(testPaymentMode)).thenReturn(
				Collections.<DeliveryModeModel>emptyList());

		interceptor.onRemove(testPaymentMode, mockInterceptorContext);
		verify(mockModelService, never()).removeAll(Mockito.anyCollection());
	}
}
