package com.nit.abstract_Oct25;

/*Wap for the following requirnment:

=create 2 absratct methods in a class 
-complete the first abstract method in the immediate sub class.
-complete the swcond abstract method in the nct level of sub class .
=create object in the main class and call the completed method .*/


class VehicleTester {

	public static void main(String[] args) {
		ElectricCar e1 = new ElectricCar();
		e1.startEngine();
		e1.stopEngine();

	}

}

abstract class Vehicle {
	public abstract void startEngine();

	public abstract void stopEngine();
}

abstract class Car extends Vehicle {

	public void startEngine() {
		System.out.println("Start the Car using Key");
	}

}

class ElectricCar extends Car {
	public void stopEngine() {
		System.out.println("Brake applied. Engine  killed. Car stopped");
	}
}
