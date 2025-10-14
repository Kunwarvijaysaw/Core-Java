package Sept01;

import java.util.Scanner;

class Employee_Salary_Calculator {
	String name;
    double salary;
   static double percent;
    
    public void raiseSalary(double percent){
           salary =salary+(salary*(percent/100));
    }
    public void setInput(String name,double salary) {
    	this.name=name;
    	this.salary=salary;
    	
    	
    }

    public void displayDetails(){
        System.out.println("Updated Employee Details:");
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Name : "+salary);
    }
   public static void  main(String[]args){
    Employee_Salary_Calculator es1 =new Employee_Salary_Calculator ();
    Employee_Salary_Calculator es2 =new Employee_Salary_Calculator ();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Employee Name : ");
    String name = sc.nextLine();
    System.out.println("Enter Salary : ");
    double salary = sc.nextDouble();
    System.out.println("Enter percentage : ");
    double percentage = sc.nextDouble();
    sc.nextLine();
    es1.setInput(name, salary);
    es1.raiseSalary(percentage);
    
    System.out.println("Enter Employee2 Name : ");
    String name2 = sc.nextLine();
    System.out.println("Enter Salary2 : ");
    double salary2 = sc.nextDouble();
    System.out.println("Enter percentage2 : ");
    double percentage2 = sc.nextDouble();

    es2.setInput(name2, salary2);
    es2.raiseSalary(percentage2);
    es1.displayDetails();
    es2.displayDetails();
   }

}
