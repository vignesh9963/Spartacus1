/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:09 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractProductAwareTrackingEvent;

public  class ProductMediaViewEvent extends AbstractProductAwareTrackingEvent 
{


	/** <i>Generated property</i> for <code>ProductMediaViewEvent.productMediaType</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String productMediaType;
	
	public ProductMediaViewEvent()
	{
		super();
	}

	public ProductMediaViewEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setProductMediaType(final String productMediaType)
	{
		this.productMediaType = productMediaType;
	}

	public String getProductMediaType() 
	{
		return productMediaType;
	}
	


}
