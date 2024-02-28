/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import guestbook.model.Guestbook;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Guestbook. This utility wraps
 * <code>guestbook.service.impl.GuestbookLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author wesleyroberts
 * @see GuestbookLocalService
 * @generated
 */
public class GuestbookLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>guestbook.service.impl.GuestbookLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	public static Guestbook addGuestbook(Guestbook guestbook) {
		return getService().addGuestbook(guestbook);
	}

	public static Guestbook addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addGuestbook(userId, name, serviceContext);
	}

	/**
	 * Creates a new guestbook with the primary key. Does not add the guestbook to the database.
	 *
	 * @param guestBookId the primary key for the new guestbook
	 * @return the new guestbook
	 */
	public static Guestbook createGuestbook(long guestBookId) {
		return getService().createGuestbook(guestBookId);
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
	 * Deletes the guestbook from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbook the guestbook
	 * @return the guestbook that was removed
	 */
	public static Guestbook deleteGuestbook(Guestbook guestbook) {
		return getService().deleteGuestbook(guestbook);
	}

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
	public static Guestbook deleteGuestbook(long guestBookId)
		throws PortalException {

		return getService().deleteGuestbook(guestBookId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookModelImpl</code>.
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

	public static Guestbook fetchGuestbook(long guestBookId) {
		return getService().fetchGuestbook(guestBookId);
	}

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook, or <code>null</code> if a matching guestbook could not be found
	 */
	public static Guestbook fetchGuestbookByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchGuestbookByUuidAndGroupId(uuid, groupId);
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
	 * Returns the guestbook with the primary key.
	 *
	 * @param guestBookId the primary key of the guestbook
	 * @return the guestbook
	 * @throws PortalException if a guestbook with the primary key could not be found
	 */
	public static Guestbook getGuestbook(long guestBookId)
		throws PortalException {

		return getService().getGuestbook(guestBookId);
	}

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook
	 * @throws PortalException if a matching guestbook could not be found
	 */
	public static Guestbook getGuestbookByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getGuestbookByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the guestbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>guestbook.model.impl.GuestbookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbooks
	 * @param end the upper bound of the range of guestbooks (not inclusive)
	 * @return the range of guestbooks
	 */
	public static List<Guestbook> getGuestbooks(int start, int end) {
		return getService().getGuestbooks(start, end);
	}

	public static List<Guestbook> getGuestbooks(long groupId) {
		return getService().getGuestbooks(groupId);
	}

	public static List<Guestbook> getGuestbooks(
		long groupId, int start, int end) {

		return getService().getGuestbooks(groupId, start, end);
	}

	public static List<Guestbook> getGuestbooks(
		long groupId, int start, int end, OrderByComparator<Guestbook> obc) {

		return getService().getGuestbooks(groupId, start, end, obc);
	}

	/**
	 * Returns all the guestbooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbooks
	 * @param companyId the primary key of the company
	 * @return the matching guestbooks, or an empty list if no matches were found
	 */
	public static List<Guestbook> getGuestbooksByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getGuestbooksByUuidAndCompanyId(uuid, companyId);
	}

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
	public static List<Guestbook> getGuestbooksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Guestbook> orderByComparator) {

		return getService().getGuestbooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guestbooks.
	 *
	 * @return the number of guestbooks
	 */
	public static int getGuestbooksCount() {
		return getService().getGuestbooksCount();
	}

	public static int getGuestbooksCount(long groupId) {
		return getService().getGuestbooksCount(groupId);
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
	 * Updates the guestbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuestbookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guestbook the guestbook
	 * @return the guestbook that was updated
	 */
	public static Guestbook updateGuestbook(Guestbook guestbook) {
		return getService().updateGuestbook(guestbook);
	}

	public static GuestbookLocalService getService() {
		return _service;
	}

	public static void setService(GuestbookLocalService service) {
		_service = service;
	}

	private static volatile GuestbookLocalService _service;

}