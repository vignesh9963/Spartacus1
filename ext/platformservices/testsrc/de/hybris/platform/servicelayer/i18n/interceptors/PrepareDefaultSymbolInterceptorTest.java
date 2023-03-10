/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.i18n.interceptors;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Currency;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;


/**
 * Test covering the (@link PrepareDefaultSymbolInterceptor) logic.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class PrepareDefaultSymbolInterceptorTest
{
	@Mock
	private InterceptorContext interceptorContext;

	@Mock
	private I18NService i18NService;

	private PrepareDefaultSymbolInterceptor interceptor;

	private final Currency someCurrency = Currency.getInstance(Locale.JAPAN);

	@Before
	public void setUp()
	{
		interceptor = new PrepareDefaultSymbolInterceptor();
		interceptor.setI18NService(i18NService);
	}

	@Test
	public void testDefaultCurrencySymbolNotSet() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setIsocode(someCurrency.getCurrencyCode());

		when(i18NService.getBestMatchingJavaCurrency(curr.getIsocode())).thenReturn(someCurrency);

		interceptor.onPrepare(curr, interceptorContext);

		Assert.assertEquals(someCurrency.getCurrencyCode(), curr.getSymbol());
		verify(i18NService, Mockito.times(1)).getBestMatchingJavaCurrency(curr.getIsocode());
	}

	@Test
	public void testDefaultCurrencySymbolSet() throws InterceptorException
	{
		final CurrencyModel curr = new CurrencyModel();
		curr.setIsocode("unknownCurrency");
		curr.setSymbol("unknownCurrency");
		interceptor.onPrepare(curr, interceptorContext);
		Assert.assertEquals("unknownCurrency", curr.getSymbol());
	}

}
