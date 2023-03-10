/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.i18n;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.i18n.impl.DefaultL10NService;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class DefaultL10NServiceTest
{
	@Mock
	private I18NService i18nService;

	@InjectMocks
	private DefaultL10NService l10nService;

	/**
	 * this test also covers the {@link DefaultL10NService#getLocalizedString(String)} method.
	 */
	@Test
	public void testResourceBundleWithoutBaseName()
	{
		final MockDefaultL10NService l10nServiceMock = spy(new MockDefaultL10NService());
		l10nServiceMock.setI18nService(i18nService);

		final Locale localeEn = new Locale("en");
		final Locale localeDe = new Locale("de");
		final Locale[] locales = new Locale[]
				{ localeEn, localeDe };

		//current system language: en
		when(i18nService.getCurrentLocale()).thenReturn(localeEn);
		//en has a de language fallback
		when(i18nService.getAllLocales(localeEn)).thenReturn(locales);
		when(i18nService.getBestMatchingLocale(localeEn)).thenReturn(localeEn);
		when(i18nService.getBestMatchingLocale(localeDe)).thenReturn(localeDe);

		//getResourceBundle without any parameter
		assertEquals("Wrong property value!", "one", l10nServiceMock.getResourceBundle().getString("property.one"));
		assertEquals("Wrong property value!", "zwei", l10nServiceMock.getResourceBundle().getString("property.two"));
		assertEquals("Wrong property value!", "drei", l10nServiceMock.getResourceBundle().getString("property.three"));

		//getResourceBundle with locales
		assertEquals("Wrong property value!", "eins", l10nServiceMock.getResourceBundle(new Locale[]
				{ localeDe })
		                                                             .getString("property.one"));
		assertEquals("Wrong property value!", "four", l10nServiceMock.getResourceBundle(new Locale[]
				{ localeEn })
		                                                             .getString("property.four"));

		verify(i18nService, times(3)).getCurrentLocale();
		verify(i18nService, times(3)).getAllLocales(localeEn);
		verify(i18nService, times(4)).getBestMatchingLocale(localeEn);
		verify(i18nService, times(4)).getBestMatchingLocale(localeDe);
	}

	@Test
	public void testGetResourceBundleWithBaseName()
	{
		ResourceBundle bundle;

		when(i18nService.getCurrentLocale()).thenReturn(Locale.ENGLISH);
		when(i18nService.getAllLocales(Locale.ENGLISH)).thenReturn(new Locale[]
				{ Locale.ENGLISH, Locale.UK, Locale.US });

		bundle = l10nService.getResourceBundle("servicelayer.test.testBundle");
		assertEquals("save", bundle.getString("action.mem"));

		when(i18nService.getCurrentLocale()).thenReturn(Locale.UK);
		when(i18nService.getAllLocales(Locale.UK)).thenReturn(new Locale[]
				{ Locale.UK, Locale.ENGLISH, Locale.US });
		bundle = l10nService.getResourceBundle("servicelayer.test.testBundle");
		assertEquals("memorise", bundle.getString("action.mem"));

		when(i18nService.getCurrentLocale()).thenReturn(Locale.US);
		when(i18nService.getAllLocales(Locale.US)).thenReturn(new Locale[]
				{ Locale.US, Locale.ENGLISH, Locale.UK });
		bundle = l10nService.getResourceBundle("servicelayer.test.testBundle");
		assertEquals("memorize", bundle.getString("action.mem"));

		verify(i18nService, times(3)).getCurrentLocale();
		verify(i18nService, times(3)).getAllLocales(any());
	}

	/**
	 * Final bundle test incl. load mechanism.<br/>
	 * Bundles are: testBundle_de,testBundle_en,testBundle_en_UK,testBundle_en_US
	 */
	@Test
	public void testGetResourceBundleWithBaseNameAndLocales()
	{
		// Relevant bundle contents:
		//  	testBundle_en_US.properties
		//  		action.testFallback1=US
		//  	testBundle_en.properties
		//			action.testFallback1=En
		//			action.testFallback2=En
		//  	testBundle_de.properties
		//			action.testFallback1=De
		//			action.testFallback2=De
		//			action.testFallback3=De

		final String bundleLocation = "servicelayer.test.testBundle";
		// A hybris ResourceBundle with fallback _en_US->_en->_de
		final ResourceBundle hybrisBundle = l10nService.getResourceBundle(bundleLocation, new Locale[]
				{ Locale.US, Locale.GERMAN });
		// A standard ResourceBundle with normal fallback _en_US->_en
		final ResourceBundle javaBundle = ResourceBundle.getBundle(bundleLocation, Locale.US, getClass().getClassLoader());

		//key available therefore no fallback used
		assertEquals("US", hybrisBundle.getObject("action.testFallback1").toString());
		//key not available in _en_US and custom fallback used (_en_US->_en)
		assertEquals("En", hybrisBundle.getObject("action.testFallback2").toString());
		//key not available in _en_US or _en and custom fallback used (_en_US->_en->_de)
		assertEquals("De", hybrisBundle.getObject("action.testFallback3").toString());
		try
		{
			//key not anywhere and custom fallback used
			hybrisBundle.getObject("action.testFallback4");
			fail("Should throw MissingResourceException");
		}
		catch (final MissingResourceException e)
		{
			// MissingResourceException should be thrown
		}

		//key available therefore no fallback used
		assertEquals("US", javaBundle.getObject("action.testFallback1").toString());
		//key not available in _en_US and standard fallback used (_en_US->_en)
		assertEquals("En", javaBundle.getObject("action.testFallback2").toString());
		try
		{
			//key not available in _en_US or _en and standard fallback used (_en_US->_en)
			javaBundle.getObject("action.testFallback3");
			fail("Should throw MissingResourceException");
		}
		catch (final MissingResourceException e)
		{
			// MissingResourceException should be thrown
		}
		try
		{
			//key not available anywhere and standard fallback used
			javaBundle.getObject("action.testFallback4");
			fail("Should throw MissingResourceException");
		}
		catch (final MissingResourceException e)
		{
			// MissingResourceException should be thrown
		}

		try
		{
			l10nService.getResourceBundle(bundleLocation, null);
			fail();
		}
		catch (final IllegalArgumentException e)
		{
			//ok
		}

		try
		{
			l10nService.getResourceBundle(bundleLocation, new Locale[]{});
			fail();
		}
		catch (final IllegalArgumentException e)
		{
			//ok
		}
	}

	public static class MockDefaultL10NService extends DefaultL10NService
	{
		@Override
		protected Map<Locale, Properties> getLocalizations()
		{
			final Map<Locale, Properties> localizations = new HashMap<>();

			final Properties propertiesEn = new Properties();
			propertiesEn.put("property.one", "one");
			propertiesEn.put("property.two", "");
			propertiesEn.put("property.four", "four");

			localizations.put(new Locale("en"), propertiesEn);

			final Properties propertiesDe = new Properties();
			propertiesDe.put("property.one", "eins");
			propertiesDe.put("property.two", "zwei");
			propertiesDe.put("property.three", "drei");
			propertiesDe.put("property.four", "vier");

			localizations.put(new Locale("de"), propertiesDe);

			return localizations;
		}
	}
}
