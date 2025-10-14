package com.nit.hierarchical_inheritence;

 class Restaurant extends Business{
	 Address address;
	String location;
	int seatingCapacity;
	int parkingArea;
	public Restaurant(String businessName, String businessOwnerName, int noOfEmployees, Address address,
			String location, int seatingCapacity, int parkingArea) {
		super(businessName, businessOwnerName, noOfEmployees);
		this.address = address;
		this.location = location;
		this.seatingCapacity = seatingCapacity;
		this.parkingArea = parkingArea;
	}
	
	
	
	
	
	

	
	
}
