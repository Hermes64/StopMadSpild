package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return ("/index");
    }
        @GetMapping("/advices")
        public String advices() {
            return ("advices");
        }
    @GetMapping("/home")
    public String home() {
        return ("home");
    }

    }




