/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.cronjob;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.cluster.legacy.LegacyBroadcastHandler;
import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.cluster.ClusterService;
import de.hybris.platform.servicelayer.cronjob.impl.DefaultRunCronJobMessageCreatorAndSender;
import de.hybris.platform.servicelayer.tenant.TenantService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Test covering the {@link RunCronJobMessageCreatorAndSender} logic.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class DefaultRunCronJobMessageCreatorAndSenderTest
{

	@Mock
	private ClusterService clusterService;

	@Mock
	private TenantService tenantService;

	@Mock
	private LegacyBroadcastHandler legacyBroadcastHandler;


	private RunCronJobMessageCreatorAndSender messageCreator;


	@Before
	public void setUp()
	{
		messageCreator = new DefaultRunCronJobMessageCreatorAndSender();

		((DefaultRunCronJobMessageCreatorAndSender) messageCreator).setLegacyBroadcastHandler(legacyBroadcastHandler);
		((DefaultRunCronJobMessageCreatorAndSender) messageCreator).setTenantService(tenantService);
		((DefaultRunCronJobMessageCreatorAndSender) messageCreator).setClusterService(clusterService);
	}

	@Test
	public void testCreateAndSendMessage()
	{

		final Long shutterIsland = Long.valueOf(110101);
		final Integer someCluster = Integer.valueOf(127);
		final String tenantName = "giTenant";

		final PK somePk = PK.createFixedUUIDPK(102, System.currentTimeMillis());

		final Integer remoteClusterId = Integer.valueOf(10212);

		Mockito.when(Integer.valueOf(clusterService.getClusterId())).thenReturn(someCluster);
		Mockito.when(Long.valueOf(clusterService.getClusterIslandId())).thenReturn(shutterIsland);
		Mockito.when(tenantService.getCurrentTenantId()).thenReturn(tenantName);

		messageCreator.createAndSendMessage(remoteClusterId.intValue(), somePk);

		Mockito.verify(legacyBroadcastHandler, Mockito.times(1)).sendCustomPacket("CRONJOB_" + shutterIsland,
				"START|" + someCluster + "|" + remoteClusterId + "|" + tenantName + "|" + somePk
						.toString());


	}
}
