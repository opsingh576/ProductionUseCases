package com.nareshit.registration.system.UserregistrationService.api;


import com.nareshit.registration.system.UserregistrationService.dto.EmailKeysDTO;
import com.nareshit.registration.system.UserregistrationService.dto.UserDTO;
import com.nareshit.registration.system.UserregistrationService.service.DemoServiceBroker;
import com.nareshit.registration.system.UserregistrationService.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class UserRegistrationApi  {

    @Autowired
    private EmailKeysDTO emailKeysDTO;

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    private DemoServiceBroker demoServiceBroker;

    @PostMapping
    public void register(@RequestBody UserDTO userDTO)
    {
        this.userRegistrationService.register(userDTO);
    }

    @GetMapping("/demo")
     String callDemoService(){

        return this.demoServiceBroker.test();
    }

    @GetMapping("/email")
    public EmailKeysDTO getEmailConfigProperties()
    {
        return emailKeysDTO;

    }

}
