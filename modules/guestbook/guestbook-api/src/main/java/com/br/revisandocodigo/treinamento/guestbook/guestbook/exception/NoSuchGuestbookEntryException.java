/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package guestbook.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author wesleyroberts
 */
public class NoSuchGuestbookEntryException extends NoSuchModelException {

	public NoSuchGuestbookEntryException() {
	}

	public NoSuchGuestbookEntryException(String msg) {
		super(msg);
	}

	public NoSuchGuestbookEntryException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchGuestbookEntryException(Throwable throwable) {
		super(throwable);
	}

}