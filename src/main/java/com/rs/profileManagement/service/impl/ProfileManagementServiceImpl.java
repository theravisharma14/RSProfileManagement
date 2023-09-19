package com.rs.profileManagement.service.impl;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.dto.LoginResponseDTO;
import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;
import com.rs.profileManagement.exception.ApiException;
import com.rs.profileManagement.repository.LoginRepository;
import com.rs.profileManagement.service.ProfileManagementService;

import io.jsonwebtoken.Jwts;


@Service
public class ProfileManagementServiceImpl implements ProfileManagementService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public ResponseEntity<SignUpDTO> signUp(SignUpDTO signUpDTO) throws ApiException {
		LoginEntity mapEntityToDto = mapEntityToDto(signUpDTO);
		loginRepository.save(mapEntityToDto);
		return  new ResponseEntity<SignUpDTO>(signUpDTO,HttpStatus.CREATED);  
	}

	public LoginEntity mapEntityToDto(SignUpDTO signUpDTO) throws ApiException  {
		LoginEntity loginEntity=null;
		LoginEntity byUserEmail = loginRepository.findUserEmailByUserEmail(signUpDTO.getUserEmail());
		if(byUserEmail!=null && byUserEmail.getUserEmail().equals(signUpDTO.getUserEmail())) {
			 throw ApiException.DATA_EXSIST("Email "+signUpDTO.getUserEmail()+" Already Exist.....",HttpStatus.CONFLICT);
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
	public ResponseEntity<?> signIn(LoginDTO loginDto) throws ApiException  {

		LoginEntity findByEmail = loginRepository.findByUserEmail(loginDto.getUserEmail());
		if(findByEmail == null || findByEmail.getUserEmail().equals(loginDto.getUserEmail()) && !findByEmail.getUserPass().equals(loginDto.getUserPass())) {
			throw ApiException.DATA_EXSIST("Invalid Email or Password ",HttpStatus.BAD_REQUEST);
		}
		else {
			String jwtToken = Jwts.builder()
					.claim("name", findByEmail.getUserName())
					.claim("email", findByEmail.getUserEmail())
					.setSubject(findByEmail.getUserName())
					.setId(UUID.randomUUID().toString())
					.setIssuedAt(Date.from(Instant.now()))
					.setExpiration(Date.from(Instant.now().plus(5l, ChronoUnit.MINUTES)))
					.compact();
			LoginResponseDTO LoginResponseDTO=new LoginResponseDTO();
			LoginResponseDTO.setUserAccessToken(jwtToken);
			return new ResponseEntity<>(LoginResponseDTO,HttpStatus.OK); 
		}
	}
}
