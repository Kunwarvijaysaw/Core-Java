package Sept13Test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Test t1=new Test();
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		System.out.println("Enter Symbol : ");
		char ch=sc.next().charAt(0);
		System.out.println(t1.showMessage());
		if(ch=='+') {
			System.out.println("Addition ("+a+" "+"+"+" "+b+"): "+t1.addNumbers(a, b));
		}else if(ch=='-') {
			System.out.println("Subtraction ("+a+" "+"-"+" "+b+"): "+t1.subtractNumbers(a, b));
		}else if(ch=='*') {
			System.out.println("Product ("+a+" "+"*"+" "+b+"): "+t1.multiplyNumbers(a, b));
		}else {
			System.out.println("Devide ("+a+" "+"/"+" "+b+"): "+t1.divideNumbers(a, b));
		}
		
		

	}

}

