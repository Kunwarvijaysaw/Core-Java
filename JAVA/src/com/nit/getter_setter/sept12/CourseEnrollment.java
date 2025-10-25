package com.nit.getter_setter.sept12;

public class CourseEnrollment {
	
	private String courseName;
	private String studentName;
	private double fees;
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getFees() {
		return fees;
	}
	
	public String getDisplay() {
		return "Course Name : "+courseName+
				"\n Student Name : "+studentName+
				"\n Fees : "+fees;
		
	}

}
