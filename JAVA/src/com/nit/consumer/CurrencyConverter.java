/*"Currency Converter
Real-World Scenario:
An e-commerce site needs to display product prices in different currencies based on the user's location.

Expectation:
Use Function<Double, Double> to convert INR to USD (1 USD = 83 INR).

 Sample Input: 8300
Expected Output: ₹8300 = $100.00
Hint: apply()"*/


package com.nit.consumer;

import java.util.Scanner;
import java.util.function.Function;

public class CurrencyConverter {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Entert indian Currency:  ");
	double amt=sc.nextDouble();
	if(amt<0) {
		System.err.println("Inavlid Input");
		System.exit(0);
	}
	Function<Double, Double> f=(rs)->rs/83;
	System.out.println("Indian Currency:  ₹"+amt);
	System.out.println("In Dollar: $"+f.apply(amt));

	}

}
