/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:56 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationcmsweb.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.Objects;
/**
 * cxCmsActionForContainer details
 */
@ApiModel(value="cxCmsActionForContainer", description="cxCmsActionForContainer details")
public  class CxCmsActionForContainerData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** Catalog name<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.catalog</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="catalog", value="Catalog name") 	
	private String catalog;

	/** Catalog version<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.catalogVersion</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="catalogVersion", value="Catalog version") 	
	private String catalogVersion;

	/** ID of the replacing component<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.newComponentId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="newComponentId", value="ID of the replacing component") 	
	private String newComponentId;

	/** ID of the replaced component<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.oldComponentId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="oldComponentId", value="ID of the replaced component") 	
	private String oldComponentId;

	/** ID of the container<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.containerId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="containerId", value="ID of the container") 	
	private String containerId;

	/** ID of the content slot<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.slotId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="slotId", value="ID of the content slot") 	
	private String slotId;

	/** ID of the variation<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.variationId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="variationId", value="ID of the variation") 	
	private String variationId;

	/** ID of the customization<br/><br/><i>Generated property</i> for <code>CxCmsActionForContainerData.customizationId</code> property defined at extension <code>personalizationcmsweb</code>. */
@ApiModelProperty(name="customizationId", value="ID of the customization") 	
	private String customizationId;
	
	public CxCmsActionForContainerData()
	{
		// default constructor
	}
	
	public void setCatalog(final String catalog)
	{
		this.catalog = catalog;
	}

	public String getCatalog() 
	{
		return catalog;
	}
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	
	public void setNewComponentId(final String newComponentId)
	{
		this.newComponentId = newComponentId;
	}

	public String getNewComponentId() 
	{
		return newComponentId;
	}
	
	public void setOldComponentId(final String oldComponentId)
	{
		this.oldComponentId = oldComponentId;
	}

	public String getOldComponentId() 
	{
		return oldComponentId;
	}
	
	public void setContainerId(final String containerId)
	{
		this.containerId = containerId;
	}

	public String getContainerId() 
	{
		return containerId;
	}
	
	public void setSlotId(final String slotId)
	{
		this.slotId = slotId;
	}

	public String getSlotId() 
	{
		return slotId;
	}
	
	public void setVariationId(final String variationId)
	{
		this.variationId = variationId;
	}

	public String getVariationId() 
	{
		return variationId;
	}
	
	public void setCustomizationId(final String customizationId)
	{
		this.customizationId = customizationId;
	}

	public String getCustomizationId() 
	{
		return customizationId;
	}
	

}