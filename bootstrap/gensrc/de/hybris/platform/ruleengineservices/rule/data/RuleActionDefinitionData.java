/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:07 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rule.data;

import de.hybris.platform.ruleengineservices.rule.data.AbstractRuleDefinitionData;
import de.hybris.platform.ruleengineservices.rule.data.RuleActionDefinitionCategoryData;
import java.util.List;


import java.util.Objects;
public  class RuleActionDefinitionData extends AbstractRuleDefinitionData 

{



	/** <i>Generated property</i> for <code>RuleActionDefinitionData.categories</code> property defined at extension <code>ruleengineservices</code>. */
	
	private List<RuleActionDefinitionCategoryData> categories;
	
	public RuleActionDefinitionData()
	{
		// default constructor
	}
	
	public void setCategories(final List<RuleActionDefinitionCategoryData> categories)
	{
		this.categories = categories;
	}

	public List<RuleActionDefinitionCategoryData> getCategories() 
	{
		return categories;
	}
	

}