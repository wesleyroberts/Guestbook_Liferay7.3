/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.br.revisandocodigo.treinamento.guestbook.service;

import com.br.revisandocodigo.treinamento.guestbook.model.Guestbook;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Guestbook. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author wesleyroberts
 * @see GuestbookLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface GuestbookLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.br.revisandocodigo.treinamento.guestbook.service.impl.GuestbookLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the guestbook local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link GuestbookLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the guestbook to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbook the guestbook
	 * @return the guestbook that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Guestbook addGuestbook(Guestbook guestbook);

	public Guestbook addGuestbook(
			long userId, String name, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new guestbook with the primary key. Does not add the guestbook to the database.
	 *
	 * @param guestBookId the primary key for the new guestbook
	 * @return the new guestbook
	 */
	@Transactional(enabled = false)
	public Guestbook createGuestbook(long guestBookId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the guestbook from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbook the guestbook
	 * @return the guestbook that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Guestbook deleteGuestbook(Guestbook guestbook);

	/**
	 * Deletes the guestbook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestBookId the primary key of the guestbook
	 * @return the guestbook that was removed
	 * @throws PortalException if a guestbook with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Guestbook deleteGuestbook(long guestBookId) throws PortalException;

	public Guestbook deleteGuestbook(
			long guestbookId, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Guestbook fetchGuestbook(long guestBookId);

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook, or <code>null</code> if a matching guestbook could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Guestbook fetchGuestbookByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	 * Returns the guestbook with the primary key.
	 *
	 * @param guestBookId the primary key of the guestbook
	 * @return the guestbook
	 * @throws PortalException if a guestbook with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Guestbook getGuestbook(long guestBookId) throws PortalException;

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook
	 * @throws PortalException if a matching guestbook could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Guestbook getGuestbookByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the guestbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbooks
	 * @param end the upper bound of the range of guestbooks (not inclusive)
	 * @return the range of guestbooks
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooks(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooks(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooks(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooks(
		long groupId, int start, int end, OrderByComparator<Guestbook> obc);

	/**
	 * Returns all the guestbooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbooks
	 * @param companyId the primary key of the company
	 * @return the matching guestbooks, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooksByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of guestbooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbooks
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of guestbooks
	 * @param end the upper bound of the range of guestbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching guestbooks, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Guestbook> getGuestbooksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Guestbook> orderByComparator);

	/**
	 * Returns the number of guestbooks.
	 *
	 * @return the number of guestbooks
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbooksCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbooksCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the guestbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbook the guestbook
	 * @return the guestbook that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Guestbook updateGuestbook(Guestbook guestbook);

	public Guestbook updateGuestbook(
			long userId, long guestbookId, String name,
			ServiceContext serviceContext)
		throws PortalException, SystemException;

}