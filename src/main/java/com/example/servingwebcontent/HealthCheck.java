package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/up")
    public String checkHealth(){
        return "I am alive";
    }
}