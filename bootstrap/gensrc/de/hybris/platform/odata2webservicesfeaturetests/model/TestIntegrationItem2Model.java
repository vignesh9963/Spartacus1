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
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Map;

/**
 * Generated model class for type TestIntegrationItem2 first defined at extension odata2webservicesfeaturetests.
 * <p>
 * An item type to simulate various kinds of relationships, i.e. one-to-many (master/detail), one-to-one,
 *                 etc.,
 *                 between the TestIntegrationItem and TestIntegrationItemDetail.
 */
@SuppressWarnings("all")
public class TestIntegrationItem2Model extends TestItemType2Model
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "TestIntegrationItem2";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.requiredName</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String REQUIREDNAME = "requiredName";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.optionalSimpleAttr</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String OPTIONALSIMPLEATTR = "optionalSimpleAttr";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.requiredStringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String REQUIREDSTRINGMAP = "requiredStringMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.bigDecimalMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BIGDECIMALMAP = "bigDecimalMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.bigIntegerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BIGINTEGERMAP = "bigIntegerMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.booleanMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BOOLEANMAP = "booleanMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.byteMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BYTEMAP = "byteMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.characterMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String CHARACTERMAP = "characterMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.dateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String DATEMAP = "dateMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.doubleMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String DOUBLEMAP = "doubleMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.floatMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String FLOATMAP = "floatMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.integerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String INTEGERMAP = "integerMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.longMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String LONGMAP = "longMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.shortMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String SHORTMAP = "shortMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.bigDecimal2StringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BIGDECIMAL2STRINGMAP = "bigDecimal2StringMap";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem2.character2DateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String CHARACTER2DATEMAP = "character2DateMap";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TestIntegrationItem2Model()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TestIntegrationItem2Model(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _requiredName initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _requiredStringMap initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItem2Model(final String _code, final String _requiredName, final Map<String,String> _requiredStringMap)
	{
		super();
		setCode(_code);
		setRequiredName(_requiredName);
		setRequiredStringMap(_requiredStringMap);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _requiredName initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _requiredStringMap initial attribute declared by type <code>TestIntegrationItem2</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItem2Model(final String _code, final ItemModel _owner, final String _requiredName, final Map<String,String> _requiredStringMap)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setRequiredName(_requiredName);
		setRequiredStringMap(_requiredStringMap);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.bigDecimal2StringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the bigDecimal2StringMap
	 */
	@Accessor(qualifier = "bigDecimal2StringMap", type = Accessor.Type.GETTER)
	public Map<BigDecimal,String> getBigDecimal2StringMap()
	{
		return getPersistenceContext().getPropertyValue(BIGDECIMAL2STRINGMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.bigDecimalMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the bigDecimalMap
	 */
	@Accessor(qualifier = "bigDecimalMap", type = Accessor.Type.GETTER)
	public Map<BigDecimal,BigDecimal> getBigDecimalMap()
	{
		return getPersistenceContext().getPropertyValue(BIGDECIMALMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.bigIntegerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the bigIntegerMap
	 */
	@Accessor(qualifier = "bigIntegerMap", type = Accessor.Type.GETTER)
	public Map<BigInteger,BigInteger> getBigIntegerMap()
	{
		return getPersistenceContext().getPropertyValue(BIGINTEGERMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.booleanMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the booleanMap
	 */
	@Accessor(qualifier = "booleanMap", type = Accessor.Type.GETTER)
	public Map<Boolean,Boolean> getBooleanMap()
	{
		return getPersistenceContext().getPropertyValue(BOOLEANMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.byteMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the byteMap
	 */
	@Accessor(qualifier = "byteMap", type = Accessor.Type.GETTER)
	public Map<Byte,Byte> getByteMap()
	{
		return getPersistenceContext().getPropertyValue(BYTEMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.character2DateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the character2DateMap
	 */
	@Accessor(qualifier = "character2DateMap", type = Accessor.Type.GETTER)
	public Map<Character,Date> getCharacter2DateMap()
	{
		return getPersistenceContext().getPropertyValue(CHARACTER2DATEMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.characterMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the characterMap
	 */
	@Accessor(qualifier = "characterMap", type = Accessor.Type.GETTER)
	public Map<Character,Character> getCharacterMap()
	{
		return getPersistenceContext().getPropertyValue(CHARACTERMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the code - Unique identifier of this test item.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.dateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the dateMap
	 */
	@Accessor(qualifier = "dateMap", type = Accessor.Type.GETTER)
	public Map<Date,Date> getDateMap()
	{
		return getPersistenceContext().getPropertyValue(DATEMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.doubleMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the doubleMap
	 */
	@Accessor(qualifier = "doubleMap", type = Accessor.Type.GETTER)
	public Map<Double,Double> getDoubleMap()
	{
		return getPersistenceContext().getPropertyValue(DOUBLEMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.floatMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the floatMap
	 */
	@Accessor(qualifier = "floatMap", type = Accessor.Type.GETTER)
	public Map<Float,Float> getFloatMap()
	{
		return getPersistenceContext().getPropertyValue(FLOATMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.integerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the integerMap
	 */
	@Accessor(qualifier = "integerMap", type = Accessor.Type.GETTER)
	public Map<Integer,Integer> getIntegerMap()
	{
		return getPersistenceContext().getPropertyValue(INTEGERMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.longMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the longMap
	 */
	@Accessor(qualifier = "longMap", type = Accessor.Type.GETTER)
	public Map<Long,Long> getLongMap()
	{
		return getPersistenceContext().getPropertyValue(LONGMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.optionalSimpleAttr</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the optionalSimpleAttr
	 */
	@Accessor(qualifier = "optionalSimpleAttr", type = Accessor.Type.GETTER)
	public String getOptionalSimpleAttr()
	{
		return getPersistenceContext().getPropertyValue(OPTIONALSIMPLEATTR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.requiredName</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the requiredName
	 */
	@Accessor(qualifier = "requiredName", type = Accessor.Type.GETTER)
	public String getRequiredName()
	{
		return getPersistenceContext().getPropertyValue(REQUIREDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.requiredStringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the requiredStringMap
	 */
	@Accessor(qualifier = "requiredStringMap", type = Accessor.Type.GETTER)
	public Map<String,String> getRequiredStringMap()
	{
		return getPersistenceContext().getPropertyValue(REQUIREDSTRINGMAP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem2.shortMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the shortMap
	 */
	@Accessor(qualifier = "shortMap", type = Accessor.Type.GETTER)
	public Map<Short,Short> getShortMap()
	{
		return getPersistenceContext().getPropertyValue(SHORTMAP);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.bigDecimal2StringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the bigDecimal2StringMap
	 */
	@Accessor(qualifier = "bigDecimal2StringMap", type = Accessor.Type.SETTER)
	public void setBigDecimal2StringMap(final Map<BigDecimal,String> value)
	{
		getPersistenceContext().setPropertyValue(BIGDECIMAL2STRINGMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.bigDecimalMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the bigDecimalMap
	 */
	@Accessor(qualifier = "bigDecimalMap", type = Accessor.Type.SETTER)
	public void setBigDecimalMap(final Map<BigDecimal,BigDecimal> value)
	{
		getPersistenceContext().setPropertyValue(BIGDECIMALMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.bigIntegerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the bigIntegerMap
	 */
	@Accessor(qualifier = "bigIntegerMap", type = Accessor.Type.SETTER)
	public void setBigIntegerMap(final Map<BigInteger,BigInteger> value)
	{
		getPersistenceContext().setPropertyValue(BIGINTEGERMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.booleanMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the booleanMap
	 */
	@Accessor(qualifier = "booleanMap", type = Accessor.Type.SETTER)
	public void setBooleanMap(final Map<Boolean,Boolean> value)
	{
		getPersistenceContext().setPropertyValue(BOOLEANMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.byteMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the byteMap
	 */
	@Accessor(qualifier = "byteMap", type = Accessor.Type.SETTER)
	public void setByteMap(final Map<Byte,Byte> value)
	{
		getPersistenceContext().setPropertyValue(BYTEMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.character2DateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the character2DateMap
	 */
	@Accessor(qualifier = "character2DateMap", type = Accessor.Type.SETTER)
	public void setCharacter2DateMap(final Map<Character,Date> value)
	{
		getPersistenceContext().setPropertyValue(CHARACTER2DATEMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.characterMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the characterMap
	 */
	@Accessor(qualifier = "characterMap", type = Accessor.Type.SETTER)
	public void setCharacterMap(final Map<Character,Character> value)
	{
		getPersistenceContext().setPropertyValue(CHARACTERMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the code - Unique identifier of this test item.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.dateMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the dateMap
	 */
	@Accessor(qualifier = "dateMap", type = Accessor.Type.SETTER)
	public void setDateMap(final Map<Date,Date> value)
	{
		getPersistenceContext().setPropertyValue(DATEMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.doubleMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the doubleMap
	 */
	@Accessor(qualifier = "doubleMap", type = Accessor.Type.SETTER)
	public void setDoubleMap(final Map<Double,Double> value)
	{
		getPersistenceContext().setPropertyValue(DOUBLEMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.floatMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the floatMap
	 */
	@Accessor(qualifier = "floatMap", type = Accessor.Type.SETTER)
	public void setFloatMap(final Map<Float,Float> value)
	{
		getPersistenceContext().setPropertyValue(FLOATMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.integerMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the integerMap
	 */
	@Accessor(qualifier = "integerMap", type = Accessor.Type.SETTER)
	public void setIntegerMap(final Map<Integer,Integer> value)
	{
		getPersistenceContext().setPropertyValue(INTEGERMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.longMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the longMap
	 */
	@Accessor(qualifier = "longMap", type = Accessor.Type.SETTER)
	public void setLongMap(final Map<Long,Long> value)
	{
		getPersistenceContext().setPropertyValue(LONGMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.optionalSimpleAttr</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the optionalSimpleAttr
	 */
	@Accessor(qualifier = "optionalSimpleAttr", type = Accessor.Type.SETTER)
	public void setOptionalSimpleAttr(final String value)
	{
		getPersistenceContext().setPropertyValue(OPTIONALSIMPLEATTR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.requiredName</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the requiredName
	 */
	@Accessor(qualifier = "requiredName", type = Accessor.Type.SETTER)
	public void setRequiredName(final String value)
	{
		getPersistenceContext().setPropertyValue(REQUIREDNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.requiredStringMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the requiredStringMap
	 */
	@Accessor(qualifier = "requiredStringMap", type = Accessor.Type.SETTER)
	public void setRequiredStringMap(final Map<String,String> value)
	{
		getPersistenceContext().setPropertyValue(REQUIREDSTRINGMAP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem2.shortMap</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the shortMap
	 */
	@Accessor(qualifier = "shortMap", type = Accessor.Type.SETTER)
	public void setShortMap(final Map<Short,Short> value)
	{
		getPersistenceContext().setPropertyValue(SHORTMAP, value);
	}
	
}
