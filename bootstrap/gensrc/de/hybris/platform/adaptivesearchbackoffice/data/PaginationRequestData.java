/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:13 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearchbackoffice.data;

import de.hybris.platform.adaptivesearchbackoffice.data.AbstractSearchRequestData;


import java.util.Objects;
public  class PaginationRequestData extends AbstractSearchRequestData 

{



	/** <i>Generated property</i> for <code>PaginationRequestData.activePage</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
	
	private int activePage;

	/** <i>Generated property</i> for <code>PaginationRequestData.pageSize</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
	
	private int pageSize;
	
	public PaginationRequestData()
	{
		// default constructor
	}
	
	public void setActivePage(final int activePage)
	{
		this.activePage = activePage;
	}

	public int getActivePage() 
	{
		return activePage;
	}
	
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getPageSize() 
	{
		return pageSize;
	}
	

}