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

public  class AbstractProductAwareTrackingEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>AbstractProductAwareTrackingEvent.productId</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String productId;

	/** <i>Generated property</i> for <code>AbstractProductAwareTrackingEvent.productName</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String productName;
	
	public AbstractProductAwareTrackingEvent()
	{
		super();
	}

	public AbstractProductAwareTrackingEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setProductId(final String productId)
	{
		this.productId = productId;
	}

	public String getProductId() 
	{
		return productId;
	}
	
	public void setProductName(final String productName)
	{
		this.productName = productName;
	}

	public String getProductName() 
	{
		return productName;
	}
	


}
