package com.company;

public class Main {

    public static void main(String[] args) {

        double income= 500;
        double remainder;
	Tax []result=new Tax[3];
	result[0]=new FixedTax();
	result[1]=new TaxlnPercentage();
	result[2]=new DynamicTax();
	remainder=income-result[0].calculate(income)-result[1].calculate(income)-result[2].calculate(income);
		System.out.println(remainder);
    }
}
