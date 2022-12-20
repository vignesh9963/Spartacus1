/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:11 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.facetdata;

import java.io.Serializable;


import java.util.Objects;
/**
 * POJO representing a spell checker suggestion.
 */
public  class SpellingSuggestionData<STATE>  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SpellingSuggestionData<STATE>.suggestion</code> property defined at extension <code>commerceservices</code>. */
	
	private String suggestion;

	/** <i>Generated property</i> for <code>SpellingSuggestionData<STATE>.query</code> property defined at extension <code>commerceservices</code>. */
	
	private STATE query;
	
	public SpellingSuggestionData()
	{
		// default constructor
	}
	
	public void setSuggestion(final String suggestion)
	{
		this.suggestion = suggestion;
	}

	public String getSuggestion() 
	{
		return suggestion;
	}
	
	public void setQuery(final STATE query)
	{
		this.query = query;
	}

	public STATE getQuery() 
	{
		return query;
	}
	

}