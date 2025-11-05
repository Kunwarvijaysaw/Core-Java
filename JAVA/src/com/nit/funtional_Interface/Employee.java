package com.nit.funtional_Interface;

import java.util.function.Consumer;

public class Employee {
	String name;
	double salary;
	String designation;

	public Employee(String name, double salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("KVS", 50000, "Developer");
		Employee e2 = new Employee("RAJ", 40000, "HR");
		Employee e3 = new Employee("KUMAR", 80000, "TESTER");
		Employee emp[] = { e1, e2, e3 };
		Consumer<Employee> c=(obj)->{
										obj.salary+=5000;
										System.out.println(obj);
		};
		
		for (Employee e : emp) {
			c.accept(e);
		}

	}

}
