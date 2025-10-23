package com.nit.Upcasting_Oct23;

/*2.Lab Assignment 2- Readable Report Generation
Title:
Student Report Card Formatting

Scenario:
A Student class stores information about students such as roll number, name,
and grade.
You are required to generate a formatted report for each student in a tabular
or line-based format, suitable for console display or PDF printing.

By default, printing a Student object would show an unreadable memory
reference (e.g., Student@7344699f).
To make it human-readable, you must override the toString() method to
produce a clean report line.

Task:
Create a class named Student with the following fields:
int rollNo
String name
String grade

Define a constructor to initialize the above fields.
Override the toString() method to return a formatted string as follows:
Roll No: 101 | Name: David | Grade: A


In the main method, create an instance of Student and print it.

Test Case:
Student s = new Student(101, "David", "A");
System.out.println(s);

Expected Output:
Roll No: 101 | Name: David | Grade: A

Examples
Example 1
Input:
rollNo = 101
name = David
grade = A
Output:
Roll No: 101 | Name: David | Grade: A
*/
public class User{
	public static void main(String[] args) {
		Student s=new Student(101, "KVS", "O");
		System.out.println(s);
	}
}

class Student{
	int rollNo;
	String name;
	String grade;
	
	public Student(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNo = " + rollNo + ", name = " + name + ", grade = " + grade + "]";
	}
	

}
