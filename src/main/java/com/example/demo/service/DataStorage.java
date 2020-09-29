package com.example.demo.service;

import com.example.demo.model.Mad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataStorage
{
    private ArrayList<Mad> tabelListData = new ArrayList<Mad>();

    public ArrayList<Mad> tabelData() //String madNavn, double amount, LocalDate expiredate)
    {

        tabelListData.add(new Mad("Kød",2, LocalDate.of(2020,11,5)));
        tabelListData.add(new Mad("Pære",3, LocalDate.of(2020,10,3)));
        //tabelListData.add(new Mad(madNavn, amount, expiredate));

        System.out.println("Data: "+tabelListData);
        return tabelListData;
    }

    public ArrayList<Mad> getTabelListData() {
        return tabelListData;
    }
}
