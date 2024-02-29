/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.br.revisandocodigo.treinamento.guestbook.service;

import com.br.revisandocodigo.treinamento.guestbook.model.Guestbook;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GuestbookLocalService}.
 *
 * @author wesleyroberts
 * @see GuestbookLocalService
 * @generated
 */
public class GuestbookLocalServiceWrapper
	implements GuestbookLocalService, ServiceWrapper<GuestbookLocalService> {

	public GuestbookLocalServiceWrapper(
		GuestbookLocalService guestbookLocalService) {

		_guestbookLocalService = guestbookLocalService;
	}

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
	@Override
	public Guestbook addGuestbook(
		Guestbook guestbook) {

		return _guestbookLocalService.addGuestbook(guestbook);
	}

	@Override
	public Guestbook addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.addGuestbook(
			userId, name, serviceContext);
	}

	/**
	 * Creates a new guestbook with the primary key. Does not add the guestbook to the database.
	 *
	 * @param guestBookId the primary key for the new guestbook
	 * @return the new guestbook
	 */
	@Override
	public Guestbook createGuestbook(long guestBookId) {
		return _guestbookLocalService.createGuestbook(guestBookId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public Guestbook deleteGuestbook(
		Guestbook guestbook) {

		return _guestbookLocalService.deleteGuestbook(guestbook);
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
	@Override
	public Guestbook deleteGuestbook(long guestBookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.deleteGuestbook(guestBookId);
	}

	@Override
	public Guestbook deleteGuestbook(
			long guestbookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _guestbookLocalService.deleteGuestbook(
			guestbookId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _guestbookLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestbookLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _guestbookLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _guestbookLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestbookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _guestbookLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public Guestbook fetchGuestbook(long guestBookId) {
		return _guestbookLocalService.fetchGuestbook(guestBookId);
	}

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook, or <code>null</code> if a matching guestbook could not be found
	 */
	@Override
	public Guestbook fetchGuestbookByUuidAndGroupId(
		String uuid, long groupId) {

		return _guestbookLocalService.fetchGuestbookByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _guestbookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _guestbookLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the guestbook with the primary key.
	 *
	 * @param guestBookId the primary key of the guestbook
	 * @return the guestbook
	 * @throws PortalException if a guestbook with the primary key could not be found
	 */
	@Override
	public Guestbook getGuestbook(long guestBookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.getGuestbook(guestBookId);
	}

	/**
	 * Returns the guestbook matching the UUID and group.
	 *
	 * @param uuid the guestbook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbook
	 * @throws PortalException if a matching guestbook could not be found
	 */
	@Override
	public Guestbook getGuestbookByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.getGuestbookByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<Guestbook> getGuestbooks(
		int start, int end) {

		return _guestbookLocalService.getGuestbooks(start, end);
	}

	@Override
	public java.util.List<Guestbook> getGuestbooks(
		long groupId) {

		return _guestbookLocalService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<Guestbook> getGuestbooks(
		long groupId, int start, int end) {

		return _guestbookLocalService.getGuestbooks(groupId, start, end);
	}

	@Override
	public java.util.List<Guestbook> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<Guestbook> obc) {

		return _guestbookLocalService.getGuestbooks(groupId, start, end, obc);
	}

	/**
	 * Returns all the guestbooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbooks
	 * @param companyId the primary key of the company
	 * @return the matching guestbooks, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<Guestbook>
		getGuestbooksByUuidAndCompanyId(String uuid, long companyId) {

		return _guestbookLocalService.getGuestbooksByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<Guestbook>
		getGuestbooksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<Guestbook> orderByComparator) {

		return _guestbookLocalService.getGuestbooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guestbooks.
	 *
	 * @return the number of guestbooks
	 */
	@Override
	public int getGuestbooksCount() {
		return _guestbookLocalService.getGuestbooksCount();
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _guestbookLocalService.getGuestbooksCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _guestbookLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestbookLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public Guestbook updateGuestbook(
		Guestbook guestbook) {

		return _guestbookLocalService.updateGuestbook(guestbook);
	}

	@Override
	public Guestbook updateGuestbook(
			long userId, long guestbookId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _guestbookLocalService.updateGuestbook(
			userId, guestbookId, name, serviceContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _guestbookLocalService.getBasePersistence();
	}

	@Override
	public GuestbookLocalService getWrappedService() {
		return _guestbookLocalService;
	}

	@Override
	public void setWrappedService(GuestbookLocalService guestbookLocalService) {
		_guestbookLocalService = guestbookLocalService;
	}

	private GuestbookLocalService _guestbookLocalService;

}