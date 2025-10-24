package com.nit.polymorphism_oct24;
/*🚗 Problem: Vehicle Fuel Efficiency
📌 Problem Description
Design a program to demonstrate polymorphism with method overriding.

Create a base class Vehicle with a method:
fuelEfficiency() – returns generic fuel efficiency
Create subclasses Car, Bike, and Truck that extend Vehicle and override fuelEfficiency() as follows:
Car → returns ""Car Fuel Efficiency: 15 km/l""
Bike → returns ""Bike Fuel Efficiency: 40 km/l""
Truck → returns ""Truck Fuel Efficiency: 8 km/l""
Demonstrate the behavior by creating objects of each subclass and calling
fuelEfficiency().

🔹 Input
Create Car, Bike, Truck objects
Call fuelEfficiency() on each

🔹 Expected Output
Car Fuel Efficiency: 15 km/l
Bike Fuel Efficiency: 40 km/l
Truck Fuel Efficiency: 8 km/l

🔹 Another Test Case
Input:
Vehicle[] vehicles = {new Car(), new Bike(), new Truck()}
for each vehicle call fuelEfficiency()

Output:
Car Fuel Efficiency: 15 km/l
Bike Fuel Efficiency: 40 km/l
Truck Fuel Efficiency: 8 km/l

Examples
Example 1
Input:
Vehicle[] vehicles = {new Car(), new Bike(), new Truck()}
for each vehicle call fuelEfficiency()
Output:
Car Fuel Efficiency: 15 km/l
Bike Fuel Efficiency: 40 km/l
Truck Fuel Efficiency: 8 km/l*/
public class VehicleUser {

	public static void main(String[] args) {
		Vehicle[] vehicle= {new Car(),new Bike(),new Truck()};
		for(Vehicle v:vehicle) {
			v.fuelEfficiency();
		}

	}

}
class Vehicle{
	public void fuelEfficiency() {
		System.out.println("generic fuel efficiency");
	}
	
}
class Car extends Vehicle{
	@Override
	public void fuelEfficiency() {
		System.out.println("Car Fuel Efficiency: 15 km/l");
	}
	
}
class Bike extends Vehicle{
	@Override
	public void fuelEfficiency() {
		System.out.println("Bike Fuel Efficiency: 40 km/l");
	}
	
}
class Truck extends Vehicle{
	@Override
	public void fuelEfficiency() {
		System.out.println("Truck Fuel Efficiency: 8 km/l");
	}
	
}