package com.nit.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*//wap to  create employee object .each employee will have name,designation,salary,yoe
//filter and display employee whose salary is more then 50000*/
public class StreaamTest2 {

	public static void main(String[] args) {
		List<Employee>emp = Arrays.asList(
				new  Employee("Raj","Jr.developer",30000,1),
				new  Employee("KVS","Sr.developer",500000,5),
				new  Employee("SK","ASC.developer",80000,1),
				new  Employee("AK","PA",3000,1)
				
				);
		List<Employee>seniorEmp=emp.
							stream().
							filter(e->e.getSalary()>50000).
							collect(Collectors.toList());
		System.out.println("Employee with salary more than 50k");
		seniorEmp.forEach(System.out::println);
		
	}

}
class Employee{
	String name;
	String designation;
	double salary;
	int yoe;
	public Employee(String name, String designation, double salary, int yoe) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.yoe = yoe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	@Override
	public String toString() {
		return "name=" + name + ", \ndesignation=" + designation + ", \nsalary=" + salary + ", \nyoe=" + yoe +"\n";
	}
	
}