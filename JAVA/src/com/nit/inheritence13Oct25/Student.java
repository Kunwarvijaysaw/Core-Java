package com.nit.inheritence13Oct25;

public class Student extends Person {
	String studentId;
	String course;
	public Student(String name, int age, String studentId, String course) {
		super(name, age);
		this.studentId = studentId;
		this.course = course;
	}
	public void displayStudentDetails() {
		displayDetails();
		System.out.println("Student Id : "+studentId);
		System.out.println("Course : "+course);
	}
}
