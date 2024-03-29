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

package com.co.superintendencia.sociedades.builder.service.persistence;

import com.co.superintendencia.sociedades.builder.model.DocumentoSGD;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the documento sgd service. This utility wraps <code>com.co.superintendencia.sociedades.builder.service.persistence.impl.DocumentoSGDPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoSGDPersistence
 * @generated
 */
public class DocumentoSGDUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DocumentoSGD documentoSGD) {
		getPersistence().clearCache(documentoSGD);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DocumentoSGD> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocumentoSGD> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentoSGD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentoSGD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DocumentoSGD> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DocumentoSGD update(DocumentoSGD documentoSGD) {
		return getPersistence().update(documentoSGD);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DocumentoSGD update(
		DocumentoSGD documentoSGD, ServiceContext serviceContext) {

		return getPersistence().update(documentoSGD, serviceContext);
	}

	/**
	 * Returns all the documento sgds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching documento sgds
	 */
	public static List<DocumentoSGD> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the documento sgds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @return the range of matching documento sgds
	 */
	public static List<DocumentoSGD> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the documento sgds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documento sgds
	 */
	public static List<DocumentoSGD> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoSGD> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the documento sgds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching documento sgds
	 */
	public static List<DocumentoSGD> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoSGD> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first documento sgd in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento sgd
	 * @throws NoSuchDocumentoSGDException if a matching documento sgd could not be found
	 */
	public static DocumentoSGD findByUuid_First(
			String uuid, OrderByComparator<DocumentoSGD> orderByComparator)
		throws com.co.superintendencia.sociedades.builder.exception.
			NoSuchDocumentoSGDException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first documento sgd in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento sgd, or <code>null</code> if a matching documento sgd could not be found
	 */
	public static DocumentoSGD fetchByUuid_First(
		String uuid, OrderByComparator<DocumentoSGD> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last documento sgd in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento sgd
	 * @throws NoSuchDocumentoSGDException if a matching documento sgd could not be found
	 */
	public static DocumentoSGD findByUuid_Last(
			String uuid, OrderByComparator<DocumentoSGD> orderByComparator)
		throws com.co.superintendencia.sociedades.builder.exception.
			NoSuchDocumentoSGDException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last documento sgd in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento sgd, or <code>null</code> if a matching documento sgd could not be found
	 */
	public static DocumentoSGD fetchByUuid_Last(
		String uuid, OrderByComparator<DocumentoSGD> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the documento sgds before and after the current documento sgd in the ordered set where uuid = &#63;.
	 *
	 * @param documentoId the primary key of the current documento sgd
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next documento sgd
	 * @throws NoSuchDocumentoSGDException if a documento sgd with the primary key could not be found
	 */
	public static DocumentoSGD[] findByUuid_PrevAndNext(
			long documentoId, String uuid,
			OrderByComparator<DocumentoSGD> orderByComparator)
		throws com.co.superintendencia.sociedades.builder.exception.
			NoSuchDocumentoSGDException {

		return getPersistence().findByUuid_PrevAndNext(
			documentoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the documento sgds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of documento sgds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching documento sgds
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the documento sgd in the entity cache if it is enabled.
	 *
	 * @param documentoSGD the documento sgd
	 */
	public static void cacheResult(DocumentoSGD documentoSGD) {
		getPersistence().cacheResult(documentoSGD);
	}

	/**
	 * Caches the documento sgds in the entity cache if it is enabled.
	 *
	 * @param documentoSGDs the documento sgds
	 */
	public static void cacheResult(List<DocumentoSGD> documentoSGDs) {
		getPersistence().cacheResult(documentoSGDs);
	}

	/**
	 * Creates a new documento sgd with the primary key. Does not add the documento sgd to the database.
	 *
	 * @param documentoId the primary key for the new documento sgd
	 * @return the new documento sgd
	 */
	public static DocumentoSGD create(long documentoId) {
		return getPersistence().create(documentoId);
	}

	/**
	 * Removes the documento sgd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentoId the primary key of the documento sgd
	 * @return the documento sgd that was removed
	 * @throws NoSuchDocumentoSGDException if a documento sgd with the primary key could not be found
	 */
	public static DocumentoSGD remove(long documentoId)
		throws com.co.superintendencia.sociedades.builder.exception.
			NoSuchDocumentoSGDException {

		return getPersistence().remove(documentoId);
	}

	public static DocumentoSGD updateImpl(DocumentoSGD documentoSGD) {
		return getPersistence().updateImpl(documentoSGD);
	}

	/**
	 * Returns the documento sgd with the primary key or throws a <code>NoSuchDocumentoSGDException</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento sgd
	 * @return the documento sgd
	 * @throws NoSuchDocumentoSGDException if a documento sgd with the primary key could not be found
	 */
	public static DocumentoSGD findByPrimaryKey(long documentoId)
		throws com.co.superintendencia.sociedades.builder.exception.
			NoSuchDocumentoSGDException {

		return getPersistence().findByPrimaryKey(documentoId);
	}

	/**
	 * Returns the documento sgd with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento sgd
	 * @return the documento sgd, or <code>null</code> if a documento sgd with the primary key could not be found
	 */
	public static DocumentoSGD fetchByPrimaryKey(long documentoId) {
		return getPersistence().fetchByPrimaryKey(documentoId);
	}

	/**
	 * Returns all the documento sgds.
	 *
	 * @return the documento sgds
	 */
	public static List<DocumentoSGD> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the documento sgds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @return the range of documento sgds
	 */
	public static List<DocumentoSGD> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the documento sgds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documento sgds
	 */
	public static List<DocumentoSGD> findAll(
		int start, int end, OrderByComparator<DocumentoSGD> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the documento sgds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoSGDModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento sgds
	 * @param end the upper bound of the range of documento sgds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of documento sgds
	 */
	public static List<DocumentoSGD> findAll(
		int start, int end, OrderByComparator<DocumentoSGD> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the documento sgds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of documento sgds.
	 *
	 * @return the number of documento sgds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DocumentoSGDPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DocumentoSGDPersistence _persistence;

}