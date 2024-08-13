package com.nareshit.registration.system.UserregistrationService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private String email;
    private LocalDate dateOfBirth;
    private String mobileNumber;
}
