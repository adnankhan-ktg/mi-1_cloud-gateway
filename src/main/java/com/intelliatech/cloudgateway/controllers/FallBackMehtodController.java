package com.intelliatech.cloudgateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMehtodController {



    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack1() {
        return "user service is down, please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String contactServiceFallBack() {
        return "department service is down please try again later";
    }

    @GetMapping("/employeeServiceFallBack")
    public String employeeServiceFallBack() {
        return "employee service is down please try again later";
    }
}
