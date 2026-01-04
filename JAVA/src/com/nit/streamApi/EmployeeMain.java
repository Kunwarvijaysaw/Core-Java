package com.nit.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.GroupLayout.Group;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Vijay", "IT", 55000, "Male", 25));
        employees.add(new Employee("Amit", "HR", 40000, "Male", 28));
        employees.add(new Employee("Neha", "Finance", 48000, "Female", 28));
        employees.add(new Employee("Rohit", "IT", 60000, "Male", 30));
        employees.add(new Employee("Priya", "Marketing", 45000, "Female", 24));
        employees.add(new Employee("Suman", "HR", 42000, "Female", 30));
        employees.add(new Employee("Rahul", "IT", 70000, "Male", 32));
        employees.add(new Employee("Kiran", "Finance", 52000, "Male", 25));
        employees.add(new Employee("Anjali", "Marketing", 47000, "Female", 24));
        employees.add(new Employee("Deepak", "Admin", 39000, "Male", 35));

 // Print all employees
        //employees.forEach(System.out::println);
        
//group by department
      // Map<String, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(e->e.dept));
//       Map<String, List<Employee>> byDept = employees.
//       		stream(). collect(Collectors.groupingBy(Employee::getDept));
//       byDept.forEach((k,v)->{
//        	System.out.println(k+": ");
//        	v.forEach(System.out::println);
//        
//        
//       });
//        
        	
//        	//Group by emp gender
//        	 Map<String, List<Employee>> byGender = employees.
//             		stream().
//             		collect(Collectors.groupingBy(Employee::getGender));
//             byGender.forEach((k,v)->{
//             	System.out.println(k+": ");
//             	v.forEach(System.out::println);
             	
             	
//             	//Group by emp age
//        //output type: Map<Integer,List<Employee>>
//           	 Map<Integer, List<Employee>> byAge = employees.
//                		stream().
//                		collect(Collectors.groupingBy(Employee::getAge));
//                byAge.forEach((k,v)->{
//                	System.out.println(k+": ");
//                	v.forEach(System.out::println);	
             	
             	
        	
      //Group by emp name
        //output type: Map<Integer,List<Employee>>
//           	 Map<String, List<Employee>> byName = employees.
//                		stream().
//                		collect(Collectors.groupingBy(Employee::getName));
//                byName.forEach((k,v)->{
//                	System.out.println(k+": ");
//                	v.forEach(e ->System.out.println(e.getName()));	
//        		
//   });
     
//                
//               List<String> list=List.of("Apple","Grapes","Mango","Lemon","Banana");
//               Map<String, Integer> toMap = list.stream().
//            		   collect(Collectors.toMap(s->s,String::length));
//               //collect(Collectors.toMap(Function.identity(),String::length));
//               toMap.forEach((k,v)->System.out.println(k+" -> "+v));
//               

            
               
             /*  group employee by department and fins count of employee in each dept 
               output: type Map<String,Long>
                */
//             Map<String, Long> collect=employees.stream().
//            		   collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//               
//            	collector.forEach((k,v)->System.out.println(k+" : "+v.SIZE));
////               });
        
        
        
        /*Avg sal of group by*/
//        Map<Double, List<Employee>> collect=employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        Collectors.averagingDouble(Employee::getSalary);
//        collect.forEach((k,v)->System.out.println(k+" "+v);
 System.out.println("===============================================================");             
      //Find the second highest salary
 /*     Employee maxEmp=empList.stream( )
    		  .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
    		  .findfirst();
      			.get();
      System.out.println(maxEmp);
  */
 System.out.println("==============================================================="); 
 
              
	}

}


class Employee{
	private String name;
	private String dept;
	private double salary;
	private String gender;
	private int age;
	public Employee(String name, String dept, double salary, String gender, int age) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
}