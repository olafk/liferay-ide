/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Album service. Represents a row in the &quot;jukebox_Album&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.liferay.jukebox.model.impl.AlbumModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.liferay.jukebox.model.impl.AlbumImpl}.
 * </p>
 *
 * @author Julio Camarero
 * @see Album
 * @see org.liferay.jukebox.model.impl.AlbumImpl
 * @see org.liferay.jukebox.model.impl.AlbumModelImpl
 * @generated
 */
public interface AlbumModel extends BaseModel<Album>, ContainerModel,
	StagedGroupedModel, TrashedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a album model instance should use the {@link Album} interface instead.
	 */

	/**
	 * Returns the primary key of this album.
	 *
	 * @return the primary key of this album
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this album.
	 *
	 * @param primaryKey the primary key of this album
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this album.
	 *
	 * @return the uuid of this album
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this album.
	 *
	 * @param uuid the uuid of this album
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the album ID of this album.
	 *
	 * @return the album ID of this album
	 */
	public long getAlbumId();

	/**
	 * Sets the album ID of this album.
	 *
	 * @param albumId the album ID of this album
	 */
	public void setAlbumId(long albumId);

	/**
	 * Returns the company ID of this album.
	 *
	 * @return the company ID of this album
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this album.
	 *
	 * @param companyId the company ID of this album
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this album.
	 *
	 * @return the group ID of this album
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this album.
	 *
	 * @param groupId the group ID of this album
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this album.
	 *
	 * @return the user ID of this album
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this album.
	 *
	 * @param userId the user ID of this album
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this album.
	 *
	 * @return the user uuid of this album
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this album.
	 *
	 * @param userUuid the user uuid of this album
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this album.
	 *
	 * @return the user name of this album
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this album.
	 *
	 * @param userName the user name of this album
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this album.
	 *
	 * @return the create date of this album
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this album.
	 *
	 * @param createDate the create date of this album
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this album.
	 *
	 * @return the modified date of this album
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this album.
	 *
	 * @param modifiedDate the modified date of this album
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the artist ID of this album.
	 *
	 * @return the artist ID of this album
	 */
	public long getArtistId();

	/**
	 * Sets the artist ID of this album.
	 *
	 * @param artistId the artist ID of this album
	 */
	public void setArtistId(long artistId);

	/**
	 * Returns the name of this album.
	 *
	 * @return the name of this album
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this album.
	 *
	 * @param name the name of this album
	 */
	public void setName(String name);

	/**
	 * Returns the year of this album.
	 *
	 * @return the year of this album
	 */
	public int getYear();

	/**
	 * Sets the year of this album.
	 *
	 * @param year the year of this album
	 */
	public void setYear(int year);

	/**
	 * Returns the status of this album.
	 *
	 * @return the status of this album
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this album.
	 *
	 * @param status the status of this album
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this album.
	 *
	 * @return the status by user ID of this album
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this album.
	 *
	 * @param statusByUserId the status by user ID of this album
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this album.
	 *
	 * @return the status by user uuid of this album
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this album.
	 *
	 * @param statusByUserUuid the status by user uuid of this album
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this album.
	 *
	 * @return the status by user name of this album
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this album.
	 *
	 * @param statusByUserName the status by user name of this album
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this album.
	 *
	 * @return the status date of this album
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this album.
	 *
	 * @param statusDate the status date of this album
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the trash entry created when this album was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this album.
	 *
	 * @return the trash entry created when this album was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this album.
	 *
	 * @return the class primary key of the trash entry for this album
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this album.
	 *
	 * @return the trash handler for this album
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this album is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this album is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this album is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this album is in the Recycle Bin; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean isInTrashContainer();

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this album is approved.
	 *
	 * @return <code>true</code> if this album is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this album is denied.
	 *
	 * @return <code>true</code> if this album is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this album is a draft.
	 *
	 * @return <code>true</code> if this album is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this album is expired.
	 *
	 * @return <code>true</code> if this album is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this album is inactive.
	 *
	 * @return <code>true</code> if this album is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this album is incomplete.
	 *
	 * @return <code>true</code> if this album is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this album is pending.
	 *
	 * @return <code>true</code> if this album is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this album is scheduled.
	 *
	 * @return <code>true</code> if this album is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	/**
	 * Returns the container model ID of this album.
	 *
	 * @return the container model ID of this album
	 */
	@Override
	public long getContainerModelId();

	/**
	 * Sets the container model ID of this album.
	 *
	 * @param containerModelId the container model ID of this album
	 */
	@Override
	public void setContainerModelId(long containerModelId);

	/**
	 * Returns the container name of this album.
	 *
	 * @return the container name of this album
	 */
	@Override
	public String getContainerModelName();

	/**
	 * Returns the parent container model ID of this album.
	 *
	 * @return the parent container model ID of this album
	 */
	@Override
	public long getParentContainerModelId();

	/**
	 * Sets the parent container model ID of this album.
	 *
	 * @param parentContainerModelId the parent container model ID of this album
	 */
	@Override
	public void setParentContainerModelId(long parentContainerModelId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Album album);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Album> toCacheModel();

	@Override
	public Album toEscapedModel();

	@Override
	public Album toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}