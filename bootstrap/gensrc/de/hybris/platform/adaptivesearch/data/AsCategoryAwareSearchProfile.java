/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:12 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchProfile;
import de.hybris.platform.adaptivesearch.data.AsConfigurableSearchConfiguration;
import de.hybris.platform.core.PK;
import java.util.Map;


import java.util.Objects;
public  class AsCategoryAwareSearchProfile extends AbstractAsSearchProfile 

{



	/** <i>Generated property</i> for <code>AsCategoryAwareSearchProfile.searchConfigurations</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Map<PK,AsConfigurableSearchConfiguration> searchConfigurations;
	
	public AsCategoryAwareSearchProfile()
	{
		// default constructor
	}
	
	public void setSearchConfigurations(final Map<PK,AsConfigurableSearchConfiguration> searchConfigurations)
	{
		this.searchConfigurations = searchConfigurations;
	}

	public Map<PK,AsConfigurableSearchConfiguration> getSearchConfigurations() 
	{
		return searchConfigurations;
	}
	

}