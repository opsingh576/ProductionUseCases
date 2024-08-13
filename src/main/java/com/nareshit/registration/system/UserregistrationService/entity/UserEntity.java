package com.nareshit.registration.system.UserregistrationService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column(name="dob")
    private LocalDate dateOfBirth;

    @Column(name="mobile_number")
    private String mobileNumber;
}
