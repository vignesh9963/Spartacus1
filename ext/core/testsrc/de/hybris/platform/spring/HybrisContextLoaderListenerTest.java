/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.spring;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.jalo.extension.Extension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.context.ConfigurableWebApplicationContext;


/**
 * Test customization of application context regarding to additional web spring configs.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class HybrisContextLoaderListenerTest
{
	private HybrisContextLoaderListener hybrisContextLoaderListener;
	@Mock
	private ServletContext servletContext;
	@Mock
	private Extension extension;
	@Mock
	private ConfigurableWebApplicationContext applicationContext;

	protected static final String[] EXISTING_WEB_CONTEXT_LOCALIZATIONS =
			{ "classpath:/existingWebSpringConfigs1.xml" };
	protected static final String LEGACY_ADD_CONFIG = "classpath:/additionalWebSpringConfigs1.xml, classpath:/additionalWebSpringConfigs2.xml, classpath:/additionalWebSpringConfigs3.xml";
	protected static final String EXT_ADD_CONFIG = "classpath:/core/additionalWebSpringConfigs1.xml, classpath:/core/additionalWebSpringConfigs2.xml, classpath:/core/additionalWebSpringConfigs3.xml";
	protected static final String APP_NAME = "appName";
	protected static final String[] ADDITIONAL_WEB_CONTEXT_LOCALIZATIONS =
			{ "classpath:/existingWebSpringConfigs1.xml", "classpath:/additionalWebSpringConfigs1.xml",
					"classpath:/additionalWebSpringConfigs2.xml", "classpath:/additionalWebSpringConfigs3.xml",
					"classpath:/core/additionalWebSpringConfigs1.xml", "classpath:/core/additionalWebSpringConfigs2.xml",
					"classpath:/core/additionalWebSpringConfigs3.xml" };

	protected static final Map<String, String> dummyConfig = new HashMap<String, String>();

	@Before
	public void setUp()
	{
		dummyConfig.put(APP_NAME + ".additionalWebSpringConfigs", LEGACY_ADD_CONFIG);
		dummyConfig.put(APP_NAME + ".additionalWebSpringConfigs.core", EXT_ADD_CONFIG);

		hybrisContextLoaderListener = new HybrisContextLoaderListener()
		{
			@Override
			protected String readConfigParameter(final String parameterKey)
			{
				if (dummyConfig.containsKey(parameterKey))
				{
					return dummyConfig.get(parameterKey);
				}
				return null;
			}

			@Override
			List<? extends Extension> getExtensions()
			{
				return Arrays.asList(extension);
			}
		};
	}

	@Test
	public void shouldCustomizeContext()
	{
		Mockito.when(extension.getName()).thenReturn("core");
		Mockito.when(servletContext.getServletContextName()).thenReturn(APP_NAME);
		Mockito.when(applicationContext.getConfigLocations()).thenReturn(EXISTING_WEB_CONTEXT_LOCALIZATIONS);

		hybrisContextLoaderListener.customizeContext(servletContext, applicationContext);

		Mockito.verify(applicationContext).setConfigLocations(ADDITIONAL_WEB_CONTEXT_LOCALIZATIONS);
	}


}
