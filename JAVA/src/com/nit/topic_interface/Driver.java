package com.nit.topic_interface;

public class Driver {

	public static void main(String[] args) {
		Car car=new Car();
		car.fuelType();
		car.brandName();

	}

}
interface Vehicle{
	public abstract void fuelType();
	
	public abstract void brandName();
}

class Car implements Vehicle{
	@Override
	public  void fuelType() {
		System.out.println("Petrol Fuel.....");
	}
	
	public  void brandName() {
		System.out.println("Brand name TATA....");
	}
	
}