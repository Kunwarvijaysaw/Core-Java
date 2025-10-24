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
*/
public class EmployeeUser {

	public static void main(String[] args) {
		Employee[] employees = {new Manager("manager",800000.0), new Developer("Developer",60000.0), new Tester("Tester",80000.0)};
		for(Employee e:employees) {
			e.getDetails();
		}
		


	}

}
class Employee{
	String role;
	double salary;
	public Employee(String role, double salary) {
		super();
		this.role = role;
		this.salary = salary;
	}
	public void getDetails() {
		System.out.println("Role : "+role+", Salary : "+salary);
	}
}
class Manager extends Employee{

	public Manager(String role, double salary) {
		super(role, salary);
	}
	@Override
	public void getDetails() {
		System.out.println("Role : "+role+", Salary : "+salary);	
	}
}

class Developer extends Employee{

	public Developer(String role, double salary) {
		super(role, salary);
	}
	
	@Override
	public void getDetails() {
		System.out.println("Role : "+role+", Salary : "+salary);
	}
	
}

class Tester extends Employee{

	public Tester(String role, double salary) {
		super(role, salary);
	}
	@Override
	public void getDetails() {
		System.out.println("Role : "+role+", Salary : "+salary);
	}
	
}