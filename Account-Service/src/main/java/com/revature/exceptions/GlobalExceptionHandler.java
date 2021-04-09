package com.revature.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request){
		String bodyOfResponse = "User dose not exist";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(AccountIdException.class)
	public ResponseEntity<Object> handleAccountIdException(AccountIdException ex, WebRequest request){
		String bodyOfResponse = "Account type does not exist";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<Object> handleAccountNotFoundException(AccountNotFoundException ex, WebRequest request){
		String bodyOfResponse = "Account does not exist";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(PasswordIsEmptyException.class)
	public ResponseEntity<Object> handlePasswordIsEmptyException(PasswordIsEmptyException ex, WebRequest request){
		String bodyOfResponse = "Password is empty";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(EmptyBodyException.class)
	public ResponseEntity<Object> handleEmptyBodyException(EmptyBodyException ex, WebRequest request){
		String bodyOfResponse = "Body of post request is empty";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
}
