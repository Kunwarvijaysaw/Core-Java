package Aug20forloop;
/*Q12. Perfect Number – Ancient System
In ancient number theory, certain numbers are called perfect numbers if the sum of
their divisors equals the number itself. A research app needs to verify this.
Write a program to check whether a number is perfect or not.
Class Name: PerfectNumber
Method Name: isPerfect(int number)
Return Type: void
Variable Suggestion: sumOfDivisors*/
import java.util.Scanner;

class PerfectNumber {
//	public static void  isPerfect(int number) {
//		int sum=0;
//		
//		for(int i=1;i<=number/2;i++) {
//			if(number%i==0) {
//				sum=sum+i;
//			}
//
//			
//		}
//		if(number==sum) {
//
//		System.out.println("Perfect Number");
//		}
//		else {
//			System.out.println("Not a Perfect Number");
//		}
//		
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
//		isPerfect( number);
int sum=0;
		
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum=sum+i;
			}

			
		}
		if(number==sum) {

		System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		
		

	}


}
