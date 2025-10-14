package Aug22;

import java.util.Scanner;

public class DigitSum {
public static void countDigits(int num) {
		
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		
		
		System.out.println("Sum of  digits : "+sum);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		countDigits( num);
		
	}

}
