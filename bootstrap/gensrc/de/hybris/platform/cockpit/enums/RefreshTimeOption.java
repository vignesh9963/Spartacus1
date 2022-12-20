/*
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cockpit.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum RefreshTimeOption declared at extension cockpit.
 */
public enum RefreshTimeOption implements HybrisEnumValue
{
	/**
	 * Generated enum value for RefreshTimeOption.FIVESEC declared at extension cockpit.
	 */
	FIVESEC("FIVESEC"),
	/**
	 * Generated enum value for RefreshTimeOption.TENSEC declared at extension cockpit.
	 */
	TENSEC("TENSEC"),
	/**
	 * Generated enum value for RefreshTimeOption.QUATERMIN declared at extension cockpit.
	 */
	QUATERMIN("QUATERMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.HALFMIN declared at extension cockpit.
	 */
	HALFMIN("HALFMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.ONEMIN declared at extension cockpit.
	 */
	ONEMIN("ONEMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.THREEMIN declared at extension cockpit.
	 */
	THREEMIN("THREEMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.FIVEMIN declared at extension cockpit.
	 */
	FIVEMIN("FIVEMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.TENMIN declared at extension cockpit.
	 */
	TENMIN("TENMIN"),
	/**
	 * Generated enum value for RefreshTimeOption.QUATERHR declared at extension cockpit.
	 */
	QUATERHR("QUATERHR"),
	/**
	 * Generated enum value for RefreshTimeOption.HALFHR declared at extension cockpit.
	 */
	HALFHR("HALFHR"),
	/**
	 * Generated enum value for RefreshTimeOption.NEVER declared at extension cockpit.
	 */
	NEVER("NEVER");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RefreshTimeOption";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "RefreshTimeOption";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private RefreshTimeOption(final String code)
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
