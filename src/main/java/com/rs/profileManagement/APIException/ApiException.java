package com.rs.profileManagement.APIException;

public class ApiException  extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public ApiException  (String message) {  
		 super(message);
	 } 
	 public ApiException  (String message,Throwable  throwable) {  
		 super(message);
	 } 
	 
	 public static final ApiException DATA_EXSIST(String message,Exception ex) {
		return new ApiException(message,ex);
	 }
	 public static final ApiException DATA_EXSIST(String message) {
		return new ApiException(message);
	 }

}
