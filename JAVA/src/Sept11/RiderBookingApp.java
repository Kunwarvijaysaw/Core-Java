package Sept11;

import java.util.Scanner;

public class RiderBookingApp {
	public static void main(String[] args) {
		 
		Scanner sc =new Scanner (System.in);
		Ride r = new Ride();
		System.out.println("Enter pickupLocation : ");
		r.setPickupLocation(sc.nextLine());
		System.out.println("Enter dropLocation : ");
		r.setDropLocation(sc.nextLine());
		System.out.println("Enter distance : ");
		r.setDistance(sc.nextDouble());
		
		RideService s1=new RideService();
		s1.calculateFare(r);
		if(r.getDistance()>0) {
		r.displayRide();
		
		}
		
	}
}
