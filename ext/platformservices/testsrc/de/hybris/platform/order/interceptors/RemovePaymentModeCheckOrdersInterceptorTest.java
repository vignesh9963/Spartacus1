/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.order.interceptors;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.order.daos.OrderDao;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class RemovePaymentModeCheckOrdersInterceptorTest
{

	private RemovePaymentModeCheckOrdersInterceptor interceptor;

	@Mock
	private OrderDao mockOrderDao;

	@Before
	public void setUp()
	{
		interceptor = new RemovePaymentModeCheckOrdersInterceptor();
		interceptor.setOrderDao(mockOrderDao);
	}

	@Test(expected = InterceptorException.class)
	public void testOnRemoveOrdersExist() throws InterceptorException
	{
		final PaymentModeModel paymentMode1 = new PaymentModeModel();
		final OrderModel paymentOrder = new OrderModel();
		paymentOrder.setPaymentMode(paymentMode1);

		//return order for this payment
		when(mockOrderDao.findOrdersByPaymentMode(paymentMode1)).thenReturn(
				Collections.<AbstractOrderModel>singletonList(paymentOrder));

		interceptor.onRemove(paymentMode1, null);
	}

	@Test
	public void testOnRemoveOrdersDontExist()
	{
		final PaymentModeModel paymentMode2 = new PaymentModeModel();

		//return order for this payment
		when(mockOrderDao.findOrdersByPaymentMode(paymentMode2)).thenReturn(Collections.<AbstractOrderModel>emptyList());

		try
		{
			interceptor.onRemove(paymentMode2, null);
		}
		catch (final Exception e)
		{
			fail("paymentMode under - no exception exected on remove");
		}

	}
}
