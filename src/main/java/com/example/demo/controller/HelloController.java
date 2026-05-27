package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps Demo Project";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully";
    }

    @GetMapping("/about")
    public String about() {
        return "Spring Boot DevOps Project";
    }
}