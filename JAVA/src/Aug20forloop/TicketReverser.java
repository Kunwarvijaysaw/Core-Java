package Aug20forloop;

import java.util.Scanner;

class TicketReverser {
	public static void reverseNumber(long number) {
		long rev=0;
		while(number!=0) {
			long rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("Reversing Train Ticket Numbers: "+rev);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ticket Number : ");
		int number=sc.nextInt();
		reverseNumber(number);
		
		

	}

}
