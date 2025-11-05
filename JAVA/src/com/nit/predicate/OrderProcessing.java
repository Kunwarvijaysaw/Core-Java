package com.nit.predicate;

import java.util.function.Function;

/*Scenario 2 — Order Processing
--------------------------------
Given an array of Order objects, filter and print only those above ₹10,000.
*******************************************************************************
Function (accepts input, returns output)
Real-world application: Useful in e-commerce, invoice calculations.*/
public class OrderProcessing {

	public static void main(String[] args) {
		
		int arr[]= {10000,15000,8000,7000,12000};
		Function<Integer,Boolean> f=(x)->x>10000;
		for(int x:arr) {
			if(f.apply(x)) {
				System.out.println(x);	
			}
		}
	}

}
