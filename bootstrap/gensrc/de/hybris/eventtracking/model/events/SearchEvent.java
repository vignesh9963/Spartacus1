/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:59 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class SearchEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>SearchEvent.searchTerm</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String searchTerm;
	
	public SearchEvent()
	{
		super();
	}

	public SearchEvent(final Serializable source)
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
