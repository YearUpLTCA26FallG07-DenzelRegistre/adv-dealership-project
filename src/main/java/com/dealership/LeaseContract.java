package com.dealership;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LeaseContract extends Contract{
    public LeaseContract(String contractType, LocalDateTime dateTime, String email, BigDecimal monthlyPayment, String name, String vehicleSold) {
        super(contractType, dateTime, email, monthlyPayment, name, vehicleSold);
    }
}
