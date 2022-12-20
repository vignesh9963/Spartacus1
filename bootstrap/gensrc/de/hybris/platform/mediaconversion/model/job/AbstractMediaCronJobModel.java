/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Sep-2022, 9:53:42 am                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.mediaconversion.model.job;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractMediaCronJob first defined at extension mediaconversion.
 */
@SuppressWarnings("all")
public class AbstractMediaCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "AbstractMediaCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractMediaCronJob.maxThreads</code> attribute defined at extension <code>mediaconversion</code>. */
	public static final String MAXTHREADS = "maxThreads";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractMediaCronJob.catalogVersion</code> attribute defined at extension <code>mediaconversion</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractMediaCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractMediaCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _maxThreads initial attribute declared by type <code>AbstractMediaCronJob</code> at extension <code>mediaconversion</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public AbstractMediaCronJobModel(final JobModel _job, final int _maxThreads)
	{
		super();
		setJob(_job);
		setMaxThreads(_maxThreads);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _maxThreads initial attribute declared by type <code>AbstractMediaCronJob</code> at extension <code>mediaconversion</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public AbstractMediaCronJobModel(final JobModel _job, final int _maxThreads, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setMaxThreads(_maxThreads);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaCronJob.catalogVersion</code> attribute defined at extension <code>mediaconversion</code>. 
	 * @return the catalogVersion - Optional catalog version to work on.
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractMediaCronJob.maxThreads</code> attribute defined at extension <code>mediaconversion</code>. 
	 * @return the maxThreads - Amount of threads to use.
	 */
	@Accessor(qualifier = "maxThreads", type = Accessor.Type.GETTER)
	public int getMaxThreads()
	{
		return toPrimitive((Integer)getPersistenceContext().getPropertyValue(MAXTHREADS));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractMediaCronJob.catalogVersion</code> attribute defined at extension <code>mediaconversion</code>. 
	 *  
	 * @param value the catalogVersion - Optional catalog version to work on.
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractMediaCronJob.maxThreads</code> attribute defined at extension <code>mediaconversion</code>. 
	 *  
	 * @param value the maxThreads - Amount of threads to use.
	 */
	@Accessor(qualifier = "maxThreads", type = Accessor.Type.SETTER)
	public void setMaxThreads(final int value)
	{
		getPersistenceContext().setPropertyValue(MAXTHREADS, toObject(value));
	}
	
}
