/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the GuestbookEntry service. Represents a row in the &quot;GB_GuestbookEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author wesleyroberts
 * @see GuestbookEntryModel
 * @generated
 */
@ImplementationClassName("guestbook.model.impl.GuestbookEntryImpl")
@ProviderType
public interface GuestbookEntry extends GuestbookEntryModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>guestbook.model.impl.GuestbookEntryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<GuestbookEntry, Long> ENTRY_ID_ACCESSOR =
		new Accessor<GuestbookEntry, Long>() {

			@Override
			public Long get(GuestbookEntry guestbookEntry) {
				return guestbookEntry.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<GuestbookEntry> getTypeClass() {
				return GuestbookEntry.class;
			}

		};

}