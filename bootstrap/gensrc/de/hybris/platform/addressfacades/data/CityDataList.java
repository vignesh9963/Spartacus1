/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:02 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.addressfacades.data;

import java.io.Serializable;
import de.hybris.platform.addressfacades.data.CityData;
import java.util.List;


import java.util.Objects;
public  class CityDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CityDataList.cities</code> property defined at extension <code>chineseaddressfacades</code>. */
	
	private List<CityData> cities;
	
	public CityDataList()
	{
		// default constructor
	}
	
	public void setCities(final List<CityData> cities)
	{
		this.cities = cities;
	}

	public List<CityData> getCities() 
	{
		return cities;
	}
	

}