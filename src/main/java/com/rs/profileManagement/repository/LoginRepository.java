package com.rs.profileManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

	@Query
	public LoginDTO saveLoginData(LoginEntity login);


}
