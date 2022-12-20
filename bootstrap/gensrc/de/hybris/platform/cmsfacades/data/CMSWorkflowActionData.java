/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:07 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;


import java.util.Objects;
public  class CMSWorkflowActionData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.code</code> property defined at extension <code>cmsfacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.name</code> property defined at extension <code>cmsfacades</code>. */
	
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.description</code> property defined at extension <code>cmsfacades</code>. */
	
	private Map<String,String> description;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.actionType</code> property defined at extension <code>cmsfacades</code>. */
	
	private String actionType;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.status</code> property defined at extension <code>cmsfacades</code>. */
	
	private String status;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.isCurrentUserParticipant</code> property defined at extension <code>cmsfacades</code>. */
	
	private boolean isCurrentUserParticipant;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.startedAgoInMillis</code> property defined at extension <code>cmsfacades</code>. */
	
	private Long startedAgoInMillis;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.decisions</code> property defined at extension <code>cmsfacades</code>. */
	
	private List<CMSWorkflowDecisionData> decisions;

	/** <i>Generated property</i> for <code>CMSWorkflowActionData.modifiedtime</code> property defined at extension <code>cmsfacades</code>. */
	
	private Date modifiedtime;
	
	public CMSWorkflowActionData()
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
	
	public void setActionType(final String actionType)
	{
		this.actionType = actionType;
	}

	public String getActionType() 
	{
		return actionType;
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setIsCurrentUserParticipant(final boolean isCurrentUserParticipant)
	{
		this.isCurrentUserParticipant = isCurrentUserParticipant;
	}

	public boolean isIsCurrentUserParticipant() 
	{
		return isCurrentUserParticipant;
	}
	
	public void setStartedAgoInMillis(final Long startedAgoInMillis)
	{
		this.startedAgoInMillis = startedAgoInMillis;
	}

	public Long getStartedAgoInMillis() 
	{
		return startedAgoInMillis;
	}
	
	public void setDecisions(final List<CMSWorkflowDecisionData> decisions)
	{
		this.decisions = decisions;
	}

	public List<CMSWorkflowDecisionData> getDecisions() 
	{
		return decisions;
	}
	
	public void setModifiedtime(final Date modifiedtime)
	{
		this.modifiedtime = modifiedtime;
	}

	public Date getModifiedtime() 
	{
		return modifiedtime;
	}
	

}