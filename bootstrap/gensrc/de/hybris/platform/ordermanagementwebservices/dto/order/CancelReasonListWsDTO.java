/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:06 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementwebservices.dto.order;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class CancelReasonListWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CancelReasonListWsDTO.reasons</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private List<String> reasons;
	
	public CancelReasonListWsDTO()
	{
		// default constructor
	}
	
	public void setReasons(final List<String> reasons)
	{
		this.reasons = reasons;
	}

	public List<String> getReasons() 
	{
		return reasons;
	}
	

}