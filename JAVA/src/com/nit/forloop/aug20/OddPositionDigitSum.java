package com.nit.forloop.aug20;
/*Q8. Odd Position Digit Sum – Banking Check
Similarly, another check requires the sum of digits at odd places.
Write a program to print the sum of digits at odd places.
Class Name: OddDigitSum
Method Name: sumOddPosition(int number)
Return Type: void
Variable Suggestion: sum, position*/

import java.util.Scanner;

class OddPositionDigitSum {
	public static void sumOddPosition(int number) {

	int epds=0;
	int opds=0;
	while(number!=0) {
		int rem=number%10;
		opds=opds+rem;
		number=number/10;
		int rem2=number%10;
		epds=epds+rem2;
		number=number/10;
	}
	System.out.println("Sum Even Position: "+opds);
	
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number : ");
	int number=sc.nextInt();
	sumOddPosition(number);
	
	

}


}
