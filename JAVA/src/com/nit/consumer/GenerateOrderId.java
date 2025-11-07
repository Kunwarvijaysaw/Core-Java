/*"E-Commerce – Generate Unique Order ID
Scenario: An online store generates a unique order ID (e.g., ""ORD12345"") each time a new order is placed.

Requirement: Use Supplier<String> to generate an alphanumeric order ID.

Sample Input:
No input required.

Expected Output:
New Order ID: ORD84392*/

package com.nit.consumer;

import java.util.function.Supplier;

public class GenerateOrderId {

	public static void main(String[] args) {
		
    Supplier<String> s=()->"ORD"+(int)(Math.random()*100000);
    System.out.println("Your Generated orderId: "+s.get());
	}

}
