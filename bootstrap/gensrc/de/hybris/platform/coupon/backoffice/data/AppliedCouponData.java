/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:10 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.coupon.backoffice.data;

import java.io.Serializable;


import java.util.Objects;
public  class AppliedCouponData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AppliedCouponData.code</code> property defined at extension <code>couponbackoffice</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>AppliedCouponData.name</code> property defined at extension <code>couponbackoffice</code>. */
	
	private String name;
	
	public AppliedCouponData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	

}