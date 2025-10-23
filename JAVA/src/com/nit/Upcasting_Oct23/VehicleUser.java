package com.nit.Upcasting_Oct23;
/*1.Lab Assignment – Demonstrating Upcasting in Java
Title:
Vehicle Control System using Upcasting

Objective:
To understand and demonstrate the concept of upcasting in Java, where a
subclass object is referred to using a parent class reference, enabling
polymorphic behavior.

Scenario:

You are developing a vehicle control simulation system.
Different types of vehicles like Car and Bike inherit from a common base
class Vehicle.

The control system uses a Vehicle reference to handle any kind of vehicle
— this demonstrates upcasting, allowing one reference type to represent
multiple object types.

Task:
Create a base class Vehicle with a method:
void start()

which displays:
Vehicle is starting.

Create two subclasses:
Car → Overrides start() to display:
Car is starting with a key ignition.

Bike → Overrides start() to display:
Bike is starting with a self-start button.


In the main method:
Declare a Vehicle reference.
Assign it to a Car object and call start().
Assign it to a Bike object and call start().
Observe how the overridden methods are called even when accessed
through a parent class reference — this is upcasting in action.

Hint:
Vehicle v;
        v = new Car();   // Upcasting
        v.start();

        v = new Bike();  // Upcasting
        v.start();

Expected Output:
Car is starting with a key ignition.
Bike is starting with a self-start button.

Examples
Example 1
Input:
Vehicle v = new Car();
v.start();

Vehicle v = new Bike();
v.start();
Output:
Car is starting with a key ignition.
Bike is starting with a self-start button.

*/
public class VehicleUser {

	public static void main(String[] args) {
		Vehicle v;
        v = new Car();   // Upcasting
        v.start();

        v = new Bike();  // Upcasting
        v.start();


	}

}

class Vehicle{
	public void start() {
		System.out.println("Vehicle is starting.");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car is starting with a key ignition.");
	}
}

class Bike extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike is starting with a self-start button.");
	}
}