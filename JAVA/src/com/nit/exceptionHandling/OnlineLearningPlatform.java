package com.nit.exceptionHandling;

import java.util.Arrays;
import java.util.Iterator;

class CourseFullException extends Exception {

	public CourseFullException(String msg) {
		super(msg);
	}
}

class AlreadyEnrolledException extends Exception {

	public AlreadyEnrolledException(String msg) {
		super(msg);
	}

}

interface CourseOperation {
	public void enroll(Student s) throws CourseFullException,AlreadyEnrolledException;

	public void drop(Student s);
}

class Student {
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	

}

abstract class Course implements CourseOperation {
	private String courseName;
	private int maxStudents;
	private int enrolledStudents;

	public Course(String courseName, int maxStudents, int enrolledStudents) {
		super();
		this.courseName = courseName;
		this.maxStudents = maxStudents;
		this.enrolledStudents = enrolledStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(int enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

}


class ProgrammingCourse extends Course{

	int studentCount=0;
	
	Student studentList[];
	
	public ProgrammingCourse(String courseName, int maxStudents, int enrolledStudents) {
		super(courseName, maxStudents, enrolledStudents);
		studentList = new Student[maxStudents];
	}

	@Override
	public void enroll(Student s1) throws CourseFullException, AlreadyEnrolledException {
		if(studentCount>=studentList.length) throw new CourseFullException("Course full!");
		else {
		for (Student student : studentList) {
			if(student!=null) {
			if(student.name.equalsIgnoreCase(s1.name)) {
				throw new AlreadyEnrolledException("Already enrolled!");
			   }
			}
		     }
				System.out.println("Enrollment successfully.........!");
				studentList[studentCount++]=s1;
		}
	}

	@Override
	public void drop(Student s) {
		for (int i = 0; i < studentList.length; i++) {
			if(studentList[i]!=null) {
			if(studentList[i].name.equals(s.name)) {
				studentList[i]=null;
				System.out.println("Student droped SuccessFully...!");
				studentCount--;
			}
			}
		}
		
	}

	public int getStudentCount() {
		return studentCount;
	}

	public Student[] getStudentList() {
		return studentList;
	}
	
	
}

public class OnlineLearningPlatform {

	public static void main(String[] args) {
		ProgrammingCourse p= new ProgrammingCourse("java", 30,2);
		Student student = new Student("Biren");
		Student student2 = new Student("Vijay");
		try {
			p.enroll(student);
			p.enroll(student2);
			
		} catch (CourseFullException | AlreadyEnrolledException e) {
		System.out.println(e.getMessage());
		}
		
		
	
		p.drop(student);
		System.out.println(Arrays.toString(p.getStudentList()));
	}

}
