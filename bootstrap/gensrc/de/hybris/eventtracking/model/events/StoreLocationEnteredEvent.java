/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:03 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class StoreLocationEnteredEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>StoreLocationEnteredEvent.postcode</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String postcode;
	
	public StoreLocationEnteredEvent()
	{
		super();
	}

	public StoreLocationEnteredEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setPostcode(final String postcode)
	{
		this.postcode = postcode;
	}

	public String getPostcode() 
	{
		return postcode;
	}
	


}
