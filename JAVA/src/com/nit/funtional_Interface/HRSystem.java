package com.nit.funtional_Interface;
import java.util.Scanner;
@FunctionalInterface
interface BonusCalculator{
    double calculateBonus(double salary);
}
public class HRSystem {
    public static void main(String[]args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();
        System.out.println("Enter Role ");
        String role=sc.next().toUpperCase();
        if(salary<10000){
            System.out.println("Salary cannot be less than 10000!");
            System.exit(0);
        }
       double bonus=0;
       BonusCalculator developer= price->price*0.15;
       BonusCalculator manager= price->price*0.25;
       BonusCalculator intern= price->price*0.05;

       switch(role){
        case "DEVELOPER": bonus=developer.calculateBonus(salary);break;
        case "MANAGER": bonus=manager.calculateBonus(salary);break;
        case "INTERN": bonus=intern.calculateBonus(salary);break;
        default :
            System.out.println("Invalid employee role!");
            System.exit(0);
       }
        System.out.println("Bonus = "+bonus);
    }
}