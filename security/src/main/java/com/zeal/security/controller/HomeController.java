package com.zeal.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String greet(HttpServletRequest httpRequest){
        return "Welcome to home"+ httpRequest.getSession().getId();
    }


}
