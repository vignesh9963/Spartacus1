/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:03 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.promotionengineservices.promotionengine.report.data;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class AbstractPromotionEngineResults  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractPromotionEngineResults.promotionEngineResults</code> property defined at extension <code>promotionengineservices</code>. */
	
	private List<PromotionEngineResult> promotionEngineResults;
	
	public AbstractPromotionEngineResults()
	{
		// default constructor
	}
	
	public void setPromotionEngineResults(final List<PromotionEngineResult> promotionEngineResults)
	{
		this.promotionEngineResults = promotionEngineResults;
	}

	public List<PromotionEngineResult> getPromotionEngineResults() 
	{
		return promotionEngineResults;
	}
	

}