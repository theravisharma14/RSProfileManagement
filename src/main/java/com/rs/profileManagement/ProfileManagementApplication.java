package com.rs.profileManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableConfigurationProperties
@ImportResource({"classpath*:applicationContext.xml"})
public class ProfileManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileManagementApplication.class, args);
	}

}
