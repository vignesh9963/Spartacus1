/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionservices.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.configurablebundleservices.model.ChangeProductPriceBundleRuleModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.subscriptionservices.model.BillingTimeModel;
import java.util.Collection;

/**
 * Generated model class for type BillingEvent first defined at extension subscriptionservices.
 */
@SuppressWarnings("all")
public class BillingEventModel extends BillingTimeModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "BillingEvent";
	
	/** <i>Generated constant</i> - Attribute key of <code>BillingEvent.changeProductPriceBundleRules</code> attribute defined at extension <code>subscriptionbundleservices</code>. */
	public static final String CHANGEPRODUCTPRICEBUNDLERULES = "changeProductPriceBundleRules";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BillingEventModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BillingEventModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BillingTime</code> at extension <code>subscriptionservices</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public BillingEventModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BillingTime</code> at extension <code>subscriptionservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public BillingEventModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BillingEvent.changeProductPriceBundleRules</code> attribute defined at extension <code>subscriptionbundleservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the changeProductPriceBundleRules
	 */
	@Accessor(qualifier = "changeProductPriceBundleRules", type = Accessor.Type.GETTER)
	public Collection<ChangeProductPriceBundleRuleModel> getChangeProductPriceBundleRules()
	{
		return getPersistenceContext().getPropertyValue(CHANGEPRODUCTPRICEBUNDLERULES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BillingEvent.changeProductPriceBundleRules</code> attribute defined at extension <code>subscriptionbundleservices</code>. 
	 *  
	 * @param value the changeProductPriceBundleRules
	 */
	@Accessor(qualifier = "changeProductPriceBundleRules", type = Accessor.Type.SETTER)
	public void setChangeProductPriceBundleRules(final Collection<ChangeProductPriceBundleRuleModel> value)
	{
		getPersistenceContext().setPropertyValue(CHANGEPRODUCTPRICEBUNDLERULES, value);
	}
	
}
