package com.rs.profileManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rs.profileManagement.dto.SignUpDTO;
import com.rs.profileManagement.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long>{

	@Query(nativeQuery=true,name= "SELECT * FROM rs_profile_management where user_email=1?")
	public SignUpDTO getByUserEmail(@Param("userEmail") String userEmail);

//	@Query(nativeQuery=true,name= "SELECT user_email FROM rs_profile_management where user_email=?1")
//	public SignUpDTO findByEmail(String userEmail);
	
}
