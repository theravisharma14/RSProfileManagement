package com.rs.profileManagement.service;

import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.SignUpDTO;

public interface ProfileManagementService {
	
	public SignUpDTO signUp(SignUpDTO signUpDTO) ;
	
	public LoginDTO signIn(LoginDTO loginDto);

}
