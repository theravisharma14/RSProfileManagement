package com.rs.profileManagement.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<Object> handleApiException(ApiException ex, WebRequest request) {
		ErrorResponse body = new ErrorResponse();
		body.setTimestamp(LocalDateTime.now().toString());
		body.setMessage(ex.getErrorMessage());
		body.setStatusCode(ex.getStatus().value());
		body.setStatus(ex.getStatus());
		return new ResponseEntity<>(body, ex.getStatus());
	}
	

}
