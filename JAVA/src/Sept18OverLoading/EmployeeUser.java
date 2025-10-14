package Sept18OverLoading;

import java.util.Scanner;

class EmployeeUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String empName=sc.nextLine();
		System.out.println("Enter Employee Id : ");
		int empId=sc.nextInt();
		
		System.out.println("Enter Salary  : ");
		double empSalary=sc.nextDouble();
		Employee e1=new Employee(empName,empId,empSalary);
		System.out.println(e1.displayDetails());

	}

}
