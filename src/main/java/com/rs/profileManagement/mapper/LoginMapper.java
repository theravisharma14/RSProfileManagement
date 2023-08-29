package com.rs.profileManagement.mapper;

import org.mapstruct.Mappings;

import com.rs.profileManagement.dto.LoginDTO;
import com.rs.profileManagement.entity.LoginEntity;

public interface LoginMapper {
	@Mappings(value = {  })
	LoginEntity mapEntityToDto(LoginDTO DTO);

}
