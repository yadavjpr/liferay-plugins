/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.hr.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRTimeOffType service. Represents a row in the &quot;HRTimeOffType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRTimeOffTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRTimeOffTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HRTimeOffType
 * @see com.liferay.hr.model.impl.HRTimeOffTypeImpl
 * @see com.liferay.hr.model.impl.HRTimeOffTypeModelImpl
 * @generated
 */
public interface HRTimeOffTypeModel extends BaseModel<HRTimeOffType>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r time off type model instance should use the {@link HRTimeOffType} interface instead.
	 */

	/**
	 * Gets the primary key of this h r time off type.
	 *
	 * @return the primary key of this h r time off type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r time off type
	 *
	 * @param pk the primary key of this h r time off type
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr time off type ID of this h r time off type.
	 *
	 * @return the hr time off type ID of this h r time off type
	 */
	public long getHrTimeOffTypeId();

	/**
	 * Sets the hr time off type ID of this h r time off type.
	 *
	 * @param hrTimeOffTypeId the hr time off type ID of this h r time off type
	 */
	public void setHrTimeOffTypeId(long hrTimeOffTypeId);

	/**
	 * Gets the group ID of this h r time off type.
	 *
	 * @return the group ID of this h r time off type
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r time off type.
	 *
	 * @param groupId the group ID of this h r time off type
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r time off type.
	 *
	 * @return the company ID of this h r time off type
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r time off type.
	 *
	 * @param companyId the company ID of this h r time off type
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r time off type.
	 *
	 * @return the user ID of this h r time off type
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r time off type.
	 *
	 * @param userId the user ID of this h r time off type
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r time off type.
	 *
	 * @return the user uuid of this h r time off type
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r time off type.
	 *
	 * @param userUuid the user uuid of this h r time off type
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r time off type.
	 *
	 * @return the user name of this h r time off type
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r time off type.
	 *
	 * @param userName the user name of this h r time off type
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r time off type.
	 *
	 * @return the create date of this h r time off type
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r time off type.
	 *
	 * @param createDate the create date of this h r time off type
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r time off type.
	 *
	 * @return the modified date of this h r time off type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r time off type.
	 *
	 * @param modifiedDate the modified date of this h r time off type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the name of this h r time off type.
	 *
	 * @return the name of this h r time off type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r time off type.
	 *
	 * @param name the name of this h r time off type
	 */
	public void setName(String name);

	/**
	 * Gets the description of this h r time off type.
	 *
	 * @return the description of this h r time off type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r time off type.
	 *
	 * @param description the description of this h r time off type
	 */
	public void setDescription(String description);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRTimeOffType hrTimeOffType);

	public int hashCode();

	public HRTimeOffType toEscapedModel();

	public String toString();

	public String toXmlString();
}