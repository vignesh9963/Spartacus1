/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.i18n.interceptors;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Test covering the (@link ValidateCurrencyDataInterceptor) logic.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class ValidateCurrencyDataInterceptorTest
{
	@Mock
	private InterceptorContext interceptorContext;
	private ValidateCurrencyDataInterceptor interceptor;

	@Before
	public void setUp()
	{
		interceptor = new ValidateCurrencyDataInterceptor();
	}

	@Test
	public void testCurrencyDigitNoValid() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setIsocode("frog");
		curr.setConversion(Double.valueOf(1));
		curr.setDigits(Integer.valueOf(-1));
		try
		{
			interceptor.onValidate(curr, interceptorContext);
			Assert.fail("Interceptor should fail since currency digit is not valid ");
		}
		catch (final InterceptorException ie)
		{
			//fine here 
		}
	}

	@Test
	public void testCurrencyConversionNoValid() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setIsocode("frog");
		curr.setConversion(Double.valueOf(0));
		curr.setDigits(Integer.valueOf(2));
		try
		{
			interceptor.onValidate(curr, interceptorContext);
			Assert.fail("Interceptor should fail since currency conversion  is not valid ");
		}
		catch (final InterceptorException ie)
		{
			//fine here 
		}
	}

	@Test
	public void testCurrencyDataValid() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setIsocode("frog");
		curr.setConversion(Double.valueOf(1));
		curr.setDigits(Integer.valueOf(2));
		interceptor.onValidate(curr, interceptorContext);
	}

	@Test
	public void testNullConversionValue() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		try
		{
			interceptor.onValidate(curr, interceptorContext);
			Assert.fail("Interceptor should fail since currency conversion null ");
		}
		catch (final InterceptorException ie)
		{
			//fine here 
		}
	}

	@Test
	public void nullDigitsValueDefaultsToZero() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setConversion(Double.valueOf(0.4d));

		interceptor.onValidate(curr, interceptorContext);

		// fine
	}
}
