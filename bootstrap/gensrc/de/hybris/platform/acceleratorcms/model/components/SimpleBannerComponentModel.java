/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2lib.model.components.AbstractBannerComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SimpleBannerComponent first defined at extension acceleratorcms.
 * <p>
 * It is just a simple concrete implementation of the AbstractBannerComponent.
 */
@SuppressWarnings("all")
public class SimpleBannerComponentModel extends AbstractBannerComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SimpleBannerComponent";
	
	/**<i>Generated relation code constant for relation <code>SimpleBannerComponentsForContentPage</code> defining source attribute <code>contentPage</code> in extension <code>acceleratorcms</code>.</i>*/
	public static final String _SIMPLEBANNERCOMPONENTSFORCONTENTPAGE = "SimpleBannerComponentsForContentPage";
	
	/**<i>Generated relation code constant for relation <code>SimpleBannerComponentsForProduct</code> defining source attribute <code>product</code> in extension <code>acceleratorcms</code>.</i>*/
	public static final String _SIMPLEBANNERCOMPONENTSFORPRODUCT = "SimpleBannerComponentsForProduct";
	
	/**<i>Generated relation code constant for relation <code>SimpleBannerComponentsForCategory</code> defining source attribute <code>category</code> in extension <code>acceleratorcms</code>.</i>*/
	public static final String _SIMPLEBANNERCOMPONENTSFORCATEGORY = "SimpleBannerComponentsForCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.contentPagePOS</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CONTENTPAGEPOS = "contentPagePOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.contentPage</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CONTENTPAGE = "contentPage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.productPOS</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String PRODUCTPOS = "productPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.product</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.categoryPOS</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CATEGORYPOS = "categoryPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>SimpleBannerComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CATEGORY = "category";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SimpleBannerComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SimpleBannerComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SimpleBannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _external initial attribute declared by type <code>AbstractBannerComponent</code> at extension <code>cms2lib</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SimpleBannerComponentModel(final CatalogVersionModel _catalogVersion, final boolean _external, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setExternal(_external);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SimpleBannerComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the category
	 */
	@Accessor(qualifier = "category", type = Accessor.Type.GETTER)
	public CategoryModel getCategory()
	{
		return getPersistenceContext().getPropertyValue(CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SimpleBannerComponent.contentPage</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the contentPage
	 */
	@Accessor(qualifier = "contentPage", type = Accessor.Type.GETTER)
	public ContentPageModel getContentPage()
	{
		return getPersistenceContext().getPropertyValue(CONTENTPAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SimpleBannerComponent.product</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.GETTER)
	public ProductModel getProduct()
	{
		return getPersistenceContext().getPropertyValue(PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SimpleBannerComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the category
	 */
	@Accessor(qualifier = "category", type = Accessor.Type.SETTER)
	public void setCategory(final CategoryModel value)
	{
		getPersistenceContext().setPropertyValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SimpleBannerComponent.contentPage</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the contentPage
	 */
	@Accessor(qualifier = "contentPage", type = Accessor.Type.SETTER)
	public void setContentPage(final ContentPageModel value)
	{
		getPersistenceContext().setPropertyValue(CONTENTPAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SimpleBannerComponent.product</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.SETTER)
	public void setProduct(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(PRODUCT, value);
	}
	
}
