package com.rs.profileManagement.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

	public ApiException(String message) {
		super(message);
	}

	public ApiException(String message, HttpStatus status) {
		super();
		this.status = status;
		this.errorMessage = message;
	}

	public ApiException(String message, HttpStatus status, Throwable throwable) {
		super(message);
		this.status = status;
		this.errorMessage = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	 public static final ApiException DATA_EXSIST(String message) {
		 return new ApiException(message);
	 } 
	 
	 public static final ApiException DATA_EXSIST(String message,HttpStatus status,Exception ex) {
		 return new ApiException(message,status,ex);
	 }
	 
	 public static final ApiException DATA_EXSIST(String message, HttpStatus status) {
		 return new ApiException(message, status);
	 }

}
