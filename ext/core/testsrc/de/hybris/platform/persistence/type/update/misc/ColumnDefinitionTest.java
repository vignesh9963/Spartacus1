/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.persistence.type.update.misc;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.persistence.type.update.misc.UpdateDataUtil.ColumnDefinition;
import de.hybris.platform.util.Config.DatabaseNames;
import de.hybris.platform.util.jdbc.DBColumn;

import java.sql.Types;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * Unit test checking how a {@link ColumnDefinition} implementation compares with {@link DBColumn} metadata
 */
@RunWith(MockitoJUnitRunner.class)
@UnitTest
public class ColumnDefinitionTest
{

	@Mock
	private DBColumn column;


	@Test(expected = IllegalArgumentException.class)
	public void testNullColumn()
	{
		final DBColumn nullColumn = null;
		UpdateDataUtil.compare(nullColumn, "varchar(200)");

	}

	@Test
	public void testTheSameColumn()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar(200)");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));

		Assert.assertTrue(UpdateDataUtil.compare(column, "varchar(200)"));

	}

	@Test
	public void testTheSameColumnDifferentCase()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("VARCHAR(200)");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));

		Assert.assertTrue(UpdateDataUtil.compare(column, "varchar(200)"));

	}

	@Test
	public void testDifferentPrecision()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar(200)");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));

		Assert.assertFalse(UpdateDataUtil.compare(column, "varchar(200,10)"));

	}


	@Test
	public void testDifferentPrecisionDifferentCase()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar( 200 )");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));

		Assert.assertFalse(UpdateDataUtil.compare(column, "VARCHAR(200, 10)"));

	}

	@Test
	public void testEqualPrecision()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar(200,10)");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));
		BDDMockito.given(Integer.valueOf(column.getDecimalDigits())).willReturn(Integer.valueOf(10));

		Assert.assertTrue(UpdateDataUtil.compare(column, "varchar(200,10)"));

	}


	@Test
	public void testEqualPrecisionDifferentCase()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar( 200, 10 )");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));
		BDDMockito.given(Integer.valueOf(column.getDecimalDigits())).willReturn(Integer.valueOf(10));

		Assert.assertTrue(UpdateDataUtil.compare(column, "VARCHAR(  200,10)"));

	}


	@Test
	public void testEqualPrecisionDifferentSize()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar(20,10)");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(20));
		Mockito.lenient().when(Integer.valueOf(column.getDecimalDigits())).thenReturn(Integer.valueOf(10));

		Assert.assertFalse(UpdateDataUtil.compare(column, "varchar(200,10)"));

	}


	@Test
	public void testEqualTypeLessSpecificSQLDefinitionWithPrecision()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));
		BDDMockito.given(Integer.valueOf(column.getDecimalDigits())).willReturn(Integer.valueOf(10));

		Assert.assertTrue(UpdateDataUtil.compare(column, "VARCHAR(200, 10)"));

	}

	@Test
	public void testEqualTypeLessSpecificSQLDefinitionWithLength()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(Integer.valueOf(200));

		Assert.assertTrue(UpdateDataUtil.compare(column, "VARCHAR(200)"));

	}


	@Test
	public void testNVARCHARForSQLServerSizeTooLess()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("ntext");
		Mockito.lenient().when(Integer.valueOf(column.getColumnSize())).thenReturn(Integer.valueOf(200));

		Assert.assertFalse(UpdateDataUtil.compare(column, "NVARCHAR(MAX)"));

	}

	@Test
	public void testNVARCHARForSQLServerNotCorrectDBType()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("ntext");
		Mockito.lenient().when(Integer.valueOf(column.getColumnSize())).thenReturn(
				Integer.valueOf(UpdateDataUtil.MSSQL_MAX_LONGNVARCHAR_LENGTH));

		Assert.assertFalse(UpdateDataUtil.compare(column, "NVARCHAR(MAX)"));

	}

	@Test
	public void testNVARCHARForNoSQLServer()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.ORACLE);
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("ntext");
		Mockito.lenient().when(Integer.valueOf(column.getColumnSize())).thenReturn(
				Integer.valueOf(UpdateDataUtil.MSSQL_MAX_LONGNVARCHAR_LENGTH));
		Mockito.lenient().when(Integer.valueOf(column.getDataType())).thenReturn(Integer.valueOf(Types.LONGNVARCHAR));

		Assert.assertFalse(UpdateDataUtil.compare(column, "NVARCHAR(MAX)"));

	}

	@Test
	public void testNVARCHARForSQLServer()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.SQLSERVER);
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("ntext");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(
				Integer.valueOf(UpdateDataUtil.MSSQL_MAX_LONGNVARCHAR_LENGTH));
		BDDMockito.given(Integer.valueOf(column.getDataType())).willReturn(Integer.valueOf(Types.LONGNVARCHAR));

		Assert.assertTrue(UpdateDataUtil.compare(column, "NVARCHAR(MAX)"));

	}

	@Test
	public void testVARCHARForHSQLServerNotCorrectDBType()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.ORACLE);//db here not so crucial
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		Mockito.lenient().when(Integer.valueOf(column.getColumnSize())).thenReturn(
				Integer.valueOf(UpdateDataUtil.HSSQL_MAX_VARCHAR_LENGTH));

		Assert.assertFalse(UpdateDataUtil.compare(column, "LONGVARCHAR"));

	}

	@Test
	public void testVARCHARForNoHSQLServer()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.ORACLE);
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		Mockito.lenient().when(Integer.valueOf(column.getColumnSize())).thenReturn(
				Integer.valueOf(UpdateDataUtil.HSSQL_MAX_VARCHAR_LENGTH));
		Mockito.lenient().when(Integer.valueOf(column.getDataType())).thenReturn(Integer.valueOf(Types.VARCHAR));

		Assert.assertFalse(UpdateDataUtil.compare(column, "LONGVARCHAR"));

	}

	@Test
	public void testVARCHARForHSQLServerTooLessSize()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(
				Integer.valueOf(UpdateDataUtil.HSSQL_MAX_VARCHAR_LENGTH - 1));
		BDDMockito.given(Integer.valueOf(column.getDataType())).willReturn(Integer.valueOf(Types.VARCHAR));

		Assert.assertFalse(UpdateDataUtil.compare(column, "LONGVARCHAR"));

	}

	@Test
	public void testVARCHARForHSQLServer()
	{
		BDDMockito.given(column.getDbName()).willReturn(DatabaseNames.HSQLDB);
		BDDMockito.given(column.getSQLTypeDefinition()).willReturn("varchar");
		BDDMockito.given(Integer.valueOf(column.getColumnSize())).willReturn(
				Integer.valueOf(UpdateDataUtil.HSSQL_MAX_VARCHAR_LENGTH));
		BDDMockito.given(Integer.valueOf(column.getDataType())).willReturn(Integer.valueOf(Types.VARCHAR));

		Assert.assertTrue(UpdateDataUtil.compare(column, "LONGVARCHAR"));

	}
}
