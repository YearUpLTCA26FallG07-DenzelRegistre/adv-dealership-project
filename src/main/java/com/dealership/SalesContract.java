package com.dealership;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SalesContract extends Contract{
    private BigDecimal recordingFee;
    private boolean finance;
    private BigDecimal totalPrice;

    public SalesContract(String contractType, LocalDateTime dateTime, String email, BigDecimal monthlyPayment, String name, String vehicleSold) {
        super(contractType, dateTime, email, monthlyPayment, name, vehicleSold);
    }




}

