package com.company;

public class Main {

    public static void main(String[] args) {

        double income= 500;
        double remainder=income;
	Tax []result=new Tax[3];
	result[0]=new FixedTax();
	result[1]=new TaxlnPercentage();
	result[2]=new DynamicTax();
		for (Tax tax : result) {
			remainder -= tax.calculate(income);
		}
		System.out.println(remainder);
    }
}
