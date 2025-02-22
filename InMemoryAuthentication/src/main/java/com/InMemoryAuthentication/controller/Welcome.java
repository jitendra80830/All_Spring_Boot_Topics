package com.InMemoryAuthentication.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class Welcome {

    @GetMapping("/get")
    public String welcome(Authentication authentication){
        return "Welcome to user "+authentication.getName() +" to spring";
    }
}
