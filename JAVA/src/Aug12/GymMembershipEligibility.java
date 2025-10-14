package Aug12;

import java.util.Scanner;

class GymMembershipEligibility {
	public static void main(String[]args){
        // int age=10;
        // double weight=60,height=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Height : ");
        double height = sc.nextInt();
        System.out.println("Enter Weight : ");
        double weight = sc.nextInt();

        if((age>=18 && age<=40) && (weight>=50 && weight<=90))
        {
            double bmi = weight/(height*height);
            System.out.println("BMI : "+bmi);
            System.out.println("Eligible");
        }
        else{
            System.out.println(" Not Eligible");
        }
    }

}
