package com.rs.profileManagement.mapper;

import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;

public class LoginMapper {
//	@Mappings(value = { "userEmail",  "userEmail" })
//	LoginEntity mapEntityToDto(SignUpDTO DTO);
	public  LoginEntity mapEntityToDto(SignUpDTO signUpDTO) {
		LoginEntity loginEntity=new LoginEntity();
		loginEntity.setUserName(signUpDTO.getUserName());
		loginEntity.setUserEmail(signUpDTO.getUserEmail());
		loginEntity.setUserPass(signUpDTO.getUserPass());
		loginEntity.setUserType(signUpDTO.getUserType());
		return loginEntity;
	}
 
}
