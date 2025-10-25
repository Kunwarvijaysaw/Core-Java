package com.nit.getter_setter.sept12;

import java.util.Scanner;

class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseEnrollment c1=new CourseEnrollment();
		System.out.println("Enter Course Name : ");
		String courseName=sc.next();
		
		System.out.println("Enter Student Name : ");
		String studentName=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Fees : ");
		double fees=sc.nextDouble();
		c1.setCourseName(courseName);
		c1.setStudentName(studentName);
		c1.setFees(fees);
		
		
		System.out.println(c1.getDisplay());;
		
		

	}

}
