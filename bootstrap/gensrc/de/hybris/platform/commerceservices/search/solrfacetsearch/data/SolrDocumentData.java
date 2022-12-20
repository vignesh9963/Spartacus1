/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:09 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

import java.io.Serializable;


import java.util.Objects;
public  class SolrDocumentData<SEARCH_QUERY_TYPE, SOLR_DOCUMENT_TYPE>  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SolrDocumentData<SEARCH_QUERY_TYPE, SOLR_DOCUMENT_TYPE>.searchQuery</code> property defined at extension <code>commerceservices</code>. */
	
	private SEARCH_QUERY_TYPE searchQuery;

	/** <i>Generated property</i> for <code>SolrDocumentData<SEARCH_QUERY_TYPE, SOLR_DOCUMENT_TYPE>.solrDocument</code> property defined at extension <code>commerceservices</code>. */
	
	private SOLR_DOCUMENT_TYPE solrDocument;
	
	public SolrDocumentData()
	{
		// default constructor
	}
	
	public void setSearchQuery(final SEARCH_QUERY_TYPE searchQuery)
	{
		this.searchQuery = searchQuery;
	}

	public SEARCH_QUERY_TYPE getSearchQuery() 
	{
		return searchQuery;
	}
	
	public void setSolrDocument(final SOLR_DOCUMENT_TYPE solrDocument)
	{
		this.solrDocument = solrDocument;
	}

	public SOLR_DOCUMENT_TYPE getSolrDocument() 
	{
		return solrDocument;
	}
	

}