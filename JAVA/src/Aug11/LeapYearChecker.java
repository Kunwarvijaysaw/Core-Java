package Aug11;

import java.util.Scanner;
class LeapYearChecker{
    public static void main(String [] args)
    {
        //int years=2019;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any years");
         int years = sc.nextInt();
        if(years %400==0 || (years%4==0 && years%100!=0)){
            System.out.println(years+"is a Leap Year");
        }
        else{
            System.out.println(years+"is a not Leap Year");
        }


    } 
}
