/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:59 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.storelocator.data;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class WarehouseCodesDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>WarehouseCodesDataList.codes</code> property defined at extension <code>warehousingfacades</code>. */
	
	private List<String> codes;
	
	public WarehouseCodesDataList()
	{
		// default constructor
	}
	
	public void setCodes(final List<String> codes)
	{
		this.codes = codes;
	}

	public List<String> getCodes() 
	{
		return codes;
	}
	

}