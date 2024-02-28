/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.GuestbookEntry;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for GuestbookEntry. This utility wraps
 * <code>guestbook.service.impl.GuestbookEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author wesleyroberts
 * @see GuestbookEntryLocalService
 * @generated
 */
public class GuestbookEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>guestbook.service.impl.GuestbookEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	public static GuestbookEntry addGuestbookEntry(
		GuestbookEntry guestbookEntry) {

		return getService().addGuestbookEntry(guestbookEntry);
	}

	/**
	 * Creates a new guestbook entry with the primary key. Does not add the guestbook entry to the database.
	 *
	 * @param entryId the primary key for the new guestbook entry
	 * @return the new guestbook entry
	 */
	public static GuestbookEntry createGuestbookEntry(long entryId) {
		return getService().createGuestbookEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

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
	public static GuestbookEntry deleteGuestbookEntry(
		GuestbookEntry guestbookEntry) {

		return getService().deleteGuestbookEntry(guestbookEntry);
	}

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
	public static GuestbookEntry deleteGuestbookEntry(long entryId)
		throws PortalException {

		return getService().deleteGuestbookEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static GuestbookEntry fetchGuestbookEntry(long entryId) {
		return getService().fetchGuestbookEntry(entryId);
	}

	/**
	 * Returns the guestbook entry matching the UUID and group.
	 *
	 * @param uuid the guestbook entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public static GuestbookEntry fetchGuestbookEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchGuestbookEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns a range of all the guestbook entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of guestbook entries
	 */
	public static List<GuestbookEntry> getGuestbookEntries(int start, int end) {
		return getService().getGuestbookEntries(start, end);
	}

	/**
	 * Returns all the guestbook entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbook entries
	 * @param companyId the primary key of the company
	 * @return the matching guestbook entries, or an empty list if no matches were found
	 */
	public static List<GuestbookEntry> getGuestbookEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getGuestbookEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

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
	public static List<GuestbookEntry> getGuestbookEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GuestbookEntry> orderByComparator) {

		return getService().getGuestbookEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guestbook entries.
	 *
	 * @return the number of guestbook entries
	 */
	public static int getGuestbookEntriesCount() {
		return getService().getGuestbookEntriesCount();
	}

	/**
	 * Returns the guestbook entry with the primary key.
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry
	 * @throws PortalException if a guestbook entry with the primary key could not be found
	 */
	public static GuestbookEntry getGuestbookEntry(long entryId)
		throws PortalException {

		return getService().getGuestbookEntry(entryId);
	}

	/**
	 * Returns the guestbook entry matching the UUID and group.
	 *
	 * @param uuid the guestbook entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook entry
	 * @throws PortalException if a matching guestbook entry could not be found
	 */
	public static GuestbookEntry getGuestbookEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getGuestbookEntryByUuidAndGroupId(uuid, groupId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static GuestbookEntry updateGuestbookEntry(
		GuestbookEntry guestbookEntry) {

		return getService().updateGuestbookEntry(guestbookEntry);
	}

	public static GuestbookEntryLocalService getService() {
		return _service;
	}

	public static void setService(GuestbookEntryLocalService service) {
		_service = service;
	}

	private static volatile GuestbookEntryLocalService _service;

}