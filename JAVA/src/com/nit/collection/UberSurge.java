package com.nit.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class UberSurge {

	public static void main(String[] args) {
		Map<String, Double> location=new LinkedHashMap<String, Double>();
		location.put("Gachibowli",200.0);
		location.put("Secundrabad",120.0);
		location.put("Hitech-City",150.0);
		location.put("JNTU",180.0);
		location.put("CharlaPalli",300.);
		System.out.println("Price Chart for  Taxi fare as per Location in normal time");
		for(Map.Entry<String,Double> e :location.entrySet()) {
		System.out.println(e.getKey()+" : Rs. "+e.getValue());
		}
		System.out.println("Rain Start");
		System.out.println("Price surge 1.5x time due to rain");
		location.replaceAll((loc, price)->price*1.5);
		location.forEach((l,a)->System.out.println(l+" Rs. "+a));

	}

}
