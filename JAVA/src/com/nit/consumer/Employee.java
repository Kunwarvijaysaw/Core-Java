/*Scenario:
During a company-wide event, the HR department wants to send a personalized
greeting message to every employee based on their name and department.

Requirement:
Write a Java program that:

Defines an Employee class with name and dept fields

Uses a Consumer<Employee> to generate and print greetings

Uses .accept() to apply the greeting logic on each employee

Class and Method Structure:
Class: Employee
Attributes:
String name
String dept

Constructor:
Employee(String name, String dept)
Sample Input:
Employee[] employees = {
    new Employee(""Jake"", ""IT""),
    new Employee(""Nina"", ""HR"")
};

Expected Output:
Hello Jake from IT department!
Hello Nina from HR department!*/

package com.nit.consumer;

import java.util.function.Consumer;

public class Employee {
	String name;
	String dept;

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public static void main(String[] args) {

		Employee[] employees = { new Employee("Jake", "IT"), new Employee("Nina", "HR") };
		Consumer<Employee> c = (e) -> {
			System.out.println("Hello " + e.name + " from " + e.dept + " department!");
		};
		for (Employee e : employees) {
			c.accept(e);
		}
	}

}
