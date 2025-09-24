package com.example.JWT_Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "You have accessed a secure endpoint!";
    }
}
