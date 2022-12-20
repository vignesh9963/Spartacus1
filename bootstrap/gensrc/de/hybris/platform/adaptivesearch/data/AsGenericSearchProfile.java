/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:13 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchProfile;
import de.hybris.platform.adaptivesearch.data.AsConfigurableSearchConfiguration;
import de.hybris.platform.adaptivesearch.data.AsReference;
import java.util.Map;


import java.util.Objects;
public  class AsGenericSearchProfile extends AbstractAsSearchProfile 

{



	/** <i>Generated property</i> for <code>AsGenericSearchProfile.qualifierType</code> property defined at extension <code>adaptivesearch</code>. */
	
	private String qualifierType;

	/** <i>Generated property</i> for <code>AsGenericSearchProfile.availableSearchConfigurations</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Map<String,AsReference> availableSearchConfigurations;

	/** <i>Generated property</i> for <code>AsGenericSearchProfile.searchConfigurations</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Map<String,AsConfigurableSearchConfiguration> searchConfigurations;
	
	public AsGenericSearchProfile()
	{
		// default constructor
	}
	
	public void setQualifierType(final String qualifierType)
	{
		this.qualifierType = qualifierType;
	}

	public String getQualifierType() 
	{
		return qualifierType;
	}
	
	public void setAvailableSearchConfigurations(final Map<String,AsReference> availableSearchConfigurations)
	{
		this.availableSearchConfigurations = availableSearchConfigurations;
	}

	public Map<String,AsReference> getAvailableSearchConfigurations() 
	{
		return availableSearchConfigurations;
	}
	
	public void setSearchConfigurations(final Map<String,AsConfigurableSearchConfiguration> searchConfigurations)
	{
		this.searchConfigurations = searchConfigurations;
	}

	public Map<String,AsConfigurableSearchConfiguration> getSearchConfigurations() 
	{
		return searchConfigurations;
	}
	

}