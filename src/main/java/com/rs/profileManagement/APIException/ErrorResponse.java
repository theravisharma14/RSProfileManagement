package com.rs.profileManagement.APIException;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	private String timestamp;
    private HttpStatus status;
    private int error;
    private String message;
    
	public String getTimestamp() {
		return timestamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public int getError() {
		return error;
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
	public void setError(int error) {
		this.error = error;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
