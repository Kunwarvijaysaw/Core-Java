/*"Scenario:
In an online education platform, you want to identify students who qualify to become mentors.
A student is eligible if they:

Have completed more than 5 courses, and
Have a rating above 4.5

As a developer, your task is to write a Java program that prints the names of students who are eligible to become mentors by satisfying both conditions.
You are given a Student class that stores:
 - the name of the student (e.g., ""David"")
 - an integer field coursesCompleted
-  a double field rating

Your Task:
Create a Student class with the required attributes and constructor.

In the main method:
Create an array of Student objects using sample data.
Use Predicate<Student> to define each condition:
One for courses completed
One for rating
Combine the conditions using .and() to filter only those who meet both.
Print their names.

Class and Method Structure:
Class: Student

Attributes:
String name  
int coursesCompleted  
double rating  

Constructor:
Accepts name, coursesCompleted, and rating as parameters and initializes
the object.

Main Class: EligibleMentors
In the main(String[] args) method:
Student[] students = {
    new Student(""David"", 6, 4.6),
    new Student(""Eve"", 4, 4.9),
    new Student(""Frank"", 7, 4.4)
};

Expected Output:
Eligible Mentors:
David
Hint:
Use two separate Predicate<Student>s for:
coursesCompleted > 5
rating > 4.5

Combine them using .and() like:
Predicate<Student> isEligible = condition1.and(condition2);"*/

package com.nit.predicate;
import java.util.Scanner;
import java.util.function.Predicate;

class Student {
	String name;
	int coursesCompleted;
	double rating;

	public Student(String name, int coursesCompleted, double rating) {
		super();
		this.name = name;
		this.coursesCompleted = coursesCompleted;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", coursesCompleted=" + coursesCompleted + ", rating=" + rating + "]";
	}

}

public class EligibleMentors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Customer ");
		int n = Integer.parseInt(sc.nextLine());

		Student stu[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student details : " + (i + 1));
			System.out.println("Enter Student Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Course Completed ");
			int coursesCompleted = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Rating");
			double rating = Double.parseDouble(sc.nextLine());
			stu[i] = new Student(name, coursesCompleted, rating);
		}

		Predicate<Student> res = (s) -> s.coursesCompleted >= 5 && s.rating >= 4.5;

		for (Student S : stu) {
			if (res.test(S)) {
				System.out.println("Eligible : " + S);
			} else {
				System.err.println("NOT Eligible : " + S);
			}
		}

	}

}
