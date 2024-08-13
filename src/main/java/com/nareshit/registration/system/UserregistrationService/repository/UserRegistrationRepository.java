package com.nareshit.registration.system.UserregistrationService.repository;

import com.nareshit.registration.system.UserregistrationService.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepository extends CrudRepository<UserEntity,Integer> {
}
