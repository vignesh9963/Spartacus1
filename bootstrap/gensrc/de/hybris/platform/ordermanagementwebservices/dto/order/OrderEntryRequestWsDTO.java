/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:57 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementwebservices.dto.order;

import java.io.Serializable;


import java.util.Objects;
public  class OrderEntryRequestWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.entryNumber</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private String entryNumber;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.quantity</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private Long quantity;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.unitCode</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private String unitCode;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.productCode</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.deliveryModeCode</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private String deliveryModeCode;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.deliveryPointOfService</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private String deliveryPointOfService;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.basePrice</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private double basePrice;

	/** <i>Generated property</i> for <code>OrderEntryRequestWsDTO.totalPrice</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private double totalPrice;
	
	public OrderEntryRequestWsDTO()
	{
		// default constructor
	}
	
	public void setEntryNumber(final String entryNumber)
	{
		this.entryNumber = entryNumber;
	}

	public String getEntryNumber() 
	{
		return entryNumber;
	}
	
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}

	public Long getQuantity() 
	{
		return quantity;
	}
	
	public void setUnitCode(final String unitCode)
	{
		this.unitCode = unitCode;
	}

	public String getUnitCode() 
	{
		return unitCode;
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setDeliveryModeCode(final String deliveryModeCode)
	{
		this.deliveryModeCode = deliveryModeCode;
	}

	public String getDeliveryModeCode() 
	{
		return deliveryModeCode;
	}
	
	public void setDeliveryPointOfService(final String deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}

	public String getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
	
	public void setBasePrice(final double basePrice)
	{
		this.basePrice = basePrice;
	}

	public double getBasePrice() 
	{
		return basePrice;
	}
	
	public void setTotalPrice(final double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public double getTotalPrice() 
	{
		return totalPrice;
	}
	

}