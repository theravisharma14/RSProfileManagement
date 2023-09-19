package com.rs.profileManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

	@Query(nativeQuery=true,value = "SELECT * FROM rs_profile_management  rpm where rpm.user_email=?1")
	public LoginEntity findUserEmailByUserEmail(String userEmail);

	@Query(nativeQuery=true,value = "SELECT * FROM rs_profile_management  rpm where rpm.user_email=?1")
	public LoginEntity findByUserEmail(String userEmail);

	
}
