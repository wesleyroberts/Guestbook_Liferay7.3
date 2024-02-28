/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import guestbook.exception.GuestbookEntryEmailException;
import guestbook.exception.GuestbookEntryMessageException;
import guestbook.exception.GuestbookEntryNameException;
import guestbook.model.GuestbookEntry;
import guestbook.service.base.GuestbookEntryLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author wesleyroberts
 */
@Component(
	property = "model.class.name=guestbook.model.GuestbookEntry",
	service = AopService.class
)
public class GuestbookEntryLocalServiceImpl
	extends GuestbookEntryLocalServiceBaseImpl {

	public GuestbookEntry addGuestbookEntry(long userId, long guestbookId, String name,
											String email, String message, ServiceContext serviceContext)
			throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name, email, message);

		long entryId = counterLocalService.increment();

		GuestbookEntry entry = guestbookEntryPersistence.create(entryId);

		entry.setUuid(serviceContext.getUuid());
		entry.setUserId(userId);
		entry.setGroupId(groupId);
		entry.setCompanyId(user.getCompanyId());
		entry.setUserName(user.getFullName());
		entry.setCreateDate(serviceContext.getCreateDate(now));
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setExpandoBridgeAttributes(serviceContext);
		entry.setGuestbookId(guestbookId);
		entry.setName(name);
		entry.setEmail(email);
		entry.setMessage(message);

		guestbookEntryPersistence.update(entry);

		// Calls to other Liferay frameworks go here

		return entry;
	}

	public GuestbookEntry updateGuestbookEntry(long userId, long guestbookId,
											   long entryId, String name, String email, String message,
											   ServiceContext serviceContext)
			throws PortalException, SystemException {

		Date now = new Date();

		validate(name, email, message);

		GuestbookEntry entry =
				guestbookEntryPersistence.findByPrimaryKey(entryId);

		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setName(name);
		entry.setEmail(email);
		entry.setMessage(message);
		entry.setExpandoBridgeAttributes(serviceContext);

		guestbookEntryPersistence.update(entry);

		// Integrate with Liferay frameworks here.

		return entry;
	}

	public GuestbookEntry deleteGuestbookEntry(GuestbookEntry entry) {
		guestbookEntryPersistence.remove(entry);

		return entry;
	}

	public GuestbookEntry deleteGuestbookEntry(long entryId) throws PortalException {

		GuestbookEntry entry =
				guestbookEntryPersistence.findByPrimaryKey(entryId);

		return deleteGuestbookEntry(entry);
	}

	public List<GuestbookEntry> getGuestbookEntries(long groupId, long guestbookId) {
		return guestbookEntryPersistence.findByG_G(groupId, guestbookId);
	}

	public List<GuestbookEntry> getGuestbookEntries(long groupId, long guestbookId,
													int start, int end) throws SystemException {

		return guestbookEntryPersistence.findByG_G(groupId, guestbookId, start,
				end);
	}

	protected void validate(String name, String email, String entry)
			throws PortalException {

		if (Validator.isNull(name)) {
			throw new GuestbookEntryNameException();
		}

		if (!Validator.isEmailAddress(email)) {
			throw new GuestbookEntryEmailException();
		}

		if (Validator.isNull(entry)) {
			throw new GuestbookEntryMessageException();
		}
	}

	public List<GuestbookEntry> getGuestbookEntries(long groupId, long guestbookId,
													int start, int end, OrderByComparator<GuestbookEntry> obc) {

		return guestbookEntryPersistence.findByG_G(groupId, guestbookId, start,
				end, obc);
	}

	public GuestbookEntry getGuestbookEntry(long entryId) throws PortalException {
        return super.getGuestbookEntry(entryId);
    }

	public int getGuestbookEntriesCount(long groupId, long guestbookId) {
		return guestbookEntryPersistence.countByG_G(groupId, guestbookId);
	}
}