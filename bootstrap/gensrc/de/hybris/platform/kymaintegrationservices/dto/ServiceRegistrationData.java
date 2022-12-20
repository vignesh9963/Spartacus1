/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:03 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.kymaintegrationservices.dto.ApiSpecificationData;
import de.hybris.platform.kymaintegrationservices.dto.EventsSpecificationData;


import java.util.Objects;
@JsonInclude(JsonInclude.Include.NON_NULL)
public  class ServiceRegistrationData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.provider</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("provider") 	
	private String provider;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.name</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("name") 	
	private String name;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.description</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("description") 	
	private String description;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.api</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("api") 	
	private ApiSpecificationData api;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.events</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("events") 	
	private EventsSpecificationData events;

	/** <i>Generated property</i> for <code>ServiceRegistrationData.identifier</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("identifier") 	
	private String identifier;
	
	public ServiceRegistrationData()
	{
		// default constructor
	}
	
@JsonProperty("provider") 	public void setProvider(final String provider)
	{
		this.provider = provider;
	}

@JsonProperty("provider") 	public String getProvider() 
	{
		return provider;
	}
	
@JsonProperty("name") 	public void setName(final String name)
	{
		this.name = name;
	}

@JsonProperty("name") 	public String getName() 
	{
		return name;
	}
	
@JsonProperty("description") 	public void setDescription(final String description)
	{
		this.description = description;
	}

@JsonProperty("description") 	public String getDescription() 
	{
		return description;
	}
	
@JsonProperty("api") 	public void setApi(final ApiSpecificationData api)
	{
		this.api = api;
	}

@JsonProperty("api") 	public ApiSpecificationData getApi() 
	{
		return api;
	}
	
@JsonProperty("events") 	public void setEvents(final EventsSpecificationData events)
	{
		this.events = events;
	}

@JsonProperty("events") 	public EventsSpecificationData getEvents() 
	{
		return events;
	}
	
@JsonProperty("identifier") 	public void setIdentifier(final String identifier)
	{
		this.identifier = identifier;
	}

@JsonProperty("identifier") 	public String getIdentifier() 
	{
		return identifier;
	}
	

}