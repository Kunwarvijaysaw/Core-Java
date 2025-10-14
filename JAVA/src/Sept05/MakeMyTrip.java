package Sept05;

import java.util.Scanner;

/*Q2. MakeMyTrip – Hotel Booking
Question:
Create a HotelBooking business logic class with the following requirements:
Static variable: serviceFeeRate = 0.1.
Instance variables: hotelName, nights, pricePerNight.

Methods:
- A parameterized method calculateTotalCost(double discountPercent) that calculates the
           cost including service fee. (Use a local variable for total before discount.)
- A non-parameterized method showRecommendedDestination() that prints a fixed destination like
“Bali”.
- A static method applyServiceFee(double amount) that adds service fee to any given amount.
- A non-static method printBookingReceipt() that prints booking details.

Then, create an execution logic class MakeMyTripApp that:
Creates a hotel booking object.
Calculates cost with discount.
Calls all other methods and displays results.
*/

class MakeMyTrip {
	static double serviceFeeRate = 0.1;
	String hotelName;
	int nights;
	double pricePerNight;
	
	void calculateTotalCost(double discountPercent) {
		double Amount=pricePerNight*nights;
		double serviceCharge= Amount*serviceFeeRate;
		double totalAmount=Amount+serviceCharge;
		double discount=totalAmount*(discountPercent/100);
		double FinalAmount=totalAmount-discount;
		System.out.println("Amount :"+Amount);
		System.out.println("Service Charge : "+serviceCharge);
		System.out.println("Total Amount : "+totalAmount);
		System.out.println("Discount : "+discount);
		System.out.println("Final Price : "+FinalAmount);
	}
	void showRecommendedDestination() {
		System.out.println("Good service");
	}
//	void applyServiceFee(double sAmount) {
//		
//	}
	void printBookingReceipt() {
		System.out.println("Hotel Name :"+hotelName);
		System.out.println("Night :"+nights);
		System.out.println("Price Per nights  : "+pricePerNight);
		
	}
	
	
	public static void main(String[] args) {
		MakeMyTrip m1 =new MakeMyTrip();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Hotel Name :");
		m1. hotelName=sc.nextLine();
		System.out.println("Enter Nights stay :");
		m1. nights=sc.nextInt();
		System.out.println("Enter Price per nights :");
		m1. pricePerNight=sc.nextDouble();
		System.out.println("Enter Discount :");
		int discountPercent=sc.nextInt();
		m1.printBookingReceipt();
		m1.calculateTotalCost(discountPercent);
		m1.showRecommendedDestination();
		
		
	
		
		
		

	}

}
