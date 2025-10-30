package com.nit.abstract_Oct25;
/*3: Cannot Be abstract With Constructor or static
------------------------------------------------------
Scenario:
A developer tries to declare a constructor as abstract in class Employee.

Question:
Create a class Employee and try declaring its constructor as abstract, then try to
declare a static method as abstract. Show and fix the compiler errors.*/
public class EmployeeUser {

	public static void main(String[] args) {
		Manager1 m=new Manager1("K101", "KVS");
		m.display();

		
		
	}

}
abstract class Employee1{
	String empId;
	String name;
	public Employee1(String empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	
	 public  abstract  void display();
}


class Manager1 extends Employee1{

	Manager1(String empId, String name) {
		super(empId, name);
		
	}

	@Override
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Name : "+empId);
		
	}
	
	
}