/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GuestbookEntryService}.
 *
 * @author wesleyroberts
 * @see GuestbookEntryService
 * @generated
 */
public class GuestbookEntryServiceWrapper
	implements GuestbookEntryService, ServiceWrapper<GuestbookEntryService> {

	public GuestbookEntryServiceWrapper(
		GuestbookEntryService guestbookEntryService) {

		_guestbookEntryService = guestbookEntryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestbookEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public GuestbookEntryService getWrappedService() {
		return _guestbookEntryService;
	}

	@Override
	public void setWrappedService(GuestbookEntryService guestbookEntryService) {
		_guestbookEntryService = guestbookEntryService;
	}

	private GuestbookEntryService _guestbookEntryService;

}