/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:02 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.smartedit.dto;

import java.io.Serializable;


import java.util.Objects;
public  class SSOCredentials  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SSOCredentials.client_id</code> property defined at extension <code>smartedit</code>. */
	
	private String client_id;
	
	public SSOCredentials()
	{
		// default constructor
	}
	
	public void setClient_id(final String client_id)
	{
		this.client_id = client_id;
	}

	public String getClient_id() 
	{
		return client_id;
	}
	

}