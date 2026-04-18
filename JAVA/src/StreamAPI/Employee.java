package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeeUser {
	String name;
	String dept;
	Double salary;
	public EmployeeUser(String name, String dept, Double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
		
	}
	@Override
	public String toString() {
		return "EmployeeUser [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}

public class Employee{
	public static void main(String[] args) {
		List<EmployeeUser> employees = Arrays.asList(
			    new EmployeeUser("Amit", "IT", 50000.0),
			    new EmployeeUser("Neha", "HR", 40000.0),
			    new EmployeeUser("Raj", "Finance", 60000.0),
			    new EmployeeUser("Priya", "IT", 55000.0),
			    new EmployeeUser("Karan", "Sales", 45000.0)
			);
		//based on salary grater than 50000
		System.out.println("====based on salary grater than 50000====");
		employees.stream().distinct()
							.filter(emp->emp.salary>50000)
							.forEach(System.out::println);
		
		//
		System.out.println("\n====based on salary Ascending Order====");
		employees.stream().sorted((e1,e2)->Double.compare(e1.salary,e2.salary))
							.forEach(System.out::println);
		
		
		System.out.println("\n====based on salary Descending Order====");
		employees.stream().sorted((e1,e2)->Double.compare(e2.salary,e1.salary)).forEach(System.out::println);
		
		System.out.println("\n====based on Name====");
		employees.stream().sorted(Comparator.comparing(emp->emp.name)).forEach(System.out::println);
		
		System.out.println("\n====based on Department====");
		employees.stream().sorted(Comparator.comparing(emp->emp.dept)).forEach(System.out::println);
	}
	
}