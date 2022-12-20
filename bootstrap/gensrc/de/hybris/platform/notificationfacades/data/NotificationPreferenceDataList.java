/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:00 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.notificationfacades.data;

import java.io.Serializable;
import de.hybris.platform.notificationfacades.data.NotificationPreferenceData;
import java.util.List;


import java.util.Objects;
public  class NotificationPreferenceDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NotificationPreferenceDataList.preferences</code> property defined at extension <code>notificationfacades</code>. */
	
	private List<NotificationPreferenceData> preferences;
	
	public NotificationPreferenceDataList()
	{
		// default constructor
	}
	
	public void setPreferences(final List<NotificationPreferenceData> preferences)
	{
		this.preferences = preferences;
	}

	public List<NotificationPreferenceData> getPreferences() 
	{
		return preferences;
	}
	

}