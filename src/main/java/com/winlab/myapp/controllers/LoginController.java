package com.winlab.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @GetMapping("/")
    public String login(ModelMap model) {
        return "login";
    }

    @PostMapping("/")
    public String showWelcome(ModelMap model, @RequestParam String username, @RequestParam String password) {
        model.put("username", username);
        model.put("password", password);

        return "welcome";
    }

}