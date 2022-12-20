/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:01 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.dto;

import java.io.Serializable;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


import java.util.Objects;
/**
 * DTO which serves as a wrapper object that contains a list of CategoryData
 */
@ApiModel(value="CategorySearchResultWsDTO", description="DTO which serves as a wrapper object that contains a list of CategoryData")
public  class CategorySearchResultWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CategorySearchResultWsDTO.productCategories</code> property defined at extension <code>cmssmarteditwebservices</code>. */
@ApiModelProperty(name="productCategories") 	
	private List<CategoryWsDTO> productCategories;

	/** <i>Generated property</i> for <code>CategorySearchResultWsDTO.pagination</code> property defined at extension <code>cmssmarteditwebservices</code>. */
@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;
	
	public CategorySearchResultWsDTO()
	{
		// default constructor
	}
	
	public void setProductCategories(final List<CategoryWsDTO> productCategories)
	{
		this.productCategories = productCategories;
	}

	public List<CategoryWsDTO> getProductCategories() 
	{
		return productCategories;
	}
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	

}