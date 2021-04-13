package com.revature.exceptions;

public class AccountTypeAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 7320636187308116945L;

	public AccountTypeAlreadyExistsException(String message) {
		super(message);
	}
}
