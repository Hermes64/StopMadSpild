package com.example.demo.service;

import com.example.demo.model.Mad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataStorage
{
    private static ArrayList<Mad> tabelListData = new ArrayList<Mad>();

    public static ArrayList<Mad> tabelData(String madNavn, double amount, String expiredate)
    {
        tabelListData.add(new Mad(madNavn, amount, expiredate));

        return tabelListData;
    }


    public static ArrayList<Mad> tabelData()
    {

        return tabelListData;
    }


}
