package Sept04;

import java.util.Scanner;

class Calculator {
	public static void operation(int num1,int num2,char symbol) {
		if(symbol=='+') {
			System.out.println("Sum of"+num1+" and "+num2+"is : "+(num1+num2));
		}
		if(symbol=='-') {
			System.out.println("Difference of"+num1+" and "+num2+"is : "+(num1-num2));
		}
		if(symbol=='*') {
			System.out.println("Product of"+num1+" and "+num2+"is : "+(num1*num2));
		}
		if(symbol=='/') {
			System.out.println("Devide of"+num1+" and "+num2+"is : "+(num1/num2));
		}
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 =sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 =sc.nextInt();
		System.out.println("Enter Symbol :\n+ for Sum\n- for Difference\n* for Product\n/ for Devide ");
		char symbol =sc.next().charAt(0);
		operation(num1,num2,symbol);

	}

}
