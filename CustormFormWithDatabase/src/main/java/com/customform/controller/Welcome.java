package com.customform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login")
    public String welcome(){
        return "welcome";
    }
}
