package com.nareshit.registration.system.UserregistrationService.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo-service",url="http://localhost:9092/testservice")
public interface DemoServiceBroker {

    @GetMapping("/test")
    public String test();
}
