package com.zeal.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String greet(HttpServletRequest httpRequest){
        return "Welcome to home"+ httpRequest.getSession().getId();
    }
}
