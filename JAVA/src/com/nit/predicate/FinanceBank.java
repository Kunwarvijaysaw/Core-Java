/*"Scenario:
You are building a customer filtering module in a banking application.
Customers with a credit score above 700 are considered eligible for personal
loans.

As a developer on the team, your task is to write a simple Java program
that prints the names of eligible customers from a list.

You are given a Customer class that stores:
the name of the customer (e.g., ""Alice"")
an integer value creditScore, which indicates the customer's credit score

Your Task:
Create a Customer class with the required attributes and a constructor.

In the main method:

Create an array of Customer objects.
Use a Predicate<Customer> to define the eligibility rule.
Use a Stream to filter and display the names of eligible customers based on
the rule.

Class and Method Structure:
Class: Customer

Attributes:
String name  
int creditScore
 
Constructor:
Accepts name and creditScore as parameters and initializes the object.

Main Class: EligibleCustomers
In the main(String[] args) method:
Customer[] customers = {
    new Customer(""Alice"", 720),
    new Customer(""Bob"", 680),
    new Customer(""Carol"", 750)
};
Expected Output:
Eligible Customers:
Alice
Carol

Hint:
Use Predicate<Customer> to check if creditScore > 700
Apply .filter(predicate)
Print only the names of eligible customers*/

package com.nit.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class Customer{
	private String name;
	private int creditScore;
	public Customer(String name, int creditScore) {
		super();
		this.name = name;
		this.creditScore = creditScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditScore=" + creditScore + "]";
	}
	
	
}


public class FinanceBank {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of Customer ");
	int n=Integer.parseInt(sc.nextLine());
	
	Customer cust[]=new Customer[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter Customer details : "+(i+1));
		System.out.println("Enter Customer Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Credit score ");
		int creditScore=Integer.parseInt(sc.nextLine());
		cust[i]=new Customer(name,creditScore);
	}
//	Predicate<Customer> loneApprove=(c)->{if(c.getCreditScore()>700) {
//											return true;
//											}else {
//												return false;
//											}
//										};
//	for(Customer c1:cust) {
//		if(loneApprove.test(c1)==true) {
//			System.out.println("Lone Approved... "+c1.getName());
//		}else {
//			System.err.println("Lone Rejected... "+c1.getName());
//		}
//	}
//
//	}
//
//}

	Predicate<Customer> loneApprove = (c) -> c.getCreditScore() > 700;

	for (Customer c1 : cust) {
		if (loneApprove.test(c1)) {
			System.out.println("Lone Approved... " + c1.getName());
		} else {
			System.err.println("Lone Rejected... " + c1.getName());
		}
	}

}

}
