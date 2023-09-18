package com.rs.profileManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.profileManagement.APIException.ApiException;
import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.service.ProfileManagementService;

@RestController
@RequestMapping("/api/profile")
public class ProfileManagementController {
	
	@Autowired
	private ProfileManagementService profileManagementService;
	
	@PostMapping("/signUp")
	public ResponseEntity<SignUpDTO>  signUp(@RequestBody SignUpDTO signUpDTO ) throws ApiException{
		ResponseEntity<SignUpDTO> signUp = profileManagementService.signUp(signUpDTO);
		return signUp;
				
	}
	
	@GetMapping("/signIn")
	public LoginDTO  signIn(@RequestBody LoginDTO loginDto ){
		LoginDTO login= profileManagementService.signIn(loginDto);
		return login ;
				
	}

}
