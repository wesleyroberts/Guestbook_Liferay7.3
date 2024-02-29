/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.br.revisandocodigo.treinamento.guestbook.service;

import com.br.revisandocodigo.treinamento.guestbook.model.GuestbookEntry;

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
 * Provides the local service interface for GuestbookEntry. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author wesleyroberts
 * @see GuestbookEntryLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface GuestbookEntryLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.br.revisandocodigo.treinamento.guestbook.service.impl.GuestbookEntryLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the guestbook entry local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link GuestbookEntryLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the guestbook entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbookEntry the guestbook entry
	 * @return the guestbook entry that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public GuestbookEntry addGuestbookEntry(GuestbookEntry guestbookEntry);

	public GuestbookEntry addGuestbookEntry(
			long userId, long guestbookId, String name, String email,
			String message, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new guestbook entry with the primary key. Does not add the guestbook entry to the database.
	 *
	 * @param entryId the primary key for the new guestbook entry
	 * @return the new guestbook entry
	 */
	@Transactional(enabled = false)
	public GuestbookEntry createGuestbookEntry(long entryId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the guestbook entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbookEntry the guestbook entry
	 * @return the guestbook entry that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public GuestbookEntry deleteGuestbookEntry(GuestbookEntry guestbookEntry);

	/**
	 * Deletes the guestbook entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry that was removed
	 * @throws PortalException if a guestbook entry with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public GuestbookEntry deleteGuestbookEntry(long entryId)
		throws PortalException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookEntryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookEntryModelImpl</code>.
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
	public GuestbookEntry fetchGuestbookEntry(long entryId);

	/**
	 * Returns the guestbook entry matching the UUID and group.
	 *
	 * @param uuid the guestbook entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public GuestbookEntry fetchGuestbookEntryByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	 * Returns a range of all the guestbook entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.br.revisandocodigo.treinamento.guestbook.model.impl.GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of guestbook entries
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntries(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntries(
		long groupId, long guestbookId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntries(
			long groupId, long guestbookId, int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntries(
		long groupId, long guestbookId, int start, int end,
		OrderByComparator<GuestbookEntry> obc);

	/**
	 * Returns all the guestbook entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbook entries
	 * @param companyId the primary key of the company
	 * @return the matching guestbook entries, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntriesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of guestbook entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbook entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching guestbook entries, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<GuestbookEntry> getGuestbookEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GuestbookEntry> orderByComparator);

	/**
	 * Returns the number of guestbook entries.
	 *
	 * @return the number of guestbook entries
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbookEntriesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbookEntriesCount(long groupId, long guestbookId);

	/**
	 * Returns the guestbook entry with the primary key.
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry
	 * @throws PortalException if a guestbook entry with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public GuestbookEntry getGuestbookEntry(long entryId)
		throws PortalException;

	/**
	 * Returns the guestbook entry matching the UUID and group.
	 *
	 * @param uuid the guestbook entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook entry
	 * @throws PortalException if a matching guestbook entry could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public GuestbookEntry getGuestbookEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	 * Updates the guestbook entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbookEntry the guestbook entry
	 * @return the guestbook entry that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public GuestbookEntry updateGuestbookEntry(GuestbookEntry guestbookEntry);

	public GuestbookEntry updateGuestbookEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message, ServiceContext serviceContext)
		throws PortalException, SystemException;

}