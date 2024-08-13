package com.nareshit.registration.system.UserregistrationService;

import com.nareshit.registration.system.UserregistrationService.dto.EmailKeysDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties(EmailKeysDTO.class)
@EnableFeignClients
public class UserRegistrationSystem {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationSystem.class, args);
	}

}
