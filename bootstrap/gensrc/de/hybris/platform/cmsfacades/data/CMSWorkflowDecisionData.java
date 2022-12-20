/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:09 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.Map;


import java.util.Objects;
public  class CMSWorkflowDecisionData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowDecisionData.code</code> property defined at extension <code>cmsfacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>CMSWorkflowDecisionData.name</code> property defined at extension <code>cmsfacades</code>. */
	
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>CMSWorkflowDecisionData.description</code> property defined at extension <code>cmsfacades</code>. */
	
	private Map<String,String> description;
	
	public CMSWorkflowDecisionData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final Map<String,String> name)
	{
		this.name = name;
	}

	public Map<String,String> getName() 
	{
		return name;
	}
	
	public void setDescription(final Map<String,String> description)
	{
		this.description = description;
	}

	public Map<String,String> getDescription() 
	{
		return description;
	}
	

}