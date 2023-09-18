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
		SignUpDTO signup=new SignUpDTO();
		signup.setUserName(signUpDTO.getUserName());
		signup.setUserPass(signUpDTO.getUserPass());
		signup.setUserEmail(signUpDTO.getUserEmail());
		signup.setUserMobile(signUpDTO.getUserMobile());
		LoginEntity mapEntityToDto = loginMapper.mapEntityToDto(signup);
		return loginRepository.saveLoginData(mapEntityToDto);
	}


	@Override
	public LoginDTO signIn(LoginDTO loginDto) {
		
		LoginDTO findByEmail = loginRepository.findByEmail(loginDto.getUserEmail());
		if(findByEmail != null){
			int compareTo = loginDto.getUserEmail().compareTo(findByEmail.getUserEmail());
			int compareTo2 = loginDto.getUserPass().compareTo(findByEmail.getUserPass());
			
		}
		return loginDto;
	}

}
