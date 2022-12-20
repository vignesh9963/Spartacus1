/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:09 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.searchprovidercssearchservices.search.data;

import de.hybris.platform.searchprovidercssearchservices.search.data.AbstractBucketsFacetRequestDTO;
import de.hybris.platform.searchprovidercssearchservices.search.data.RangeBucketRequestDTO;
import java.util.List;


import java.util.Objects;
public  class RangeBucketsFacetRequestDTO extends AbstractBucketsFacetRequestDTO 

{



	/** <i>Generated property</i> for <code>RangeBucketsFacetRequestDTO.includeFrom</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private Boolean includeFrom;

	/** <i>Generated property</i> for <code>RangeBucketsFacetRequestDTO.includeTo</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private Boolean includeTo;

	/** <i>Generated property</i> for <code>RangeBucketsFacetRequestDTO.buckets</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private List<RangeBucketRequestDTO> buckets;
	
	public RangeBucketsFacetRequestDTO()
	{
		// default constructor
	}
	
	public void setIncludeFrom(final Boolean includeFrom)
	{
		this.includeFrom = includeFrom;
	}

	public Boolean getIncludeFrom() 
	{
		return includeFrom;
	}
	
	public void setIncludeTo(final Boolean includeTo)
	{
		this.includeTo = includeTo;
	}

	public Boolean getIncludeTo() 
	{
		return includeTo;
	}
	
	public void setBuckets(final List<RangeBucketRequestDTO> buckets)
	{
		this.buckets = buckets;
	}

	public List<RangeBucketRequestDTO> getBuckets() 
	{
		return buckets;
	}
	

}