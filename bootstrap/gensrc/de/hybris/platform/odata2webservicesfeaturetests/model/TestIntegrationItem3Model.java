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
import de.hybris.platform.core.model.test.TestItemType2Model;
import de.hybris.platform.odata2webservicesfeaturetests.model.TestIntegrationItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type TestIntegrationItem3 first defined at extension odata2webservicesfeaturetests.
 */
@SuppressWarnings("all")
public class TestIntegrationItem3Model extends TestItemType2Model
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "TestIntegrationItem3";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem3.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem3.requiredItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String REQUIREDITEM = "requiredItem";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TestIntegrationItem3Model()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TestIntegrationItem3Model(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem3</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _requiredItem initial attribute declared by type <code>TestIntegrationItem3</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItem3Model(final String _code, final TestIntegrationItemModel _requiredItem)
	{
		super();
		setCode(_code);
		setRequiredItem(_requiredItem);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem3</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _requiredItem initial attribute declared by type <code>TestIntegrationItem3</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItem3Model(final String _code, final ItemModel _owner, final TestIntegrationItemModel _requiredItem)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setRequiredItem(_requiredItem);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem3.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem3.requiredItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the requiredItem
	 */
	@Accessor(qualifier = "requiredItem", type = Accessor.Type.GETTER)
	public TestIntegrationItemModel getRequiredItem()
	{
		return getPersistenceContext().getPropertyValue(REQUIREDITEM);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem3.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem3.requiredItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the requiredItem
	 */
	@Accessor(qualifier = "requiredItem", type = Accessor.Type.SETTER)
	public void setRequiredItem(final TestIntegrationItemModel value)
	{
		getPersistenceContext().setPropertyValue(REQUIREDITEM, value);
	}
	
}
