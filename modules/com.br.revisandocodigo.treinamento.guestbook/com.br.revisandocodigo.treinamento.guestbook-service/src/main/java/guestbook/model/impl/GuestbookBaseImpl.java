/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model.impl;

import guestbook.model.Guestbook;

import guestbook.service.GuestbookLocalServiceUtil;

/**
 * The extended model base implementation for the Guestbook service. Represents a row in the &quot;GB_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author wesleyroberts
 * @see GuestbookImpl
 * @see Guestbook
 * @generated
 */
public abstract class GuestbookBaseImpl
	extends GuestbookModelImpl implements Guestbook {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the <code>Guestbook</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			GuestbookLocalServiceUtil.addGuestbook(this);
		}
		else {
			GuestbookLocalServiceUtil.updateGuestbook(this);
		}
	}

}