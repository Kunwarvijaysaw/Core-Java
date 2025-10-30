package com.nit.topic_interface;
/*
   WAP for the following  requirements
   create an abstract method in an interface
   complete the method in immediate sub class 
   draw class diagram
  
 * */
class EmployeeUser {

	public static void main(String[] args) {
		Manager manager=new  Manager();
		manager.work();
	}

}
interface  Employee{
	public abstract void work();
}

class Manager implements Employee{
	@Override
	public void work() {
	System.out.println("Manager Manage the Employees!");	
	}
	
}