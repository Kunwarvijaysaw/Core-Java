package Aug13;

import java.util.Scanner;

class SwapWithTemp {

	public static void main(String[] args) {
			//double num1=40 , num2=20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Num : ");
		double num2 = sc.nextDouble();
			System.out.println("Before Swap num1 = "+num1+" Before Swap num2 = "+num2);
			double temp = num1;
			num1 = num2;
			num1 = temp;
			
			System.out.println("After Swap num1 = "+num1+" After Swap num2 = "+num2);
			

	}

}
