package Aug13;

import java.util.Scanner;

class SwapWithoutTemp {

	public static void main(String[] args) {
	//double num1=10 , num2=20;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Num : ");
	double num1 = sc.nextDouble();
	System.out.println("Enter Second Num : ");
	double num2 = sc.nextDouble();
	
	System.out.println("Before Swap num1 = "+num1+" Before Swap num2 = "+num2);
	double sum = num1+num2;
	num1 = sum - num1;
	num2 = sum - num2;
	System.out.println("After Swap num1 = "+num1+" After Swap num2 = "+num2);
	

	}

}
