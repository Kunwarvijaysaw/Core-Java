package com.nit.collection;

import java.util.HashMap;
import java.util.Map;

public class BankTransection {

	public static void main(String[] args) {
		
		Map<String,String> responses=new HashMap<String, String>();
		responses.put("TXN-001", "Insufficient Funds");
		responses.put("TXN-002", "Incorrect Credentials");
		responses.put("INV-TXN", "Invalid Transection");
		String serverResponse="TXN-005";
		System.out.println("User performed some transection and the transection is"
				+ " failed then goat a server response : "+serverResponse);
		System.out.println("Reason for transaction failure : "+responses.getOrDefault(serverResponse, "Invalid Transection Details"
				+ ""));
		
	}

}
