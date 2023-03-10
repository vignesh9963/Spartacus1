/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.hac.facade;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.hac.exception.DumpNotAvailableException;

import java.time.Duration;

import org.awaitility.Awaitility;
import org.junit.Assert;
import org.junit.Test;


@UnitTest
public class ThreadDumpCollectorTest
{
	private static final Duration COLLECTING_TIMEOUT = Duration.ofMinutes(10);
	private static final int THREADS_COUNT = 5;
	private static final long GRAB_PERIOD = 100;//millis

	private static ThreadDumpCollector prepareCollector(final int dumps) throws Exception
	{
		final ThreadDumpCollector collector = new ThreadDumpCollector();

		collector.dumpExecutors = 1;
		collector.maxDumps = dumps;
		collector.threadMonitor = new ThreadMonitor();

		collector.afterPropertiesSet(); ///emulate spring
		return collector;
	}

	@Test
	public void testStopCollectionWithoutStart() throws Exception
	{
		final ThreadDumpCollector collector = prepareCollector(1);

		assertThatThrownBy(collector::stopCollecting).isInstanceOf(DumpNotAvailableException.class);
	}

	@Test
	public void testRunTotalDumps() throws Exception
	{
		final ThreadDumpCollector collector = prepareCollector(THREADS_COUNT);

		collector.startCollecting(GRAB_PERIOD);
		waitForCollecting(collector);

		Assert.assertNotNull(collector.stopCollecting());

		final ThreadDumpCollector.DumpResult dataResult = collector.getOrCalculateResult();

		Assert.assertNotNull(dataResult);
		Assert.assertEquals(THREADS_COUNT, dataResult.getTotalFiles());

		final ThreadDumpCollector.DumpResult dataResult2 = collector.getOrCalculateResult();

		Assert.assertNotNull(dataResult2);
		Assert.assertEquals(THREADS_COUNT, dataResult2.getTotalFiles());
	}

	@Test
	public void testRerunStopCollecting() throws Exception
	{
		final ThreadDumpCollector collector = prepareCollector(THREADS_COUNT);

		collector.startCollecting(GRAB_PERIOD); //interval not implemented
		waitForCollecting(collector);

		final Object firstResult = collector.stopCollecting();

		Assert.assertNotNull(firstResult);

		final Object secondResult = collector.stopCollecting();

		Assert.assertNotNull(secondResult);

		Assert.assertSame(firstResult, secondResult);

		final ThreadDumpCollector.DumpResult dataResult = collector.getOrCalculateResult();

		Assert.assertNotNull(dataResult);
		Assert.assertEquals(THREADS_COUNT, dataResult.getTotalFiles());
	}

	@Test
	public void testStartCollectingWithoutStop() throws Exception
	{
		final ThreadDumpCollector collector = prepareCollector(THREADS_COUNT);

		collector.startCollecting(GRAB_PERIOD / 5); //interval not implemented
		Thread.sleep(2 * GRAB_PERIOD);

		collector.startCollecting(GRAB_PERIOD); //interval not implemented
		Thread.sleep(GRAB_PERIOD / 5);

		collector.startCollecting(GRAB_PERIOD); //interval not implemented
		Thread.sleep(GRAB_PERIOD);


		collector.startCollecting(GRAB_PERIOD); //interval not implemented
		waitForCollecting(collector);

		final Object firstResult = collector.stopCollecting();

		Assert.assertNotNull(firstResult);

		final ThreadDumpCollector.DumpResult dataResult = collector.getOrCalculateResult();

		Assert.assertNotNull(dataResult);
		Assert.assertEquals(THREADS_COUNT, dataResult.getTotalFiles());
	}

	@Test
	public void testStartCollectingAfterStop() throws Exception
	{
		final ThreadDumpCollector collector = prepareCollector(THREADS_COUNT);

		assertThatThrownBy(collector::stopCollecting).isInstanceOf(DumpNotAvailableException.class);

		collector.startCollecting(GRAB_PERIOD / 5); //interval not implemented
		Thread.sleep(2 * GRAB_PERIOD);

		collector.startCollecting(GRAB_PERIOD); //interval not implemented
		waitForCollecting(collector);

		final Object firstResult = collector.stopCollecting();

		Assert.assertNotNull(firstResult);

		final ThreadDumpCollector.DumpResult dataResult = collector.getOrCalculateResult();

		Assert.assertNotNull(dataResult);
		Assert.assertEquals(THREADS_COUNT, dataResult.getTotalFiles());
	}

	private void waitForCollecting(final ThreadDumpCollector collector)
	{
		Awaitility.await().atMost(COLLECTING_TIMEOUT).until(() -> !collector.isCollecting());
	}
}
