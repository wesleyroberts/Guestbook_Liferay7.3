/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.br.revisandocodigo.treinamento.guestbook.service.persistence;

import com.br.revisandocodigo.treinamento.guestbook.exception.NoSuchGuestbookEntryException;
import com.br.revisandocodigo.treinamento.guestbook.model.GuestbookEntry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the guestbook entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wesleyroberts
 * @see GuestbookEntryUtil
 * @generated
 */
@ProviderType
public interface GuestbookEntryPersistence
	extends BasePersistence<GuestbookEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GuestbookEntryUtil} to access the guestbook entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the guestbook entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(String uuid);

	/**
	 * Returns a range of all the guestbook entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the guestbook entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbook entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guestbook entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbook entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbook entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbook entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbook entries before and after the current guestbook entry in the ordered set where uuid = &#63;.
	 *
	 * @param entryId the primary key of the current guestbook entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbook entry
	 * @throws NoSuchGuestbookEntryException if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByUuid_PrevAndNext(
			long entryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbook entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of guestbook entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guestbook entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the guestbook entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuestbookEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the guestbook entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the guestbook entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the guestbook entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guestbook entry that was removed
	 */
	public GuestbookEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the number of guestbook entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guestbook entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the guestbook entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the guestbook entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the guestbook entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbook entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guestbook entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbook entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbook entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbook entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbook entries before and after the current guestbook entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entryId the primary key of the current guestbook entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbook entry
	 * @throws NoSuchGuestbookEntryException if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByUuid_C_PrevAndNext(
			long entryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbook entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of guestbook entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guestbook entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the guestbook entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId);

	/**
	 * Returns a range of all the guestbook entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end);

	/**
	 * Returns an ordered range of all the guestbook entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbook entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guestbook entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guestbook entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByG_G_First(
			long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbook entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByG_G_First(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbook entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbook entry could not be found
	 */
	public GuestbookEntry findByG_G_Last(
			long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbook entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbook entry, or <code>null</code> if a matching guestbook entry could not be found
	 */
	public GuestbookEntry fetchByG_G_Last(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbook entries before and after the current guestbook entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param entryId the primary key of the current guestbook entry
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbook entry
	 * @throws NoSuchGuestbookEntryException if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByG_G_PrevAndNext(
			long entryId, long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbook entries where groupId = &#63; and guestbookId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 */
	public void removeByG_G(long groupId, long guestbookId);

	/**
	 * Returns the number of guestbook entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the number of matching guestbook entries
	 */
	public int countByG_G(long groupId, long guestbookId);

	/**
	 * Caches the guestbook entry in the entity cache if it is enabled.
	 *
	 * @param guestbookEntry the guestbook entry
	 */
	public void cacheResult(GuestbookEntry guestbookEntry);

	/**
	 * Caches the guestbook entries in the entity cache if it is enabled.
	 *
	 * @param guestbookEntries the guestbook entries
	 */
	public void cacheResult(java.util.List<GuestbookEntry> guestbookEntries);

	/**
	 * Creates a new guestbook entry with the primary key. Does not add the guestbook entry to the database.
	 *
	 * @param entryId the primary key for the new guestbook entry
	 * @return the new guestbook entry
	 */
	public GuestbookEntry create(long entryId);

	/**
	 * Removes the guestbook entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry that was removed
	 * @throws NoSuchGuestbookEntryException if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry remove(long entryId)
		throws NoSuchGuestbookEntryException;

	public GuestbookEntry updateImpl(GuestbookEntry guestbookEntry);

	/**
	 * Returns the guestbook entry with the primary key or throws a <code>NoSuchGuestbookEntryException</code> if it could not be found.
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry
	 * @throws NoSuchGuestbookEntryException if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry findByPrimaryKey(long entryId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the guestbook entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the guestbook entry
	 * @return the guestbook entry, or <code>null</code> if a guestbook entry with the primary key could not be found
	 */
	public GuestbookEntry fetchByPrimaryKey(long entryId);

	/**
	 * Returns all the guestbook entries.
	 *
	 * @return the guestbook entries
	 */
	public java.util.List<GuestbookEntry> findAll();

	/**
	 * Returns a range of all the guestbook entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @return the range of guestbook entries
	 */
	public java.util.List<GuestbookEntry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the guestbook entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of guestbook entries
	 */
	public java.util.List<GuestbookEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbook entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbook entries
	 * @param end the upper bound of the range of guestbook entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of guestbook entries
	 */
	public java.util.List<GuestbookEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the guestbook entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of guestbook entries.
	 *
	 * @return the number of guestbook entries
	 */
	public int countAll();

}