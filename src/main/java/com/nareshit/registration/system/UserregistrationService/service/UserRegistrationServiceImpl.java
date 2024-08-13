package com.nareshit.registration.system.UserregistrationService.service;

import com.nareshit.registration.system.UserregistrationService.dto.UserDTO;
import com.nareshit.registration.system.UserregistrationService.entity.UserEntity;
import com.nareshit.registration.system.UserregistrationService.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    private UserRegistrationRepository userRegistrationRepository;

    @Override
    public void register(UserDTO userDTO) {

        //changing userDTO to userEntity
        UserEntity userEntity = UserEntity.builder()
                .email(userDTO.getEmail())
                .mobileNumber(userDTO.getMobileNumber())
                .dateOfBirth(userDTO.getDateOfBirth())
                .build();

        this.userRegistrationRepository.save(userEntity); //save(parameters) parameters has to be Entity type
    }
}
