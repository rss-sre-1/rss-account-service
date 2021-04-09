package com.revature.exceptions;

public class PasswordIsEmptyException extends RuntimeException {

	private static final long serialVersionUID = -7555236886052701784L;

	public PasswordIsEmptyException() {
	}

	public PasswordIsEmptyException(String message) {
		super(message);
	}

	public PasswordIsEmptyException(Throwable cause) {
		super(cause);
	}

	public PasswordIsEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordIsEmptyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
