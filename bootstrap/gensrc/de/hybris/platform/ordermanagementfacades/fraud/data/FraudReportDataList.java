/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:03 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementfacades.fraud.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.fraud.data.FraudReportData;
import java.util.List;


import java.util.Objects;
public  class FraudReportDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>FraudReportDataList.reports</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private List<FraudReportData> reports;
	
	public FraudReportDataList()
	{
		// default constructor
	}
	
	public void setReports(final List<FraudReportData> reports)
	{
		this.reports = reports;
	}

	public List<FraudReportData> getReports() 
	{
		return reports;
	}
	

}