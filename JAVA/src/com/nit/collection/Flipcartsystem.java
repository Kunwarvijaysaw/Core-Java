package com.nit.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 -add item to cart and display the cart
 -make payment
 -payment successfully then cart is empty
 -display cart

 * */
public class Flipcartsystem {
	public static void main(String[] args) {
		Map<String,Double> cart=new TreeMap<String,Double>();
		cart.put("Shirt", 499.00);
		cart.put("Jeans", 999.00);
//		cart.put("Shoes", 1200.00);
//		cart.put("T-Shirt", 799.00);
		System.out.println("Product in Cart");
		cart.forEach((p,a)->System.out.println(p+" Rs. "+a));
		double totalBill=0.0;
		
		for(Map.Entry<String,Double> e:cart.entrySet()) {
			totalBill+=e.getValue();
			
		}
			System.out.println("Total Bill : "+totalBill);
		boolean paymentDone=true;
		if(paymentDone==true) {
			cart.clear();
		}
		System.out.println("Payment Done");
		if(cart.isEmpty()==true) {
			System.out.println("No product available in the cart");
		}else {
			cart.forEach((p,a)->System.out.println(p+" Rs. "+a));
		}
	}

}
