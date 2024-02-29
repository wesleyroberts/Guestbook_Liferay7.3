/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.br.revisandocodigo.treinamento.guestbook.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author wesleyroberts
 */
public class NoSuchGuestbookException extends NoSuchModelException {

	public NoSuchGuestbookException() {
	}

	public NoSuchGuestbookException(String msg) {
		super(msg);
	}

	public NoSuchGuestbookException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchGuestbookException(Throwable throwable) {
		super(throwable);
	}

}