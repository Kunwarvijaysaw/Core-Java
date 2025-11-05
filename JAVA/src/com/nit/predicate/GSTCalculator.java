package com.nit.predicate;

import java.util.Scanner;
import java.util.function.Function;

/*Function (accepts input, returns output)
Real-world application: Useful in e-commerce, invoice calculations.
Scenario 3 — Price Calculation with Tax
------------------------------------------
Write a Function<Double, Double> that applies 18% GST to a product price.
Function<Double, Double> applyGST = price -> price + (price * 0.18);
System.out.println(applyGST.apply(1000.0)); // 1180.0*/
public class GSTCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price");
		double price =sc.nextDouble();
		Function<Double,Double> applyGST=(p)->p*1.18;
		System.out.println(price+" of 18% is : "+applyGST.apply(price));

	}

}
