/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.jobs;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.cronjob.model.RemoveItemsCronJobModel;
import de.hybris.platform.servicelayer.media.MediaService;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

import org.apache.commons.lang.CharUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;


/**
 * Test covering internal {@link RemovedItemPKProcessor} logic.
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class RemovedItemPKProcessorTest
{

	@Mock
	private MediaService mediaService;

	@Mock
	private RemoveItemsCronJobModel model;

	private RemovedItemPKProcessor iterator;

	@Before
	public void prepare()
	{
		iterator = new RemovedItemPKProcessor();
		iterator.setMediaService(mediaService);
	}


	@Test
	public void testSkipofDeleted()
	{
		final PK one = PK.createFixedUUIDPK(102, 1);
		final PK two = PK.createFixedUUIDPK(102, 2);
		final PK three = PK.createFixedUUIDPK(102, 3);

		final MediaModel mediaPk = new MediaModel();
		final DataInputStream dis = new DataInputStream(buildUpStream(one, two, three));


		Mockito.when(model.getItemPKs()).thenReturn(mediaPk);
		Mockito.when(mediaService.getStreamFromMedia(mediaPk)).thenReturn(dis);
		Mockito.when(model.getItemsDeleted()).thenReturn(Integer.valueOf(10));

		iterator.init(model);

		Assert.assertFalse("All iterations should be skipped ", iterator.hasNext());
	}

	@Test
	public void testSkipofRefused()
	{
		final PK one = PK.createFixedUUIDPK(102, 1);
		final PK two = PK.createFixedUUIDPK(102, 2);
		final PK three = PK.createFixedUUIDPK(102, 3);

		final MediaModel mediaPk = new MediaModel();
		final DataInputStream dis = new DataInputStream(buildUpStream(one, two, three));

		Mockito.when(model.getItemPKs()).thenReturn(mediaPk);
		Mockito.when(mediaService.getStreamFromMedia(mediaPk)).thenReturn(dis);
		Mockito.when(model.getItemsRefused()).thenReturn(Integer.valueOf(10));

		iterator.init(model);

		Assert.assertFalse("All iterations should be skipped ", iterator.hasNext());
	}

	@Test
	public void testSkipofDeletedAndRefused()
	{
		final PK one = PK.createFixedUUIDPK(102, 1);
		final PK two = PK.createFixedUUIDPK(102, 2);
		final PK three = PK.createFixedUUIDPK(102, 3);

		final MediaModel mediaPk = new MediaModel();
		final DataInputStream dis = new DataInputStream(buildUpStream(one, two, three));


		Mockito.when(model.getItemPKs()).thenReturn(mediaPk);
		Mockito.when(mediaService.getStreamFromMedia(mediaPk)).thenReturn(dis);
		Mockito.when(model.getItemsRefused()).thenReturn(Integer.valueOf(2));
		Mockito.when(model.getItemsDeleted()).thenReturn(Integer.valueOf(2));

		iterator.init(model);

		Assert.assertFalse("All iterations should be skipped ", iterator.hasNext());
	}

	@Test
	public void testAllIterated()
	{
		final PK one = PK.createFixedUUIDPK(102, 1);
		final PK two = PK.createFixedUUIDPK(102, 2);
		final PK three = PK.createFixedUUIDPK(102, 3);

		final MediaModel mediaPk = new MediaModel();
		final DataInputStream dis = new DataInputStream(buildUpStream(one, two, three));

		Mockito.when(model.getItemPKs()).thenReturn(mediaPk);
		Mockito.when(mediaService.getStreamFromMedia(mediaPk)).thenReturn(dis);

		iterator.init(model);

		Assert.assertTrue("Not all iterations should be skipped ", iterator.hasNext());
		Assert.assertEquals("Should  return first element ", one, iterator.next());
		Assert.assertTrue("Not all iterations should be skipped ", iterator.hasNext());
		Assert.assertEquals("Should  return second element ", two, iterator.next());
		Assert.assertTrue("Not all iterations should be skipped ", iterator.hasNext());
		Assert.assertEquals("Should  return third element ", three, iterator.next());
		Assert.assertFalse("Now all iterations should be skipped ", iterator.hasNext());
	}

	@Test
	public void testNotAllSkipofDeletedAndRefused()
	{
		final PK one = PK.createFixedUUIDPK(102, 1);
		final PK two = PK.createFixedUUIDPK(102, 2);
		final PK three = PK.createFixedUUIDPK(102, 3);

		final MediaModel mediaPk = new MediaModel();
		final DataInputStream dis = new DataInputStream(buildUpStream(one, two, three));

		Mockito.when(model.getItemPKs()).thenReturn(mediaPk);
		Mockito.when(mediaService.getStreamFromMedia(mediaPk)).thenReturn(dis);
		Mockito.when(model.getItemsRefused()).thenReturn(Integer.valueOf(1));
		Mockito.when(model.getItemsDeleted()).thenReturn(Integer.valueOf(1));

		iterator.init(model);

		Assert.assertTrue("Not all iterations should be skipped ", iterator.hasNext());
		Assert.assertEquals("Should only return last element ", three, iterator.next());
		Assert.assertFalse("Now all iterations should be skipped ", iterator.hasNext());
	}

	private InputStream buildUpStream(final Object... args)
	{
		//ByteInputStream  bis = new ByteInputStream();
		final StringBuilder builder = new StringBuilder(1000);
		for (final Object arg : args)
		{
			builder.append(arg).append(CharUtils.CR);
		}
		return new ByteArrayInputStream(builder.toString().getBytes());
	}
}
