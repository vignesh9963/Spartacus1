/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.returns.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type OrderReturnRecord first defined at extension basecommerce.
 */
@SuppressWarnings("all")
public class OrderReturnRecordModel extends OrderModificationRecordModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "OrderReturnRecord";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderReturnRecordModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderReturnRecordModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _inProgress initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _order initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OrderReturnRecordModel(final boolean _inProgress, final OrderModel _order)
	{
		super();
		setInProgress(_inProgress);
		setOrder(_order);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _inProgress initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _order initial attribute declared by type <code>OrderModificationRecord</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OrderReturnRecordModel(final boolean _inProgress, final OrderModel _order, final ItemModel _owner)
	{
		super();
		setInProgress(_inProgress);
		setOrder(_order);
		setOwner(_owner);
	}
	
	
}
