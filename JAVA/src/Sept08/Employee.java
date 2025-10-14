package Sept08;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeSalaryCalculator  e1=new EmployeeSalaryCalculator ();
		System.out.println("Enter Basic Salary : ");
		double basicSalary=sc.nextDouble();
		
		System.out.println("Enter HRA : ");
		double hra=sc.nextDouble();
		System.out.println("Enter DA : ");
		double da=sc.nextDouble();
		System.out.println("Enter Tax Percentage : ");
		double taxPercentage=sc.nextDouble();
		
		e1.setBasicSalary(basicSalary);
		e1.setHra(hra);
		e1.setDa(da);
		e1.setTaxPercentage(taxPercentage);
		
		System.out.println("Gross Salary : "+e1.calculateGrossSalary());
		System.out.println("Net salary :"+e1.calculateNetSalary());
//		double basicSalary=sc.nextDouble();
//		e1.basicSalary++;
//		e1.setBasicSalary(50000);
//		System.out.println(e1.basicSalary);
	}

}
