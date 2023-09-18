package com.rs.profileManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;
import com.rs.profileManagement.mapper.LoginMapper;
import com.rs.profileManagement.repository.LoginRepository;
import com.rs.profileManagement.service.ProfileManagementService;

@Service
public class ProfileManagementServiceImpl implements ProfileManagementService {
	
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private LoginMapper loginMapper;
	
	
	@Override
	public SignUpDTO signUp(SignUpDTO signUpDTO) {
		SignUpDTO login=new SignUpDTO();
		login.setUserName(signUpDTO.getUserName());
		login.setUserPass(signUpDTO.getUserPass());
		login.setUserEmail(signUpDTO.getUserEmail());
		login.setUserMobile(signUpDTO.getUserMobile());
		LoginEntity mapEntityToDto = loginMapper.mapEntityToDto(login);
		return loginRepository.saveLoginData(mapEntityToDto);
	}


	@Override
	public LoginDTO signIn(LoginDTO loginDto) {
		
		
		
		return loginDto;
	}
}
