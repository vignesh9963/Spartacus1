/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:55 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.service.data;

import java.io.Serializable;
import java.math.BigDecimal;


import java.util.Objects;
public  class CommerceTaxEstimateResult  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** the total tax<br/><br/><i>Generated property</i> for <code>CommerceTaxEstimateResult.tax</code> property defined at extension <code>commerceservices</code>. */
	
	private BigDecimal tax;
	
	public CommerceTaxEstimateResult()
	{
		// default constructor
	}
	
	public void setTax(final BigDecimal tax)
	{
		this.tax = tax;
	}

	public BigDecimal getTax() 
	{
		return tax;
	}
	

}