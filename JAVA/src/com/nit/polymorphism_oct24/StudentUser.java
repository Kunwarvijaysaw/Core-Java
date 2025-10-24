package com.nit.polymorphism_oct24;
/*"🎓 Problem: Student Subjects
📌 Problem Description

Design a program to demonstrate polymorphism with method overriding for displaying subjects.
Create a base class Student with a field:
name (String)

Method: displaySubjects() – prints ""No subjects assigned""
Create subclasses ScienceStudent and ArtsStudent that extend Student and override
displaySubjects() as follows:
ScienceStudent → prints ""Physics, Chemistry, Biology""
ArtsStudent → prints ""History, Literature, Geography""

Demonstrate the behavior by creating objects of each subclass and calling
displaySubjects().
🔹 Input
Create ScienceStudent and ArtsStudent objects
Call displaySubjects() on each

🔹 Expected Output
Science Student Subjects: Physics, Chemistry, Biology
Arts Student Subjects: History, Literature, Geography

🔹 Another Test Case
Input:
Student s1 = new ScienceStudent()
Student s2 = new ArtsStudent()
s1.displaySubjects()
s2.displaySubjects()


Output:
Physics, Chemistry, Biology
History, Literature, Geography"

Examples
Example 1
Input:
Student s1 = new ScienceStudent()
Student s2 = new ArtsStudent()
s1.displaySubjects()
s2.displaySubjects()
Output:
Physics, Chemistry, Biology
History, Literature, Geography

*/
public class StudentUser {

	public static void main(String[] args) {
		Student[] st= {new ScienceStudent(),new ArtsStudent()};
		for(Student s:st) {
			s.displaySubjects();
		}

	}

}

class Student {
	String name;

	public void displaySubjects() {
		System.out.println("No subjects assigned");
	}
}

class ScienceStudent extends Student {

	@Override
	public void displaySubjects() {
		System.out.println("Physics, Chemistry, Biology");
	}

}

class ArtsStudent extends Student {

	@Override
	public void displaySubjects() {
		System.out.println("History, Literature, Geography");
	}
}