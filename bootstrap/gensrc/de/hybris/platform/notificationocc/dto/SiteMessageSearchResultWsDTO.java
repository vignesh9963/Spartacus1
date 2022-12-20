/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:53:55 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.notificationocc.dto;

import java.io.Serializable;
import de.hybris.platform.notificationocc.dto.SiteMessageWsDTO;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import de.hybris.platform.webservicescommons.dto.SortWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


import java.util.Objects;
/**
 * Site message search result
 */
@ApiModel(value="siteMessageSearchResult", description="Site message search result")
public  class SiteMessageSearchResultWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** site messages<br/><br/><i>Generated property</i> for <code>SiteMessageSearchResultWsDTO.messages</code> property defined at extension <code>notificationocc</code>. */
@ApiModelProperty(name="messages", value="site messages") 	
	private List<SiteMessageWsDTO> messages;

	/** sorting information<br/><br/><i>Generated property</i> for <code>SiteMessageSearchResultWsDTO.sorts</code> property defined at extension <code>notificationocc</code>. */
@ApiModelProperty(name="sorts", value="sorting information") 	
	private List<SortWsDTO> sorts;

	/** pagination information<br/><br/><i>Generated property</i> for <code>SiteMessageSearchResultWsDTO.pagination</code> property defined at extension <code>notificationocc</code>. */
@ApiModelProperty(name="pagination", value="pagination information") 	
	private PaginationWsDTO pagination;
	
	public SiteMessageSearchResultWsDTO()
	{
		// default constructor
	}
	
	public void setMessages(final List<SiteMessageWsDTO> messages)
	{
		this.messages = messages;
	}

	public List<SiteMessageWsDTO> getMessages() 
	{
		return messages;
	}
	
	public void setSorts(final List<SortWsDTO> sorts)
	{
		this.sorts = sorts;
	}

	public List<SortWsDTO> getSorts() 
	{
		return sorts;
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