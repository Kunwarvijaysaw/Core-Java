/*Scenario:
In a billing system, once a bill is computed, the system should:

Apply a discount to the total amount

Display the final bill summary

Requirement:
Write a Java program that:

Defines a Bill class with id, name, amount, and discount (as a percentage)

Uses two Consumer<Bill> instances:

One to apply the discount and compute the new amount

Another to print the bill summary

Chain them using .andThen()

Apply the combined consumer to a list of bills

Class and Method Structure:
Class: Bill
Attributes:
int id
String name
double amount
double discount (e.g., 10 for 10%)

Constructor:
Bill(int id, String name, double amount, double discount)

Sample Input:
Bill[] bills = {
    new Bill(301, ""Ethan"", 5000, 10),
    new Bill(302, ""Sophie"", 3000, 5)
};

Expected Output:
Discount Applied: ₹500 for Ethan
Final Bill for Ethan: ₹4500

Discount Applied: ₹150 for Sophie
Final Bill for Sophie: ₹2850

Hint:
Use Consumer<Bill> like:
Consumer<Bill> applyDiscount = b -> {
    double discountAmt = b.amount * b.discount / 100;
    System.out.println(""Discount Applied: ₹"" + (int)discountAmt + "" for "" + b.name);
    b.amount -= discountAmt;
};

Consumer<Bill> printSummary = b ->
    System.out.println(""Final Bill for "" + b.name + "": ₹"" + (int)b.amount);

Consumer<Bill> billingProcess = applyDiscount.andThen(printSummary);
Loop through:
for (Bill b : bills) {
    billingProcess.accept(b);
    System.out.println(); // For spacing
}"*/

package com.nit.consumer;

import java.util.function.Consumer;

public class Bill {
	int id;
	String name;
	double amount;
	double discount;
	
	
	public Bill(int id, String name, double amount, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discount = discount;
	}


	public static void main(String[] args) {
		Bill[] bills = {
			    new Bill(301, "Ethan", 5000, 10),
			    new Bill(302, "Sophie", 3000, 5)
			};
		
		Consumer<Bill> applyDiscount = b -> {
		    double discountAmt = b.amount * b.discount / 100;
		    System.out.println("Discount Applied: ₹" + (int)discountAmt + " for " + b.name);
		    b.amount -= discountAmt;
		};

		Consumer<Bill> printSummary = b ->
		    System.out.println("Final Bill for " + b.name + ": ₹" + (int)b.amount);

		Consumer<Bill> billingProcess = applyDiscount.andThen(printSummary);
		
		for (Bill b : bills) {
		    billingProcess.accept(b);
		    System.out.println(); 
		}

	}

}
