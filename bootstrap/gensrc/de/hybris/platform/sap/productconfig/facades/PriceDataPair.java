/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:57 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.productconfig.facades;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PriceData;


import java.util.Objects;
public  class PriceDataPair  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PriceDataPair.priceValue</code> property defined at extension <code>sapproductconfigfacades</code>. */
	
	private PriceData priceValue;

	/** <i>Generated property</i> for <code>PriceDataPair.obsoletePriceValue</code> property defined at extension <code>sapproductconfigfacades</code>. */
	
	private PriceData obsoletePriceValue;
	
	public PriceDataPair()
	{
		// default constructor
	}
	
	public void setPriceValue(final PriceData priceValue)
	{
		this.priceValue = priceValue;
	}

	public PriceData getPriceValue() 
	{
		return priceValue;
	}
	
	public void setObsoletePriceValue(final PriceData obsoletePriceValue)
	{
		this.obsoletePriceValue = obsoletePriceValue;
	}

	public PriceData getObsoletePriceValue() 
	{
		return obsoletePriceValue;
	}
	

}