package com.nit.hierarchical_inheritence;

public class Business {
	String businessName;
	String businessOwnerName;
	int noOfEmployees;

	public Business(String businessName, String businessOwnerName, int noOfEmployees) {
		super();
		this.businessName = businessName;
		this.businessOwnerName = businessOwnerName;
		this.noOfEmployees = noOfEmployees;
	}

	public void production(String productType) {

	}

	public void production(Product product) {

	}

	public void applyDiscount(double discount) {

	}

}
