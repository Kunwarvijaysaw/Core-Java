package Oct11Inheritence;
/*WAP to demonstrate the use of single level Inheritance in the following Application
 * 
 * in a software company every employee has basic details such as name,employeeId,salary. A manager is also an Employee bust 
 * has additional responsibility such as managing a department and approving leaves of the team member
 * 
 * write a program to implement this scenario using single level inheritance where 
 * -the employee class store general employee detail;s and method
 * -the manager class inherits from the employee class and add extra functionality specific to manager
 * 
 * Employee:
 * -name, employeeId, Salary
 * -parameterized constructor to initialize the data members
 * -displayDetails()to display employee information
 * -work() to print "Employee working on assignment task"
 * 
 * Manager:
 * -department
 * -Parameterized constructor to initialize all field(use super call)
 * -approvalLevel (String employeeName)
 * -displaymanagerDetails()to display of the manager
 * 
 * 
 * */
public class Employee {
	String name;
	String employeeId;
	double salary;
	
	public Employee(String name, String  employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Salary : "+salary);
	}
	
	public void work() {
		System.out.println(name+" Employee working on assignment task.");
	}
	

}
