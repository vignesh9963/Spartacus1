/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:00 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousingfacades.asn.data;

import java.io.Serializable;


import java.util.Objects;
public  class AsnEntryData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsnEntryData.productCode</code> property defined at extension <code>warehousingfacades</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>AsnEntryData.quantity</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Integer quantity;
	
	public AsnEntryData()
	{
		// default constructor
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
	}

	public Integer getQuantity() 
	{
		return quantity;
	}
	

}