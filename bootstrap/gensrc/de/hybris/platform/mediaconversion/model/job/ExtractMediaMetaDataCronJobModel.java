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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.mediaconversion.model.job.AbstractMediaCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ExtractMediaMetaDataCronJob first defined at extension mediaconversion.
 */
@SuppressWarnings("all")
public class ExtractMediaMetaDataCronJobModel extends AbstractMediaCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ExtractMediaMetaDataCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExtractMediaMetaDataCronJob.includeConverted</code> attribute defined at extension <code>mediaconversion</code>. */
	public static final String INCLUDECONVERTED = "includeConverted";
	
	/** <i>Generated constant</i> - Attribute key of <code>ExtractMediaMetaDataCronJob.containerMediasOnly</code> attribute defined at extension <code>mediaconversion</code>. */
	public static final String CONTAINERMEDIASONLY = "containerMediasOnly";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ExtractMediaMetaDataCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ExtractMediaMetaDataCronJobModel(final ItemModelContext ctx)
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
	public ExtractMediaMetaDataCronJobModel(final JobModel _job, final int _maxThreads)
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
	public ExtractMediaMetaDataCronJobModel(final JobModel _job, final int _maxThreads, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setMaxThreads(_maxThreads);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtractMediaMetaDataCronJob.containerMediasOnly</code> attribute defined at extension <code>mediaconversion</code>. 
	 * @return the containerMediasOnly - Whether only media which reside in media container should be obeyed.
	 */
	@Accessor(qualifier = "containerMediasOnly", type = Accessor.Type.GETTER)
	public Boolean getContainerMediasOnly()
	{
		return getPersistenceContext().getPropertyValue(CONTAINERMEDIASONLY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtractMediaMetaDataCronJob.includeConverted</code> attribute defined at extension <code>mediaconversion</code>. 
	 * @return the includeConverted - Whether converted media should also be obeyed.
	 */
	@Accessor(qualifier = "includeConverted", type = Accessor.Type.GETTER)
	public Boolean getIncludeConverted()
	{
		return getPersistenceContext().getPropertyValue(INCLUDECONVERTED);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExtractMediaMetaDataCronJob.containerMediasOnly</code> attribute defined at extension <code>mediaconversion</code>. 
	 *  
	 * @param value the containerMediasOnly - Whether only media which reside in media container should be obeyed.
	 */
	@Accessor(qualifier = "containerMediasOnly", type = Accessor.Type.SETTER)
	public void setContainerMediasOnly(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(CONTAINERMEDIASONLY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ExtractMediaMetaDataCronJob.includeConverted</code> attribute defined at extension <code>mediaconversion</code>. 
	 *  
	 * @param value the includeConverted - Whether converted media should also be obeyed.
	 */
	@Accessor(qualifier = "includeConverted", type = Accessor.Type.SETTER)
	public void setIncludeConverted(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(INCLUDECONVERTED, value);
	}
	
}
