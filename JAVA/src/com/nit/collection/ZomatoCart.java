package com.nit.collection;

import java.util.HashMap;
import java.util.Map;

public class ZomatoCart {

	public static void main(String[] args) {
	Map<String,Double> cart=new HashMap<String,Double>();
	cart.put("Hyd-Biryani", 99.00);
	cart.put("Masala-Cock", 45.00);
	cart.put("Paneer-Biryani", 299.00);
	cart.put("Dall-Makhani", 169.99);
	cart.put("Panner-Masala ", 149.00);
	cart.put("Kaju-Biryaani", 49.00);
	
	System.out.println(" ============================");
	System.out.println("Food iteam added in the cart");
	System.out.println(cart);
	System.out.println("\n ============================");
	System.out.println("updated the cart");
	cart.remove("Dall-Makhani");
	System.out.println(cart);
	
	System.out.println("\n ==========Invoice==================");
	double totalBill=0.0;
	for(Map.Entry<String,Double> e:cart.entrySet()) {
		System.out.println(e.getKey()+"\tRs: "+e.getValue());
		totalBill+=e.getValue();
		
	}
		System.out.println("Total Bill : "+totalBill);
	}

}
