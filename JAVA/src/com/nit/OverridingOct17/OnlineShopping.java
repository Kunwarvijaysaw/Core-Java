package com.nit.OverridingOct17;

class OnlineShopping {

	public static void main(String[] args) {
		Electronics electronics=new Electronics("Laptop", 12000, "Dell");
		electronics.displayinfo();
		System.out.println("Total Cost : Rs. "+electronics.calculateTotalCost(2)+"\n");
		
		Clothing clothing = new Clothing("Louis Phillipe", 4500,"M");
		clothing.displayInfo();
		System.out.println("Total cost : Rs."+clothing.calculateTotalCost(2));
	}

}
