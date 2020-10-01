package com.example.demo.controller;

import com.example.demo.service.DataStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return ("/index");
    }

    @GetMapping("/home")
    public String home() {
        return ("home");
    }

    @GetMapping("/goderaad")
    public String goderaad() {
        return ("goderaad");
    }

    @GetMapping("/numbers")
    public String stats() {
        return ("numbers");
    }

    @GetMapping("/omos")
    public String omos() {
        return ("omos");
    }

    @GetMapping("/hvadkandugøre")
    public String hvadkandugøre() {
        return ("hvadkandugøre");
    }

    @GetMapping("/reducer_dit_madspild")
    public String reducer(Model model) {

        DataStorage dataObj = new DataStorage();
        model.addAttribute("mad", dataObj.tabelData());

        return ("reducer_dit_madspild");
    }

    /*
        @PostMapping("/reducer_dit_madspild")
        public String vedKnapTryk(Model model)
        {
            return("reducer_dit_madspild1");
        }
    */


}



