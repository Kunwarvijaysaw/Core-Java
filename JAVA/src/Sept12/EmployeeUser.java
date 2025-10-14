package Sept12;

import java.util.Scanner;

class EmployeeUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter First Name : ");
		String firstName =sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lasttName =sc.nextLine();
		System.out.println("Enter Emp ID : ");
		int employeeId =sc.nextInt();
		System.out.println("Enter Salary : ");
		double salary =sc.nextDouble();
		System.out.println("Enter No of Project : ");
		int noOfProject =sc.nextInt();
		
		e.setFirstName(firstName);
		e.setLastName(lasttName);
		e.setEmployeeId(employeeId);
		e.setSalary(salary);
		e.setNoOfProject(noOfProject);
		e.CalculateSalary();
		e.displayDetails();
		
		

	}

}
