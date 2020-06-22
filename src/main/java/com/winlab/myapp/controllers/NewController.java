package com.winlab.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewController {

    @GetMapping("/new")
    public String newUser() {
        return "newUser";
    }

    @PostMapping("/new")
    public String showWelcome() {
        return "welcome";
    }
    
}