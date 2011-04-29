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

/**
 * <p>
 * This class is a wrapper for {@link HRWageType}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       HRWageType
 * @generated
 */
public class HRWageTypeWrapper implements HRWageType {
	public HRWageTypeWrapper(HRWageType hrWageType) {
		_hrWageType = hrWageType;
	}

	public Class<?> getModelClass() {
		return HRWageType.class;
	}

	public String getModelClassName() {
		return HRWageType.class.getName();
	}

	/**
	* Gets the primary key of this h r wage type.
	*
	* @return the primary key of this h r wage type
	*/
	public long getPrimaryKey() {
		return _hrWageType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this h r wage type
	*
	* @param pk the primary key of this h r wage type
	*/
	public void setPrimaryKey(long pk) {
		_hrWageType.setPrimaryKey(pk);
	}

	/**
	* Gets the hr wage type ID of this h r wage type.
	*
	* @return the hr wage type ID of this h r wage type
	*/
	public long getHrWageTypeId() {
		return _hrWageType.getHrWageTypeId();
	}

	/**
	* Sets the hr wage type ID of this h r wage type.
	*
	* @param hrWageTypeId the hr wage type ID of this h r wage type
	*/
	public void setHrWageTypeId(long hrWageTypeId) {
		_hrWageType.setHrWageTypeId(hrWageTypeId);
	}

	/**
	* Gets the group ID of this h r wage type.
	*
	* @return the group ID of this h r wage type
	*/
	public long getGroupId() {
		return _hrWageType.getGroupId();
	}

	/**
	* Sets the group ID of this h r wage type.
	*
	* @param groupId the group ID of this h r wage type
	*/
	public void setGroupId(long groupId) {
		_hrWageType.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this h r wage type.
	*
	* @return the company ID of this h r wage type
	*/
	public long getCompanyId() {
		return _hrWageType.getCompanyId();
	}

	/**
	* Sets the company ID of this h r wage type.
	*
	* @param companyId the company ID of this h r wage type
	*/
	public void setCompanyId(long companyId) {
		_hrWageType.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this h r wage type.
	*
	* @return the user ID of this h r wage type
	*/
	public long getUserId() {
		return _hrWageType.getUserId();
	}

	/**
	* Sets the user ID of this h r wage type.
	*
	* @param userId the user ID of this h r wage type
	*/
	public void setUserId(long userId) {
		_hrWageType.setUserId(userId);
	}

	/**
	* Gets the user uuid of this h r wage type.
	*
	* @return the user uuid of this h r wage type
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hrWageType.getUserUuid();
	}

	/**
	* Sets the user uuid of this h r wage type.
	*
	* @param userUuid the user uuid of this h r wage type
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_hrWageType.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this h r wage type.
	*
	* @return the user name of this h r wage type
	*/
	public java.lang.String getUserName() {
		return _hrWageType.getUserName();
	}

	/**
	* Sets the user name of this h r wage type.
	*
	* @param userName the user name of this h r wage type
	*/
	public void setUserName(java.lang.String userName) {
		_hrWageType.setUserName(userName);
	}

	/**
	* Gets the create date of this h r wage type.
	*
	* @return the create date of this h r wage type
	*/
	public java.util.Date getCreateDate() {
		return _hrWageType.getCreateDate();
	}

	/**
	* Sets the create date of this h r wage type.
	*
	* @param createDate the create date of this h r wage type
	*/
	public void setCreateDate(java.util.Date createDate) {
		_hrWageType.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this h r wage type.
	*
	* @return the modified date of this h r wage type
	*/
	public java.util.Date getModifiedDate() {
		return _hrWageType.getModifiedDate();
	}

	/**
	* Sets the modified date of this h r wage type.
	*
	* @param modifiedDate the modified date of this h r wage type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_hrWageType.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the code of this h r wage type.
	*
	* @return the code of this h r wage type
	*/
	public java.lang.String getCode() {
		return _hrWageType.getCode();
	}

	/**
	* Sets the code of this h r wage type.
	*
	* @param code the code of this h r wage type
	*/
	public void setCode(java.lang.String code) {
		_hrWageType.setCode(code);
	}

	/**
	* Gets the name of this h r wage type.
	*
	* @return the name of this h r wage type
	*/
	public java.lang.String getName() {
		return _hrWageType.getName();
	}

	/**
	* Sets the name of this h r wage type.
	*
	* @param name the name of this h r wage type
	*/
	public void setName(java.lang.String name) {
		_hrWageType.setName(name);
	}

	/**
	* Gets the description of this h r wage type.
	*
	* @return the description of this h r wage type
	*/
	public java.lang.String getDescription() {
		return _hrWageType.getDescription();
	}

	/**
	* Sets the description of this h r wage type.
	*
	* @param description the description of this h r wage type
	*/
	public void setDescription(java.lang.String description) {
		_hrWageType.setDescription(description);
	}

	public boolean isNew() {
		return _hrWageType.isNew();
	}

	public void setNew(boolean n) {
		_hrWageType.setNew(n);
	}

	public boolean isCachedModel() {
		return _hrWageType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_hrWageType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _hrWageType.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_hrWageType.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _hrWageType.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hrWageType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hrWageType.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new HRWageTypeWrapper((HRWageType)_hrWageType.clone());
	}

	public int compareTo(HRWageType hrWageType) {
		return _hrWageType.compareTo(hrWageType);
	}

	public int hashCode() {
		return _hrWageType.hashCode();
	}

	public HRWageType toEscapedModel() {
		return new HRWageTypeWrapper(_hrWageType.toEscapedModel());
	}

	public java.lang.String toString() {
		return _hrWageType.toString();
	}

	public java.lang.String toXmlString() {
		return _hrWageType.toXmlString();
	}

	public HRWageType getWrappedHRWageType() {
		return _hrWageType;
	}

	public void resetOriginalValues() {
		_hrWageType.resetOriginalValues();
	}

	private HRWageType _hrWageType;
}