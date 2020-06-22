package com.winlab.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {
    
    @PostMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}