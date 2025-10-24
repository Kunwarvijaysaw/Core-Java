package com.nit.polymorphism_oct24;
/*Design a program to demonstrate polymorphism with method overriding.

Create a base class Employee with a method:
getDetails() – prints generic details

Create subclasses Manager, Developer, and Tester that extend Employee and override getDetails() as follows:
Manager → prints ""Role: Manager, Salary: 80000""
Developer → prints ""Role: Developer, Salary: 60000""
Tester → prints ""Role: Tester, Salary: 50000""

Demonstrate the behavior by creating objects of each subclass and calling getDetails().

🔹 Input
Create Manager, Developer, Tester objects
Call getDetails() on each

🔹 Expected Output
Role: Manager, Salary: 80000
Role: Developer, Salary: 60000
Role: Tester, Salary: 50000

🔹 Another Test Case

Input:

Employee[] employees = {new Manager(), new Developer(), new Tester()}
for each employee call getDetails()


Output:

Role: Manager, Salary: 80000
Role: Developer, Salary: 60000
Role: Tester, Salary: 50000

Examples
Example 1
Input:
Employee[] employees = {new Manager(), new Developer(), new Tester()}
for each employee call getDetails()
Output:
Role: Manager, Salary: 80000
Role: Developer, Salary: 60000
Role: Tester, Salary: 50000
*/
public class AnimalUser {

	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat(), new Bird() };
		for (Animal a : animal) {
			a.makeSound();
		}

	}

}

class Animal {
	public void makeSound() {
		System.out.println(" animal sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog Sound: Bark");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat Sound: Meow");
	}
}

class Bird extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bird Sound: Chirp");
	}
}