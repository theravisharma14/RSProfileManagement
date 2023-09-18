package com.rs.profileManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.profileManagement.APIException.ApiException;
import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;
import com.rs.profileManagement.repository.LoginRepository;
import com.rs.profileManagement.service.ProfileManagementService;

import ch.qos.logback.classic.Logger;

@Service
public class ProfileManagementServiceImpl implements ProfileManagementService {
	
	@Autowired
	private LoginRepository loginRepository;
//	@Autowired
//	private LoginMapper loginMapper;
	
	
	@Override
	public ResponseEntity<SignUpDTO> signUp(SignUpDTO signUpDTO) throws ApiException {
		LoginEntity mapEntityToDto = mapEntityToDto(signUpDTO);
		loginRepository.save(mapEntityToDto);
		return  new ResponseEntity<SignUpDTO>(signUpDTO,HttpStatus.CREATED);  
	}

	public  LoginEntity mapEntityToDto(SignUpDTO signUpDTO) throws ApiException  {
		LoginEntity loginEntity=null;
		 SignUpDTO byUserEmail = loginRepository.getByUserEmail(signUpDTO.getUserEmail());
		if(byUserEmail.getUserEmail().equals(signUpDTO.getUserEmail())) {
			 throw ApiException.DATA_EXSIST("Email Already Exist.....");
		}else {
			loginEntity=new LoginEntity();
			loginEntity.setUserName(signUpDTO.getUserName());
			loginEntity.setUserEmail(signUpDTO.getUserEmail());
			loginEntity.setUserPass(signUpDTO.getUserPass());
			loginEntity.setUserType(signUpDTO.getUserType());
			loginEntity.setUserMobile(signUpDTO.getUserMobile());
		}
		return loginEntity;
	}

	@Override
	public LoginDTO signIn(LoginDTO loginDto) {
		
//		LoginDTO findByEmail = loginRepository.findByEmail(loginDto.getUserEmail());
//		if(findByEmail != null){
//			int compareTo = loginDto.getUserEmail().compareTo(findByEmail.getUserEmail());
//			int compareTo2 = loginDto.getUserPass().compareTo(findByEmail.getUserPass());
//			
//		}
		return loginDto;
	}

}
