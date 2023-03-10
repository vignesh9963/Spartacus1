/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.search.restriction.session;

import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.testframework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class SessionSearchRestrictionTest
{
	private static final String BLANK_STRING = "";
	private static final String RESTRICTION_QUERY = "some query";
	private static final String RESTRICTION_CODE = "some code";
	private static final String OTHER_RESTRICTION_CODE = "other code";

	@Mock
	private ComposedTypeModel restrictedType;

	@Mock
	private ComposedTypeModel otherRestrictedType;

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenCodeIsBlank()
	{
		new SessionSearchRestriction(BLANK_STRING, RESTRICTION_QUERY, restrictedType);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenCodeIsNull()
	{
		new SessionSearchRestriction(null, RESTRICTION_QUERY, restrictedType);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenQueryIsBlank()
	{
		new SessionSearchRestriction(RESTRICTION_CODE, BLANK_STRING, restrictedType);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenQueryIsNull()
	{
		new SessionSearchRestriction(RESTRICTION_CODE, null, restrictedType);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenRestrictedTypeIsNull()
	{
		new SessionSearchRestriction(RESTRICTION_CODE, RESTRICTION_QUERY, null);
	}

	@Test
	public void shouldCreateSessionSearchRestrictionObject()
	{
		// when
		final SessionSearchRestriction sessionSearchRestriction = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);

		// then
		assertThat(sessionSearchRestriction.getCode()).isEqualTo(RESTRICTION_CODE);
		assertThat(sessionSearchRestriction.getQuery()).isEqualTo(RESTRICTION_QUERY);
		assertThat(sessionSearchRestriction.getRestrictedType()).isEqualTo(restrictedType);
	}

	@Test
	public void sameCodeAndTypeShouldBeEqual()
	{
		final SessionSearchRestriction sessionSearchRestriction1 = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);
		final SessionSearchRestriction sessionSearchRestriction2 = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);

		Assert.assertEquals(sessionSearchRestriction1, sessionSearchRestriction2);
	}

	@Test
	public void differentCodeShouldNotBeEqual()
	{
		final SessionSearchRestriction sessionSearchRestriction1 = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);
		final SessionSearchRestriction sessionSearchRestriction2 = new SessionSearchRestriction(OTHER_RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);

		Assert.assertNotEquals(sessionSearchRestriction1, sessionSearchRestriction2);
	}

	@Test
	public void differentTypeShouldNotBeEqual()
	{
		final SessionSearchRestriction sessionSearchRestriction1 = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				restrictedType);
		final SessionSearchRestriction sessionSearchRestriction2 = new SessionSearchRestriction(RESTRICTION_CODE,
				RESTRICTION_QUERY,
				otherRestrictedType);

		Assert.assertNotEquals(sessionSearchRestriction1, sessionSearchRestriction2);
	}
}
