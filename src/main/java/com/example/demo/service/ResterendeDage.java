package com.example.demo.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ResterendeDage {

    /**
     * Denne metode tager en string-dato "yyyy-mm-dd" og beregner antal dage fra dagsDato
     * @param expireDate_
     * @return
     */
    public String resterendeDage(String expireDate_)
    {
        //rfrfrfrf
        //konvertere til LocalDate
        LocalDate expireDate = LocalDate.parse(expireDate_);
        System.out.println("Dette er dato LocalDate: " + expireDate);

        //skal omregne dato til resterende dage
        long resterendeDage = ChronoUnit.DAYS.between(LocalDate.now(),expireDate );
        System.out.println("Antal dage imellem: " + resterendeDage);

        //Skal konvertere fra long til String
        String resterendeDageString = String.valueOf(resterendeDage);


        return resterendeDageString;
    }



}
