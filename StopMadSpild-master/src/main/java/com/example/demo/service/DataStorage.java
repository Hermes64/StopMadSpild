package com.example.demo.service;

import com.example.demo.model.Mad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataStorage
{
    ArrayList<Mad> tabelListData = new ArrayList<Mad>();

    public ArrayList<Mad> tabelData()
    {

        tabelListData.add(new Mad("Kød",2, LocalDate.of(2020,11,5)));
        tabelListData.add(new Mad("Pære",3, LocalDate.of(2020,10,3)));

        System.out.println("Data: "+tabelListData);


        return tabelListData;
    }


}
