package com.nit.method.aug29;

class RapidoApp {

	public static void main(String[] args) {
		Ride r1 = new Ride();
        Ride r2 = new Ride();
        Ride r3 = new Ride();

        
        r1.setRideDetails(101, "Raju");
        r2.setRideDetails(102, "Amit");
        r3.setRideDetails(103, "Suresh");

        
        r1.calculateFare(10, 20); 
        r2.calculateFare(15, 18); 
        r3.calculateFare(8, 25); 

        
        r1.displayRideInfo();
        r2.displayRideInfo();
        r3.displayRideInfo();

       
        System.out.println("Total Rides Completed: " + Ride.totalRides);
    }
}
