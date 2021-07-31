package com.company;

public class DynamicTax extends Tax{

    @Override
    public double calculate(double dohod) {
        if(dohod>=500&&dohod<=1000){
            return 10;
        }
        else if(dohod>=1000){
return 25;
        }
        else {
            return 5;
        }

    }
}
