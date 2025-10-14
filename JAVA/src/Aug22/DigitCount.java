package Aug22;

import java.util.Scanner;

class DigitCount {
	public static void countDigits(int num) {
		
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		
		
		System.out.println("Number of digits : "+count);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		countDigits( num);
		
	}

}
