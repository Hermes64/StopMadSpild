package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mad
{
    private String madNavn;
    private double amount;
    private String expireDate;

    public Mad(){}

    public Mad(String madNavn, double amount, String expireDate) {
        this.madNavn = madNavn;
        this.amount = amount;
        this.expireDate = expireDate;
    }

    public String getMadNavn() {
        return madNavn;
    }

    public void setMadNavn(String madNavn) {
        this.madNavn = madNavn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Mad{" +
                "madNavn='" + madNavn + '\'' +
                ", amount=" + amount +
                ", expireDate=" + expireDate +
                '}';
    }
}
