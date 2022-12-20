/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cockpit.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.cockpit.model.CockpitObjectAbstractCollectionModel;
import de.hybris.platform.cockpit.model.ObjectCollectionElementModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ObjectCollectionItemReference first defined at extension cockpit.
 */
@SuppressWarnings("all")
public class ObjectCollectionItemReferenceModel extends ObjectCollectionElementModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ObjectCollectionItemReference";
	
	/** <i>Generated constant</i> - Attribute key of <code>ObjectCollectionItemReference.item</code> attribute defined at extension <code>cockpit</code>. */
	public static final String ITEM = "item";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ObjectCollectionItemReferenceModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ObjectCollectionItemReferenceModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _collection initial attribute declared by type <code>ObjectCollectionElement</code> at extension <code>cockpit</code>
	 * @param _item initial attribute declared by type <code>ObjectCollectionItemReference</code> at extension <code>cockpit</code>
	 * @param _objectTypeCode initial attribute declared by type <code>ObjectCollectionElement</code> at extension <code>cockpit</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ObjectCollectionItemReferenceModel(final CockpitObjectAbstractCollectionModel _collection, final ItemModel _item, final String _objectTypeCode)
	{
		super();
		setCollection(_collection);
		setItem(_item);
		setObjectTypeCode(_objectTypeCode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _collection initial attribute declared by type <code>ObjectCollectionElement</code> at extension <code>cockpit</code>
	 * @param _item initial attribute declared by type <code>ObjectCollectionItemReference</code> at extension <code>cockpit</code>
	 * @param _objectTypeCode initial attribute declared by type <code>ObjectCollectionElement</code> at extension <code>cockpit</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ObjectCollectionItemReferenceModel(final CockpitObjectAbstractCollectionModel _collection, final ItemModel _item, final String _objectTypeCode, final ItemModel _owner)
	{
		super();
		setCollection(_collection);
		setItem(_item);
		setObjectTypeCode(_objectTypeCode);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ObjectCollectionItemReference.item</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the item
	 */
	@Accessor(qualifier = "item", type = Accessor.Type.GETTER)
	public ItemModel getItem()
	{
		return getPersistenceContext().getPropertyValue(ITEM);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ObjectCollectionItemReference.item</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the item
	 */
	@Accessor(qualifier = "item", type = Accessor.Type.SETTER)
	public void setItem(final ItemModel value)
	{
		getPersistenceContext().setPropertyValue(ITEM, value);
	}
	
}
