package com.nit.inheritence13Oct25;

public class GraduateStudent extends Student {
	String degreeType;
	long yearOfPassing;
	public GraduateStudent(String name, int age, String studentId, String course, String degreeType,
			long yearOfPassing) {
		super(name, age, studentId, course);
		this.degreeType = degreeType;
		this.yearOfPassing = yearOfPassing;
	}
	public void displayGraduateStudentDetails() {
		displayStudentDetails();
		System.out.println("Degree Type : "+degreeType);
		System.out.println("Year of Passing : "+yearOfPassing);
	}
	

}
