package com.suvam.mobilestore.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HomeController {

    @GetMapping("/Home")
    public String greet() {
        return "Welcome to our product page";
    }
}
