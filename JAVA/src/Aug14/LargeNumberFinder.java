package Aug14;

import java.util.Scanner;

class LargeNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Number");
		double num2 = sc.nextDouble();
		System.out.println("Enter Third Number");
		double num3 = sc.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Largest is num1 : "+num1);	
		}
		
		else if(num2>num1 && num2>num3) {
			System.out.println("Largest is num2 : "+num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("Largest is num3 : "+num3);
		}
		else if(num1==num2 && num1==num3) {
			System.out.println("All are Equal : "+num1);
		}
		else if(num1==num2 ) {
			System.out.println("num1 and num2 both are equal : "+num1);
		}
		else if( num1==num3) {
			System.out.println("num1 and num3 both are equal : "+num1);
		}
		else if( num2==num3) {
			System.out.println("num2 and num3 both are equal : "+num2);
		}

	}

}
