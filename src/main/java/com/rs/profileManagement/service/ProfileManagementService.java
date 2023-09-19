package com.rs.profileManagement.service;

import org.springframework.http.ResponseEntity;

import com.rs.profileManagement.exception.ApiException;
import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.SignUpDTO;

public interface ProfileManagementService {
	
	public ResponseEntity<SignUpDTO> signUp(SignUpDTO signUpDTO) throws ApiException ;
	
	public ResponseEntity<?> signIn(LoginDTO loginDto) throws ApiException;

}
