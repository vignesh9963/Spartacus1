/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:10 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class SearchNoResultsEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>SearchNoResultsEvent.searchTerm</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String searchTerm;
	
	public SearchNoResultsEvent()
	{
		super();
	}

	public SearchNoResultsEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setSearchTerm(final String searchTerm)
	{
		this.searchTerm = searchTerm;
	}

	public String getSearchTerm() 
	{
		return searchTerm;
	}
	


}
