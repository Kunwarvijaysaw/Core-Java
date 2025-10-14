package Aug19forloop;

import java.util.Scanner;

class LargestOfTwoNumbers {
	public static void main(String[]args){
       // int num1=85,num2=85;
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
        if(num1>num2) {
        	 System.out.println("Largest Number is num1 : "+num1);	
        }else if(num1==num2) {
       	 System.out.println("Both are same : "+num1);	
       }
        
        else {
        	 System.out.println("Largest Number is num2 : "+num2);	
        }
       
       
        
           
        
    }

}
