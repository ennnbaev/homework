package com.company;

public class FixedTax extends Tax {


    @Override
    public double calculate(double income) {

        return tax;
    }
}
