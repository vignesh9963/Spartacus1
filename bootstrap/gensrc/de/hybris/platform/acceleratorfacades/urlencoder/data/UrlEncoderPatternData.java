/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:57 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorfacades.urlencoder.data;

import java.io.Serializable;


import java.util.Objects;
public  class UrlEncoderPatternData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UrlEncoderPatternData.pattern</code> property defined at extension <code>acceleratorfacades</code>. */
	
	private String pattern;

	/** <i>Generated property</i> for <code>UrlEncoderPatternData.redirectRequired</code> property defined at extension <code>acceleratorfacades</code>. */
	
	private boolean redirectRequired;
	
	public UrlEncoderPatternData()
	{
		// default constructor
	}
	
	public void setPattern(final String pattern)
	{
		this.pattern = pattern;
	}

	public String getPattern() 
	{
		return pattern;
	}
	
	public void setRedirectRequired(final boolean redirectRequired)
	{
		this.redirectRequired = redirectRequired;
	}

	public boolean isRedirectRequired() 
	{
		return redirectRequired;
	}
	

}