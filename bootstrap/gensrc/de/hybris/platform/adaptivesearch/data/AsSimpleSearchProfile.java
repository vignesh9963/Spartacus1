/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:04 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchProfile;
import de.hybris.platform.adaptivesearch.data.AsConfigurableSearchConfiguration;


import java.util.Objects;
public  class AsSimpleSearchProfile extends AbstractAsSearchProfile 

{



	/** <i>Generated property</i> for <code>AsSimpleSearchProfile.searchConfiguration</code> property defined at extension <code>adaptivesearch</code>. */
	
	private AsConfigurableSearchConfiguration searchConfiguration;
	
	public AsSimpleSearchProfile()
	{
		// default constructor
	}
	
	public void setSearchConfiguration(final AsConfigurableSearchConfiguration searchConfiguration)
	{
		this.searchConfiguration = searchConfiguration;
	}

	public AsConfigurableSearchConfiguration getSearchConfiguration() 
	{
		return searchConfiguration;
	}
	

}