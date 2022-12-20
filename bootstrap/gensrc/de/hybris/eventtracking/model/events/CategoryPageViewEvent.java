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

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class CategoryPageViewEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>CategoryPageViewEvent.categoryId</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String categoryId;

	/** <i>Generated property</i> for <code>CategoryPageViewEvent.categoryName</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String categoryName;
	
	public CategoryPageViewEvent()
	{
		super();
	}

	public CategoryPageViewEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setCategoryId(final String categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getCategoryId() 
	{
		return categoryId;
	}
	
	public void setCategoryName(final String categoryName)
	{
		this.categoryName = categoryName;
	}

	public String getCategoryName() 
	{
		return categoryName;
	}
	


}
