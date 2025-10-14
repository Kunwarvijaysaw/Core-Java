package Aug20forloop;

import java.util.Scanner;

class RobotTask {
	public static void factorial(int number) {
		int fact=1;
		
		for(int i=1;i<=number;i++) {

			fact=fact*i;
		}

		System.out.println("Factorial of Number : "+fact);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
		factorial( number);
		
		

	}

}
