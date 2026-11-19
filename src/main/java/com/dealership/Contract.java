package com.dealership;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Contract {
    private String date;
    private String vehicleSold;
    private String name;
    private String email;


    public Contract( String date, String email, String name, String vehicleSold) {

        this.date = date;
        this.email = email;
        this.name = name;
        this.vehicleSold = vehicleSold;
    }

    public abstract BigDecimal getTotalPrice();


    public abstract BigDecimal getMonthlyPayment();




    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }



    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
