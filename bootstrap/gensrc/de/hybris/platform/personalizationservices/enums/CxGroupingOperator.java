/*
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationservices.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum CxGroupingOperator declared at extension personalizationservices.
 */
public enum CxGroupingOperator implements HybrisEnumValue
{
	/**
	 * Generated enum value for CxGroupingOperator.AND declared at extension personalizationservices.
	 * <p/>
	 * Group by AND.
	 */
	AND("AND"),
	/**
	 * Generated enum value for CxGroupingOperator.OR declared at extension personalizationservices.
	 * <p/>
	 * Group by OR.
	 */
	OR("OR");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CxGroupingOperator";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "CxGroupingOperator";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CxGroupingOperator(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
