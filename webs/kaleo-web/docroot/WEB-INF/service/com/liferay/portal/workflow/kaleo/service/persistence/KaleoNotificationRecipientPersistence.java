/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient;

/**
 * The persistence interface for the kaleo notification recipient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationRecipientPersistenceImpl
 * @see KaleoNotificationRecipientUtil
 * @generated
 */
public interface KaleoNotificationRecipientPersistence extends BasePersistence<KaleoNotificationRecipient> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KaleoNotificationRecipientUtil} to access the kaleo notification recipient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the kaleo notification recipients where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByCompanyId(
		long companyId);

	/**
	* Returns a range of all the kaleo notification recipients where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @return the range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByCompanyId(
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the kaleo notification recipients where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the first kaleo notification recipient in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the first kaleo notification recipient in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the last kaleo notification recipient in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the last kaleo notification recipient in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the kaleo notification recipients before and after the current kaleo notification recipient in the ordered set where companyId = &#63;.
	*
	* @param kaleoNotificationRecipientId the primary key of the current kaleo notification recipient
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient[] findByCompanyId_PrevAndNext(
		long kaleoNotificationRecipientId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Removes all the kaleo notification recipients where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of kaleo notification recipients where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching kaleo notification recipients
	*/
	public int countByCompanyId(long companyId);

	/**
	* Returns all the kaleo notification recipients where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @return the matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoDefinitionId(
		long kaleoDefinitionId);

	/**
	* Returns a range of all the kaleo notification recipients where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @return the range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end);

	/**
	* Returns an ordered range of all the kaleo notification recipients where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the first kaleo notification recipient in the ordered set where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByKaleoDefinitionId_First(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the first kaleo notification recipient in the ordered set where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByKaleoDefinitionId_First(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the last kaleo notification recipient in the ordered set where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByKaleoDefinitionId_Last(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the last kaleo notification recipient in the ordered set where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByKaleoDefinitionId_Last(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the kaleo notification recipients before and after the current kaleo notification recipient in the ordered set where kaleoDefinitionId = &#63;.
	*
	* @param kaleoNotificationRecipientId the primary key of the current kaleo notification recipient
	* @param kaleoDefinitionId the kaleo definition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient[] findByKaleoDefinitionId_PrevAndNext(
		long kaleoNotificationRecipientId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Removes all the kaleo notification recipients where kaleoDefinitionId = &#63; from the database.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	*/
	public void removeByKaleoDefinitionId(long kaleoDefinitionId);

	/**
	* Returns the number of kaleo notification recipients where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition ID
	* @return the number of matching kaleo notification recipients
	*/
	public int countByKaleoDefinitionId(long kaleoDefinitionId);

	/**
	* Returns all the kaleo notification recipients where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @return the matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoNotificationId(
		long kaleoNotificationId);

	/**
	* Returns a range of all the kaleo notification recipients where kaleoNotificationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @return the range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoNotificationId(
		long kaleoNotificationId, int start, int end);

	/**
	* Returns an ordered range of all the kaleo notification recipients where kaleoNotificationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findByKaleoNotificationId(
		long kaleoNotificationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the first kaleo notification recipient in the ordered set where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByKaleoNotificationId_First(
		long kaleoNotificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the first kaleo notification recipient in the ordered set where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByKaleoNotificationId_First(
		long kaleoNotificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the last kaleo notification recipient in the ordered set where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByKaleoNotificationId_Last(
		long kaleoNotificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the last kaleo notification recipient in the ordered set where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo notification recipient, or <code>null</code> if a matching kaleo notification recipient could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByKaleoNotificationId_Last(
		long kaleoNotificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Returns the kaleo notification recipients before and after the current kaleo notification recipient in the ordered set where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationRecipientId the primary key of the current kaleo notification recipient
	* @param kaleoNotificationId the kaleo notification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient[] findByKaleoNotificationId_PrevAndNext(
		long kaleoNotificationRecipientId, long kaleoNotificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Removes all the kaleo notification recipients where kaleoNotificationId = &#63; from the database.
	*
	* @param kaleoNotificationId the kaleo notification ID
	*/
	public void removeByKaleoNotificationId(long kaleoNotificationId);

	/**
	* Returns the number of kaleo notification recipients where kaleoNotificationId = &#63;.
	*
	* @param kaleoNotificationId the kaleo notification ID
	* @return the number of matching kaleo notification recipients
	*/
	public int countByKaleoNotificationId(long kaleoNotificationId);

	/**
	* Caches the kaleo notification recipient in the entity cache if it is enabled.
	*
	* @param kaleoNotificationRecipient the kaleo notification recipient
	*/
	public void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient kaleoNotificationRecipient);

	/**
	* Caches the kaleo notification recipients in the entity cache if it is enabled.
	*
	* @param kaleoNotificationRecipients the kaleo notification recipients
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> kaleoNotificationRecipients);

	/**
	* Creates a new kaleo notification recipient with the primary key. Does not add the kaleo notification recipient to the database.
	*
	* @param kaleoNotificationRecipientId the primary key for the new kaleo notification recipient
	* @return the new kaleo notification recipient
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient create(
		long kaleoNotificationRecipientId);

	/**
	* Removes the kaleo notification recipient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotificationRecipientId the primary key of the kaleo notification recipient
	* @return the kaleo notification recipient that was removed
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient remove(
		long kaleoNotificationRecipientId)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient kaleoNotificationRecipient);

	/**
	* Returns the kaleo notification recipient with the primary key or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException} if it could not be found.
	*
	* @param kaleoNotificationRecipientId the primary key of the kaleo notification recipient
	* @return the kaleo notification recipient
	* @throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient findByPrimaryKey(
		long kaleoNotificationRecipientId)
		throws com.liferay.portal.workflow.kaleo.NoSuchNotificationRecipientException;

	/**
	* Returns the kaleo notification recipient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kaleoNotificationRecipientId the primary key of the kaleo notification recipient
	* @return the kaleo notification recipient, or <code>null</code> if a kaleo notification recipient with the primary key could not be found
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient fetchByPrimaryKey(
		long kaleoNotificationRecipientId);

	/**
	* Returns all the kaleo notification recipients.
	*
	* @return the kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findAll();

	/**
	* Returns a range of all the kaleo notification recipients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @return the range of kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the kaleo notification recipients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kaleo notification recipients
	* @param end the upper bound of the range of kaleo notification recipients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kaleo notification recipients
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	/**
	* Removes all the kaleo notification recipients from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of kaleo notification recipients.
	*
	* @return the number of kaleo notification recipients
	*/
	public int countAll();
}