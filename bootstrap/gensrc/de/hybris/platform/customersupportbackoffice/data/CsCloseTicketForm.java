/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:52 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customersupportbackoffice.data;

import java.io.Serializable;
import de.hybris.platform.ticket.enums.CsResolutionType;


import java.util.Objects;
public  class CsCloseTicketForm  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CsCloseTicketForm.resolution</code> property defined at extension <code>customersupportbackoffice</code>. */
	
	private CsResolutionType resolution;

	/** <i>Generated property</i> for <code>CsCloseTicketForm.message</code> property defined at extension <code>customersupportbackoffice</code>. */
	
	private String message;
	
	public CsCloseTicketForm()
	{
		// default constructor
	}
	
	public void setResolution(final CsResolutionType resolution)
	{
		this.resolution = resolution;
	}

	public CsResolutionType getResolution() 
	{
		return resolution;
	}
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}
	

}