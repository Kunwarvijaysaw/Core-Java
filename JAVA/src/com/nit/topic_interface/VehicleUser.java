package com.nit.topic_interface;
/*Problem: Vehicle Hybrid Behavior
--------------------------------------
Problem Description
Design a program to demonstrate inheritance and interface implementation
in Java.

Create a base class Vehicle with a method:
showType() → prints ""Generic Vehicle""
Create a subclass Car that extends Vehicle and overrides
showType() → ""Vehicle Type: Car""

Create a subclass Truck that extends Vehicle and implements the interface
ElectricVehicle

Create an interface ElectricVehicle with method
showHybridFeature() → prints ""Hybrid Feature: Electric Assist Enabled""

Demonstrate the behavior by creating objects of Car and Truck and calling
the respective methods.

🔹 Input
Create Car object
Create Truck object
Call showType() on both
Call showHybridFeature() on Truck

🔹 Expected Output
Car Type: Vehicle Type: Car
Truck Type: Vehicle Type: Truck
Truck Hybrid Feature: Electric Assist Enabled

🔹 Another Test Case

Input:
Vehicle[] vehicles = {new Car(), new Truck()}
for each vehicle call showType()
Call showHybridFeature() on Truck


Output:
Vehicle Type: Car
Vehicle Type: Truck
Hybrid Feature: Electric Assist Enabled"
*/
public class VehicleUser {

	public static void main(String[] args) {
//		Car5 
//		car5=new Car5();
//		car5.showType();
//		Truck truck=new Truck();
//		truck.showType();
//		truck.showHybridFeature();
		Vehicle5[] vehicles5 = {new Car5(), new Truck()};
		for(Vehicle5 v:vehicles5) {
			v.showType();
		}
		Truck truck = (Truck)vehicles5[1];
		truck.showHybridFeature();

	}

}
class Vehicle5{
	public void showType(){
		System.out.println("Generic Vehicle");
		
	}
}
class Car5 extends Vehicle5{
	@Override
	public void showType(){
		System.out.println("Vehicle Type: Car");
		
	}
	
}
class Truck extends Vehicle5 implements ElectricVehicle{
	@Override
	public void showType(){
		System.out.println("Vehicle Type: Truck");
		
	}
	@Override
	public void showHybridFeature() {
		System.out.println("Hybrid Feature: Electric Assist Enabled");
		
	}
	
}
interface ElectricVehicle{
	  void showHybridFeature() ;
	
}
