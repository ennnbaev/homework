package com.company;

public class TaxlnPercentage extends Tax{


    @Override
    public double calculate(double income) {
        return income*(tax/100);
    }
}
