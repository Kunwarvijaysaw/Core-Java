package Aug20forloop;

import java.util.Scanner;

/*Q3. Lucky Ticket Checker
In some countries, a bus ticket is considered “lucky” if the sum of its digits is
divisible by 9.
Write a program to calculate the digital sum of a ticket number.
Class Name: TicketChecker
Method Name: digitalSum(int number)
Return Type: void
Variable Suggestion: sum
*/
import java.util.Scanner;
class LuckyTicketChecker {
	public static void digitalSum(int number) {
		
		int sum=0;
		while(number>0) {
			 int rem=number%10;
			 sum=sum+rem;
			 number=number/10;
		}
		if(sum%9==0) {
		System.out.println("Lucky ticket");
		}
		else {
			System.out.println(" Not Lucky ticket");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbner : ");
		int number=sc.nextInt();
		digitalSum( number);
		
	}

}
