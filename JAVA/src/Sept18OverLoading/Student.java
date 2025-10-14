package Sept18OverLoading;

import java.util.Scanner;

/*Q1) .Student Class Design
Design a Java class named Student.
Attributes :
-----------------
name : String
rollNo : int
course : String
Access Modifier: private (for all variables)
Constructor: Initialize all properties.
Methods:
-----------
[Return type: void, Access Modifier: public]
- displayDetails(): This method should print all the student details.
[Return type: non-void, Access Modifier: public]
- getName(), getRollNo(), getCourse(): These methods should return corresponding property values.
Input Validation:
- name should not be empty.
- rollNo should be greater than 0.
- course should not be empty.
Test Cases:
Case - 1 (Valid Input)
----------------------
Name : Swati
RollNo : 101
Course : Computer Science
Expected Output:
Valid input. Display all details.
Case - 2 (Invalid Name)
-----------------------
Name : """"
RollNo : 101
Course : Computer Science
Expected Output:
Error message indicating invalid name.
Case - 3 (Invalid RollNo)
-------------------------
Name : Swati
RollNo : -5
Course : Computer Science
Expected Output:
Error message indicating invalid roll number.
Case - 4 (Invalid Course)
-------------------------
Name : Swati
RollNo : 101
Course : """"
Expected Output:
Error message indicating invalid course."*/
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Roll No : ");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course  : ");
		String course=sc.nextLine();
		JavaCourse j1=new JavaCourse(name,rollNo,course);
		System.out.println(j1.displayDetails());
		

	}

}
class JavaCourse{
	String name;
	int rollNo;
	String course;
	

	public void setName(String name) {
		this.name = name;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getCourse() {
		return course;
	}
	
	
	JavaCourse(String name,int rollNo,String course){
		if(name.isEmpty()) {
			System.err.println("invalid Name Input");
			System.exit(0);
		}
		else if(rollNo<=0) 
		{
			System.err.println("invalid RollNo. Input");
			System.exit(0);
		}
		else if(course.isEmpty()) {
			System.err.println("invalid course Input");
			System.exit(0);
		}
		else {
			this.name=name;
			this.rollNo=rollNo;
			this.course=course;
		}
		
		
		
		
		
	}
	
	public String displayDetails() {
		return "Valid input. Display all details."+
				"\nName : "+name+
				"\n Roll No. : "+rollNo+
				"\n Course : "+course;
	}
	
}
