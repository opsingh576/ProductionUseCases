package com.nareshit.registration.system.UserregistrationService.dto;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="email.key")
@Data
public class EmailKeysDTO {

    private String apiKey;
    private String clientSecret;
}
