package com.nit.hierarchical_inheritence;

public class CloudKitchen extends Business {
	String vertualId;

	public CloudKitchen(String businessName, String businessOwnerName, int noOfEmployees, String vertualId) {
		super(businessName, businessOwnerName, noOfEmployees);
		this.vertualId = vertualId;
	}

	
}
