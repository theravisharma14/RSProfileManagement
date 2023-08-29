package com.rs.profileManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.profileManagement.dto.LoginDTO;
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
	public LoginDTO signUp(LoginDTO loginDTO) {
		LoginDTO login=new LoginDTO();
		login.setUserName(loginDTO.getUserName());
		login.setUserPass(loginDTO.getUserPass());
		login.setUserEmail(loginDTO.getUserEmail());
		login.setUserMobile(loginDTO.getUserMobile());
		LoginEntity mapEntityToDto = loginMapper.mapEntityToDto(login);
		return loginRepository.saveLoginData(mapEntityToDto);
	}
}
