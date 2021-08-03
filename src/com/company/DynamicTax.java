package com.company;

public class DynamicTax extends Tax{

    @Override
    public double calculate(double income) {
        //10% налог
        if(income>=500&&income<=1000){
            return income*0.1;
        }
        //25% налог
        else if(income>=1000){
            return income*0.25;
        }
        //5% налог
        else {
            return income*0.05;
        }

    }
}
