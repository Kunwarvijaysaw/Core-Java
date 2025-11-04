package com.nit.funtional_Interface;

import java.util.Scanner;

/*User Defined Functional Interface in Java (E-Commerce Discount System)
Objective

To create and use a user-defined functional interface and implement different
discount strategies using lambda expressions.

Problem Description

A shopping portal wants to calculate the final price after applying a discount
based on customer type. The discount percentage varies depending on whether the
customer is REGULAR, SILVER, or GOLD.
You must implement the logic using a Functional Interface and Lambda Expressions.

Interface Specification
Interface Name: DiscountStrategy
Method Signature: double applyDiscount(double price);

Class Specification

Class Name (with main method): ShoppingCart

Variables inside main:
double productPrice
String customerType

Discount Rules
Customer Type Discount % Final Price Formula
REGULAR          5% price * 0.95
SILVER  10% price * 0.90
GOLD  20% price * 0.80
Validations

productPrice must be a positive value
➤ If not valid, display: "Invalid price entered!"

customerType must be "REGULAR", "SILVER", or "GOLD" (case-insensitive)
➤ If invalid, display: "Invalid customer type!"

Examples
Example 1
Input:
1000 REGULAR
Output:
Final Price = 950.0*/

@FunctionalInterface
interface DiscountStrategy {
    double applyDiscount(double price);
}
public class ShoppingCart {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter product price: ");
	        double productPrice = sc.nextDouble();

	        if (productPrice <= 0) {
	            System.out.println("Invalid price entered!");
	            return;
	        }

	        System.out.print("Enter customer type (REGULAR/SILVER/GOLD): ");
	        String customerType = sc.next().toUpperCase();

	        DiscountStrategy regular = price -> price * 0.95;
	        DiscountStrategy silver = price -> price * 0.90;
	        DiscountStrategy gold = price -> price * 0.80;

	        double finalPrice;

	        switch (customerType) {
	            case "REGULAR":
	                finalPrice = regular.applyDiscount(productPrice);
	                break;

	            case "SILVER":
	                finalPrice = silver.applyDiscount(productPrice);
	                break;

	            case "GOLD":
	                finalPrice = gold.applyDiscount(productPrice);
	                break;

	            default:
	                System.out.println("Invalid customer type!");
	                return;
	        }

	        System.out.println("Final Price = " + finalPrice);

	}

}
