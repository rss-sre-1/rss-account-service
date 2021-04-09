package com.revature.exceptions;

public class AccountIdException extends RuntimeException {
	
	private static final long serialVersionUID = 3108239816009738151L;

	public AccountIdException() {
		super();
	}

	public AccountIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccountIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountIdException(String message) {
		super(message);
	}

	public AccountIdException(Throwable cause) {
		super(cause);
	}

}
