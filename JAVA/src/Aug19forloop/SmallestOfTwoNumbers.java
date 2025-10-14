package Aug19forloop;

import java.util.Scanner;

class SmallestOfTwoNumbers {
	public static void main(String[]args){
       // int num1=75,num2=88;
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
        if(num1<num2) {
        System.out.println("Smallest Number is num1 is : "+num1);
        }
        else if(num1==num2) {
            System.out.println("both num1 and num2 is equal : "+num2);
            }
        else {
        	 System.out.println("Smallest Number is num2 is : "+num2);
        }
           
        
    }

}
