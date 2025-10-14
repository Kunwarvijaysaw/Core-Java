package Sept11;

import java.util.Scanner;

class Ride {
	private String pickupLocation;
	private String dropLocation;
	private double distance;
	private double fare;
	

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}


	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}


	public void setFare(double fare) {
		this.fare = fare;
	}
	
	public String getPickupLocation() {
		return pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public double getFare() {
		return fare;
	}
	
	public void displayRide() {
		System.out.println("Pickup: "+pickupLocation+", "+"Drop: "+dropLocation+", "+"Distance: "+distance+" km, " +"Fare: "+fare);
		
	}
	
}
	
