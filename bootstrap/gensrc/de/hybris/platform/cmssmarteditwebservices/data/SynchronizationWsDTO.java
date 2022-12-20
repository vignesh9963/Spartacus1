/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:10 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


import java.util.Objects;
@ApiModel(value="SynchronizationWsDTO")
public  class SynchronizationWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SynchronizationWsDTO.items</code> property defined at extension <code>cmssmarteditwebservices</code>. */
@ApiModelProperty(name="items") 	
	private List<ItemSynchronizationWsDTO> items;
	
	public SynchronizationWsDTO()
	{
		// default constructor
	}
	
	public void setItems(final List<ItemSynchronizationWsDTO> items)
	{
		this.items = items;
	}

	public List<ItemSynchronizationWsDTO> getItems() 
	{
		return items;
	}
	

}