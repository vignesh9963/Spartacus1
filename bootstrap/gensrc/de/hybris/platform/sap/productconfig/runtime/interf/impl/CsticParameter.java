/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:07 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.productconfig.runtime.interf.impl;

import java.io.Serializable;


import java.util.Objects;
public  class CsticParameter  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** Characteristic name<br/><br/><i>Generated property</i> for <code>CsticParameter.csticName</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String csticName;

	/** Language dependent characteristic description<br/><br/><i>Generated property</i> for <code>CsticParameter.csticDescription</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String csticDescription;
	
	public CsticParameter()
	{
		// default constructor
	}
	
	public void setCsticName(final String csticName)
	{
		this.csticName = csticName;
	}

	public String getCsticName() 
	{
		return csticName;
	}
	
	public void setCsticDescription(final String csticDescription)
	{
		this.csticDescription = csticDescription;
	}

	public String getCsticDescription() 
	{
		return csticDescription;
	}
	

}