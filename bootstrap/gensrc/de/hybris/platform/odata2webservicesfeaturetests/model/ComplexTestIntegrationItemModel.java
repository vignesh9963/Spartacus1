/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.odata2webservicesfeaturetests.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.odata2webservicesfeaturetests.model.TestIntegrationItemDetailModel;
import de.hybris.platform.odata2webservicesfeaturetests.model.TestIntegrationItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type ComplexTestIntegrationItem first defined at extension odata2webservicesfeaturetests.
 * <p>
 * This item requires nested TestIntegrationItemDetails and therefore cannot be created without them.
 *                 That is why it is Complex.
 */
@SuppressWarnings("all")
public class ComplexTestIntegrationItemModel extends TestIntegrationItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ComplexTestIntegrationItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>ComplexTestIntegrationItem.requiredDetails</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String REQUIREDDETAILS = "requiredDetails";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ComplexTestIntegrationItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ComplexTestIntegrationItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _requiredDetails initial attribute declared by type <code>ComplexTestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ComplexTestIntegrationItemModel(final String _code, final Set<TestIntegrationItemDetailModel> _requiredDetails)
	{
		super();
		setCode(_code);
		setRequiredDetails(_requiredDetails);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _requiredDetails initial attribute declared by type <code>ComplexTestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ComplexTestIntegrationItemModel(final String _code, final ItemModel _owner, final Set<TestIntegrationItemDetailModel> _requiredDetails)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setRequiredDetails(_requiredDetails);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComplexTestIntegrationItem.requiredDetails</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the requiredDetails
	 */
	@Accessor(qualifier = "requiredDetails", type = Accessor.Type.GETTER)
	public Set<TestIntegrationItemDetailModel> getRequiredDetails()
	{
		return getPersistenceContext().getPropertyValue(REQUIREDDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ComplexTestIntegrationItem.requiredDetails</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the requiredDetails
	 */
	@Accessor(qualifier = "requiredDetails", type = Accessor.Type.SETTER)
	public void setRequiredDetails(final Set<TestIntegrationItemDetailModel> value)
	{
		getPersistenceContext().setPropertyValue(REQUIREDDETAILS, value);
	}
	
}
