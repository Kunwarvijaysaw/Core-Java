package com.nit.Upcasting_Oct23;
/*3.Lab Assignment 1 – Object Display in Logging Framework
Title:
Print Order Details for Logging

Objective:
To understand and implement the toString() method in Java to produce
human-readable log messages for objects.

Scenario:
You are developing a shopping platform. The backend system needs to log
each order placed by customers.
Currently, the Order class logs objects in a confusing way, such as:
Order@5e91993f

This happens because Java’s default toString() method prints the class
name followed by the hash code.

To make logs more meaningful, you need to override the toString() method in
the Order class so that it displays the details of the order in a clear,
readable format.

Task:
Create a class named Order with the following fields:
int orderId
String customerName
double amount
Implement a constructor to initialize these fields.
Override the toString() method to return the details in the following format:
Order{orderId=5001, customerName='Alice', amount=1999.0}

In the main method, create an instance of Order and print it using a
logging-style statement.


Test Case:
Order o = new Order(5001, "Alice", 1999.0);
System.out.println("LOG: " + o);

Expected Output:
LOG: Order{orderId=5001, customerName='Alice', amount=1999.0}

Examples
Example 1
Input:
orderId = 5001
customerName = Alice
amount = 1999.0
Output:
LOG: Order{orderId=5001, customerName='Alice', amount=1999.0}
Explanation:
By default, printing an object gives something like: Order@5e91993f After overriding the toString() method, the object displays its data in a readable format.*/
public class OrderUser {

	public static void main(String[] args) {
		Order order=new Order(5001, "KVS", 1999.0);
		System.out.println("LOG: "+order);

	}

}
class Order{
	int orderId;
	String customerName;
	double amount;
	public Order(int orderId, String customerName, double amount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", amount=" + amount + "]";
	}
	
}