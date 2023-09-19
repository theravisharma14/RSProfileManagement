package com.rs.profileManagement.APIException;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	private String timestamp;
    private HttpStatus status;
    private int statusCode;
    private String message;
    
	public String getTimestamp() {
		return timestamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
