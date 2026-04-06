package com.example.springboot_learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// mark this class as a request handler

public class MyController {

    // GET / - return "Hello Spring Boot" Message
    @GetMapping("/")
    public String display() {
        return "Hello Spring Boot";
    }

    // GET /about - return "About Me" Message
    @GetMapping("/about")
    public String about() {
        return "About Me";
    }
}
