package com.nit.multiThreading;

class ParkingSpot {
	boolean isParkingOccupied=false;
	public synchronized void enterParking(String user1) {
		while(isParkingOccupied) {
			System.out.println(user1+" Waiting outside the Parking");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isParkingOccupied=true;
		System.out.println(user1+" Enter the parking...");
	}
	public synchronized void leaveParking(String user1) {
		isParkingOccupied=false;
		System.out.println(user1+" leave the parking...");
		notify();
	}
	
	
}
class Car extends Thread{
	private ParkingSpot parkingSpot;
	private String name;
	public Car(ParkingSpot parkingSpot, String name) {
		super();
		this.parkingSpot = parkingSpot;
		this.name = name;
	}
	@Override
	public void run() {
		parkingSpot.enterParking(name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		parkingSpot.leaveParking(name);
	}
	
}

public class CarParkingSystem {

	public static void main(String[] args) {
		ParkingSpot p=new ParkingSpot();
		Car c1=new Car(p, "swift");
		Car c2=new Car(p, "lamborgini");
		
		c1.start();
		c2.start();
		
		
		

	}

}
