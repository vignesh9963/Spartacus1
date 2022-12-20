/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2bacceleratorservices.model.process;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ReplenishmentProcess first defined at extension b2bacceleratorservices.
 * <p>
 * It represents Replenishment  business process.
 */
@SuppressWarnings("all")
public class ReplenishmentProcessModel extends StoreFrontCustomerProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ReplenishmentProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReplenishmentProcess.cartToOrderCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. */
	public static final String CARTTOORDERCRONJOB = "cartToOrderCronJob";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReplenishmentProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReplenishmentProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ReplenishmentProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ReplenishmentProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReplenishmentProcess.cartToOrderCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. 
	 * @return the cartToOrderCronJob - Attribute contains cronjob that knows how to create an order from cart.
	 */
	@Accessor(qualifier = "cartToOrderCronJob", type = Accessor.Type.GETTER)
	public CartToOrderCronJobModel getCartToOrderCronJob()
	{
		return getPersistenceContext().getPropertyValue(CARTTOORDERCRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReplenishmentProcess.cartToOrderCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. 
	 *  
	 * @param value the cartToOrderCronJob - Attribute contains cronjob that knows how to create an order from cart.
	 */
	@Accessor(qualifier = "cartToOrderCronJob", type = Accessor.Type.SETTER)
	public void setCartToOrderCronJob(final CartToOrderCronJobModel value)
	{
		getPersistenceContext().setPropertyValue(CARTTOORDERCRONJOB, value);
	}
	
}
