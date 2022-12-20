/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:01 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.PageTemplateData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


import java.util.Objects;
/**
 * Specifies a list of available page templates.
 */
@ApiModel(value="PageTemplateListData", description="Specifies a list of available page templates.")
public  class PageTemplateListData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTemplateListData.templates</code> property defined at extension <code>cmswebservices</code>. */
@ApiModelProperty(name="templates") 	
	private List<PageTemplateData> templates;
	
	public PageTemplateListData()
	{
		// default constructor
	}
	
	public void setTemplates(final List<PageTemplateData> templates)
	{
		this.templates = templates;
	}

	public List<PageTemplateData> getTemplates() 
	{
		return templates;
	}
	

}