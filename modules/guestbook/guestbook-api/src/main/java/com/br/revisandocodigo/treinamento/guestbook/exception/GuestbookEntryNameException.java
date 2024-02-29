/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.br.revisandocodigo.treinamento.guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author wesleyroberts
 */
public class GuestbookEntryNameException extends PortalException {

	public GuestbookEntryNameException() {
	}

	public GuestbookEntryNameException(String msg) {
		super(msg);
	}

	public GuestbookEntryNameException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public GuestbookEntryNameException(Throwable throwable) {
		super(throwable);
	}

}