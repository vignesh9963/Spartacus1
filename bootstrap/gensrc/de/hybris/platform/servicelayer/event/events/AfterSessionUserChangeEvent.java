/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:59 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.event.events;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public  class AfterSessionUserChangeEvent  extends AbstractEvent 
{


	/** <i>Generated property</i> for <code>AfterSessionUserChangeEvent.previousUserUID</code> property defined at extension <code>core</code>. */
	
	private String previousUserUID;
	
	public AfterSessionUserChangeEvent()
	{
		super();
	}

	public AfterSessionUserChangeEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setPreviousUserUID(final String previousUserUID)
	{
		this.previousUserUID = previousUserUID;
	}

	public String getPreviousUserUID() 
	{
		return previousUserUID;
	}
	


}
