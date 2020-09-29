package com.example.demo.controller;

import com.example.demo.service.DataStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

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
    @GetMapping("/advice2")
    public String advice2() {

        return ("advice2");
    }

    @GetMapping("/reducer_dit_madspild")

    public String reducer(Model model) {

        DataStorage dataObj = new DataStorage();
        model.addAttribute("mad",dataObj.tabelData());

        return ("reducer_dit_madspild");
    }

    @GetMapping("/goderåd")
    public String goderåd() {
        return ("goderåd");
    }


    }




