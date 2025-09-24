package com.example.JWT_Security.controller;

import com.example.JWT_Security.jwtUtil.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        // Dummy authentication (replace with real user validation)
        if ("user".equals(username) && "password".equals(password)) {
            return JwtUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
