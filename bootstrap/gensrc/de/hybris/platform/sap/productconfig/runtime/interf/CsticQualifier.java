/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:52 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.productconfig.runtime.interf;

import java.io.Serializable;


import java.util.Objects;
public  class CsticQualifier  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CsticQualifier.instanceId</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String instanceId;

	/** <i>Generated property</i> for <code>CsticQualifier.instanceName</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String instanceName;

	/** <i>Generated property</i> for <code>CsticQualifier.groupName</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String groupName;

	/** <i>Generated property</i> for <code>CsticQualifier.csticName</code> property defined at extension <code>sapproductconfigruntimeinterface</code>. */
	
	private String csticName;
	
	public CsticQualifier()
	{
		// default constructor
	}
	
	public void setInstanceId(final String instanceId)
	{
		this.instanceId = instanceId;
	}

	public String getInstanceId() 
	{
		return instanceId;
	}
	
	public void setInstanceName(final String instanceName)
	{
		this.instanceName = instanceName;
	}

	public String getInstanceName() 
	{
		return instanceName;
	}
	
	public void setGroupName(final String groupName)
	{
		this.groupName = groupName;
	}

	public String getGroupName() 
	{
		return groupName;
	}
	
	public void setCsticName(final String csticName)
	{
		this.csticName = csticName;
	}

	public String getCsticName() 
	{
		return csticName;
	}
	

}