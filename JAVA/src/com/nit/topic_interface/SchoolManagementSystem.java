package com.nit.topic_interface;
/*School System using Abstract Classes
------------------------------------------
Objective:-
Create a school system using abstract classes to model different
roles (Teacher, Student, Principal)
Task:-
Create an abstract class Person with the following members:-

Protected Instance Variables:
String Name;
int Age;

Constructor:-
Person(string name, int age)

Initializes the name and age.

Abstract Methods:-
void GetRole();      
void PerformDuties();  


Concrete Method:-
void DisplayDetails();


Create Derived Classes:-

Teacher:-
GetRole() → Prints "Role: Teacher"
PerformDuties() → Prints "Teaching students and preparing lessons"

Student:-
GetRole() → Prints "Role: Student"
PerformDuties() → Prints "Attending classes and completing assignments"

Principal:-
GetRole() → Prints "Role: Principal"
PerformDuties() → Prints "Managing school operations and supervising staff"

In the Main() method:-
- Create an array of Person references.
- Store objects of Teacher, Student, and Principal in the array.
- Loop through the array and for each object call:-

DisplayDetails();
GetRole();
PerformDuties();

Expected Output:-
Name: Varun, Age: 30
Role: Teacher
Teaching students and preparing lessons

Name: Bhaskar, Age: 21
Role: Student
Attending classes and completing assignments

Name: Mr. Naresh, Age: 50
Role: Principal
Managing school operations and supervising staff*/
//main method 
public class SchoolManagementSystem {

	public static void main(String[] args) {
//		Teacher teacher = new Teacher("Varun", 20, "Teacher");
//		teacher.displayDetails();
//		teacher.performDuties();
//		System.out.println("\n");
//		Student student = new Student("Bhaskar", 15, "Student");
//		student.displayDetails();
//		student.performDuties();
//		System.out.println("\n");
//		Principal principal = new Principal("Mr. KVS", 40, "Principal");
//		principal.displayDetails();
//		principal.performDuties();

		Person person[] = { new Teacher("Varun", 20, "Teacher"), new Student("Bhaskar", 15, "Student"),
				new Principal("Mr. KVS", 40, "Principal") };
		for (int i = 0; i < person.length; i++) {
			person[i].displayDetails();
			person[i].performDuties();
			System.out.println("\n");

		}

	}

}

// super abstract person class
abstract class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		// TODO Auto-generated method stub

	}

	abstract void getRole();

	abstract void performDuties();

	public void DisplayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);

	}
}

//sub class
class Teacher extends Person {
	String role;

	public Teacher(String name, int age, String role) {
		super(name, age);
		this.role = role;

	}

	@Override
	void getRole() {
		System.out.println("Role" + role);

	}

	@Override
	void performDuties() {
		System.out.println("Teaching students and preparing lessons");

	}

	@Override
	public void displayDetails() {
		super.DisplayDetails();
		System.out.println("Role : " + role);

	}

}

//sub class
class Student extends Teacher {

	public Student(String name, int age, String role) {
		super(name, age, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	void performDuties() {
		System.out.println("Attending classes and completing assignments");

	}

	@Override
	public void displayDetails() {
		super.DisplayDetails();
		System.out.println("Role : " + role);
	}

}

//sub class
class Principal extends Student {

	public Principal(String name, int age, String role) {
		super(name, age, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	void performDuties() {
		System.out.println("Managing school operations and supervising staff");

	}

	@Override
	public void displayDetails() {
		super.DisplayDetails();
		System.out.println("Role : " + role);
	}
}