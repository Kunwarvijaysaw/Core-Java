package Sept05;

import java.util.Scanner;

/*Q1. Indigo Airlines – Flight Reservation System
Question:
Design a FlightBooking business logic class for Indigo Airlines with the following requirements:
Static variable: gstRate = 0.12 (same for all bookings).
Instance variables: passengerName, flightNumber, baseFare.

Methods:
 - A parameterized method calculateFare(int seats) that calculates the total fare including
                        GST (use a local variable for intermediate calculation).
- A non-parameterized method showFlightStatus() that prints flight status.
- A static method convertINRtoUSD(double amountInINR) that converts INR to USD.
- A non-static method displayPassengerDetails() that prints passenger details.

Then, create an execution logic class IndigoApp with main() method to:
- Create at least one booking object.
- Call all four methods and print results.*/

class FlightReservationSystem {
	static double gstRate=0.12;
	String passengerName;
	String flightNumber;
	int baseFare;
//	int availableSeat=60;
	
	public void  calculateFare(int seats) {
		double amount=seats*baseFare;
		System.out.println("Base Amount : "+amount);
		double GST_Amount=amount*gstRate;
		System.out.println("Final Amount : "+(amount+GST_Amount));
		
	}
	public void showFlightStatus() {
//		if(availableSeat>0) {
//			System.out.println("AvailableSeat"+availableSeat);
//			availableSeat--;
//		}else {
//			System.out.println("Not Available seat");
//		}
		System.out.println("Your Flight Air-1011 is on time");
		
	}
	public static void convertINRtoUSD(double amountInINR) {
		double USD_Amount=amountInINR/88.26;
		System.out.println("USD Amount : "+USD_Amount);
		
	}
	public static void main(String[] args) {
		FlightReservationSystem f1= new FlightReservationSystem ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name: ");
		String passengerName =sc.nextLine();
		System.out.println("Enter Flight Number: ");
		String flightNumber =sc.nextLine();
		System.out.println("Enter No of  Ticket: ");
		int seats =sc.nextInt();
		System.out.println("Enter Ticket Amount: ");
		f1.baseFare =sc.nextInt();
		System.out.println("Enter Amount to convert USD : ");
		double amountInINR =sc.nextDouble();
		
		
	System.out.println("Passenger Name: "+passengerName);
	System.out.println("Flight Number:: "+flightNumber);
	System.out.println(" Amount to convert USD  : "+amountInINR);
	f1.calculateFare(seats);
	f1.showFlightStatus();
	f1.convertINRtoUSD(amountInINR);
	
	
	

	}

}
