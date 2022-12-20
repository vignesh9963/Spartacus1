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
import java.util.List;


import java.util.Objects;
public  class CMSComponentTypesForPageSearchData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.pageId</code> property defined at extension <code>cmsfacades</code>. */
	
	private String pageId;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.mask</code> property defined at extension <code>cmsfacades</code>. */
	
	private String mask;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.langIsoCode</code> property defined at extension <code>cmsfacades</code>. */
	
	private String langIsoCode;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.readOnly</code> property defined at extension <code>cmsfacades</code>. */
	
	private boolean readOnly;

	/** <i>Generated property</i> for <code>CMSComponentTypesForPageSearchData.requiredFields</code> property defined at extension <code>cmsfacades</code>. */
	
	private List<String> requiredFields;
	
	public CMSComponentTypesForPageSearchData()
	{
		// default constructor
	}
	
	public void setPageId(final String pageId)
	{
		this.pageId = pageId;
	}

	public String getPageId() 
	{
		return pageId;
	}
	
	public void setMask(final String mask)
	{
		this.mask = mask;
	}

	public String getMask() 
	{
		return mask;
	}
	
	public void setLangIsoCode(final String langIsoCode)
	{
		this.langIsoCode = langIsoCode;
	}

	public String getLangIsoCode() 
	{
		return langIsoCode;
	}
	
	public void setReadOnly(final boolean readOnly)
	{
		this.readOnly = readOnly;
	}

	public boolean isReadOnly() 
	{
		return readOnly;
	}
	
	public void setRequiredFields(final List<String> requiredFields)
	{
		this.requiredFields = requiredFields;
	}

	public List<String> getRequiredFields() 
	{
		return requiredFields;
	}
	

}