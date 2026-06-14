package com.suvam.mobilestore.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class LoginController {

    @GetMapping("/Login")
    public String login() {
        return "Login Page Loading....";
    }
}
