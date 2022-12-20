/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 19-Sep-2022, 9:54:11 am
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservices.core.voucher.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import java.util.List;


import java.util.Objects;
public  class VoucherDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VoucherDataList.vouchers</code> property defined at extension <code>commercewebservices</code>. */
	
	private List<VoucherData> vouchers;
	
	public VoucherDataList()
	{
		// default constructor
	}
	
	public void setVouchers(final List<VoucherData> vouchers)
	{
		this.vouchers = vouchers;
	}

	public List<VoucherData> getVouchers() 
	{
		return vouchers;
	}
	

}