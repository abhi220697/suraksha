package com.ss.suraksha.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home(){
        return "this is home page!";
    }

    @GetMapping("/user")
    public String userRequest(Authentication authentication){
        return "you are user and you have only read authority";
    }

    @GetMapping("/admin")
    public String adminRequest(Authentication authentication){
        return "you are admin and you have superior authority";
    }
}
