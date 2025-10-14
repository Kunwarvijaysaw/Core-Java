package Sept15Constructor;

/*EmployeeSalarySlip
Create a class Employee that stores name, id, and monthlySalary.
Use a constructor to initialize these values.
Add a method calculateAnnualSalary() and a method displaySalarySlip() to show name, ID, and annual salary.

Class Name:
Employee

Instance Variables:
- name (String)
- id (int)
- monthlySalary (double)

Constructor:
- Employee(String name, int id, double monthlySalary)

Methods:
- calculateAnnualSalary() → returns monthlySalary × 12
- displaySalarySlip() → prints employee details

Main Class:
- EmployeeMain

Input Format:
Name (String)
ID (int)
Monthly Salary (double)

Output Format:
Employee: <name>, ID: <id>, Annual Salary: <annualSalary>

Note:
Use Scanner with next() for String input.
Sample Input
Michael
101
4000
Sample Output
Employee: Michael, ID: 101, Annual Salary: 48000.0*/
import java.util.Scanner;

class EmployeeUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		System.out.println("Enter Salary : ");
		double monthlySalary = sc.nextDouble();

		Employee e1 = new Employee(name, id, monthlySalary);
		e1.calculateAnnualSalary();
		System.out.println(e1.displaySalarySlip());
	}
}

class Employee {
	String name;
	int id;
	double monthlySalary;

	Employee(String name, int id, double monthlySalary) {
		this.name = name;
		this.id = id;
		this.monthlySalary = monthlySalary;

	}

	public double calculateAnnualSalary() {
		return monthlySalary * 12;
	}

	public String displaySalarySlip() {
		return "Employee: " + name + ", ID: " + id + ", Annual Salary: " + calculateAnnualSalary();
	}
}
