package Sept01;

import java.util.Scanner;

class UberRide {
	static String companyName;// every uber ride belongs to UT
	String driverName;// every uber ride has different driver assigned
	double fare;// every uber ride has different fare

	public  void displayRideDetails() {
		
//		ride1.driverName = "Srinivas";
//		ride1.fare = 400.8;
//		UberRide ride2 = new UberRide();
//		ride2.driverName = "Sanjib";
//		ride2.fare = 230;
		System.out.println("Ride 1 details: ");
		System.out.println("Company name: " + companyName);
		System.out.println("Driver name: " +driverName);
		System.out.println("Fare: Rs. " +fare);

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		UberRide r1=new UberRide();
		System.out.println("Enter Company Name : ");
		String companyName=sc.nextLine();
		System.out.println("Enter Driver Name : ");
		String driverName=sc.nextLine();
		System.out.println("Enter Fare : ");
		double fare=sc.nextDouble();
		r1.companyName=companyName;
		r1.driverName=driverName;
		r1.fare=fare;
		r1.displayRideDetails();
	}
}
