package com.example.demo.controller;

import com.example.demo.model.Mad;
import com.example.demo.service.DataStorage;
import com.example.demo.service.ResterendeDage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.util.Date;

@Controller
public class MyController {
    ResterendeDage objRestDays = new ResterendeDage();


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
        Mad mad = new Mad();
        model.addAttribute("mad", mad);

        return "reducer_dit_madspild";
    }

    @PostMapping("/reducer_dit_madspild")
    public String vedKnapTryk(Model model, @ModelAttribute("mad") Mad mad) {
        //Fylder arrayList med data fra textfields
        DataStorage.tabelData(mad.getMadNavn(), mad.getAmount(), objRestDays.resterendeDage(mad.getExpireDate()));

        //skal fange dato String
        System.out.println("Dette er dato string: " + mad.getExpireDate());

        //konvertere til LocalDate
        //LocalDate expireDate = LocalDate.parse(mad.getExpireDate());
        //System.out.println("Dette er dato LocalDate: " + expireDate);

        //skal omregne dato til resterende dage
        //long resterendeDage = ChronoUnit.DAYS.between(LocalDate.now(),expireDate );
        //System.out.println("Antal dage imellem: " + resterendeDage);

        //Skal konvertere fra long til String
        //String resterendeDageString = String.valueOf(resterendeDage);
        //skal indsætte resterende dage i tabel


        //Indsætter data i tabel fra ArrayList
        model.addAttribute("mad1", DataStorage.tabelData());


        return "reducer_dit_madspild";
    }
}


