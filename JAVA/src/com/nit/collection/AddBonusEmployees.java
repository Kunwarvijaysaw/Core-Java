/**/

package com.nit.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AddBonusEmployees {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of useer ");
		int n = sc.nextInt();
		LinkedList<Employees> l = new LinkedList<Employees>();
		while (n > 0) {
			System.out.println("Enter User EMP No : ");
			int empNo = sc.nextInt();
			System.out.println("Enter User Name : ");
			String name = sc.next();
			System.out.println("Enter User Salary : ");
			double salary = sc.nextDouble();
			l.add(new Employees(empNo, name, salary));
			n--;
		}
		System.out.println("Updated Employee Details:");
		Iterator<Employees> itr = l.iterator();
		while (itr.hasNext()) {
			Employees e = itr.next();
			e.salary += 5000;

			System.out.println(e);
		}
	}

}

class Employees {
	int empNo;
	String name;
	double salary;

	Employees(int empNo, String name, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return empNo + " " + name + " " + salary;
	}
}
