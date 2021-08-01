package com.company;

public class DynamicTax extends Tax{

    @Override
    public double calculate(double income) {
        if(income>=500&&income<=1000){
            return 10;
        }
        else if(income>=1000){
return 25;
        }
        else {
            return 5;
        }

    }
}
