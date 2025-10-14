package Aug12;

import java.util.Scanner;

class SalaryIncrementCalculator {

public static void main(String[]args){
        // double salary,rating,increment,newSalary;
        // int yearsWorked;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Salary : ");
        double salary = sc.nextDouble();
        System.out.println("Enter Rating : ");
        double rating = sc.nextDouble();
        System.out.println("Enter Years Worked : ");
        int yearsWorked = sc.nextInt();
        if(rating>=4.5 && yearsWorked>=1)
        {
             double increment = salary*0.2;
            System.out.println("Old Salary : "+salary);
            System.out.println("Increment (20%) : "+increment);
            System.out.println("New Salary : "+(salary+increment));
        }
        else if(rating>=3.5 && yearsWorked>=1)
        {
       
            double increment = salary*0.1;
            System.out.println("Old Salary : "+salary);
            System.out.println("Increment (10%) : "+increment);
            System.out.println("New Salary : "+(salary+increment));
        }
        else
        {
          System.out.println("No Increment");  
        }


    }

}
