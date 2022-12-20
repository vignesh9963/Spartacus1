/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:03 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.timedaccesspromotionenginefacades.flashbuycoupon.data;

import de.hybris.platform.commercefacades.coupon.data.CouponData;


import java.util.Objects;
public  class FlashBuyCouponData extends CouponData 

{



	/** <i>Generated property</i> for <code>FlashBuyCouponData.rule</code> property defined at extension <code>timedaccesspromotionenginefacades</code>. */
	
	private String rule;

	/** <i>Generated property</i> for <code>FlashBuyCouponData.maxProductQuantityPerOrder</code> property defined at extension <code>timedaccesspromotionenginefacades</code>. */
	
	private Integer maxProductQuantityPerOrder;
	
	public FlashBuyCouponData()
	{
		// default constructor
	}
	
	public void setRule(final String rule)
	{
		this.rule = rule;
	}

	public String getRule() 
	{
		return rule;
	}
	
	public void setMaxProductQuantityPerOrder(final Integer maxProductQuantityPerOrder)
	{
		this.maxProductQuantityPerOrder = maxProductQuantityPerOrder;
	}

	public Integer getMaxProductQuantityPerOrder() 
	{
		return maxProductQuantityPerOrder;
	}
	

}