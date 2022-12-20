/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:11 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsDocumentData;
import de.hybris.platform.core.PK;
import java.util.List;
import java.util.Map;
import java.util.Set;


import java.util.Objects;
public  class AsDocumentData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsDocumentData.id</code> property defined at extension <code>adaptivesearch</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>AsDocumentData.score</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Float score;

	/** <i>Generated property</i> for <code>AsDocumentData.pk</code> property defined at extension <code>adaptivesearch</code>. */
	
	private PK pk;

	/** <i>Generated property</i> for <code>AsDocumentData.fields</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Map<String,Object> fields;

	/** <i>Generated property</i> for <code>AsDocumentData.tags</code> property defined at extension <code>adaptivesearch</code>. */
	
	private Set<String> tags;

	/** <i>Generated property</i> for <code>AsDocumentData.innerDocuments</code> property defined at extension <code>adaptivesearch</code>. */
	
	private List<AsDocumentData> innerDocuments;
	
	public AsDocumentData()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setScore(final Float score)
	{
		this.score = score;
	}

	public Float getScore() 
	{
		return score;
	}
	
	public void setPk(final PK pk)
	{
		this.pk = pk;
	}

	public PK getPk() 
	{
		return pk;
	}
	
	public void setFields(final Map<String,Object> fields)
	{
		this.fields = fields;
	}

	public Map<String,Object> getFields() 
	{
		return fields;
	}
	
	public void setTags(final Set<String> tags)
	{
		this.tags = tags;
	}

	public Set<String> getTags() 
	{
		return tags;
	}
	
	public void setInnerDocuments(final List<AsDocumentData> innerDocuments)
	{
		this.innerDocuments = innerDocuments;
	}

	public List<AsDocumentData> getInnerDocuments() 
	{
		return innerDocuments;
	}
	

}