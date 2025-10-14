package Aug20forloop;

/*Q2. Mobile Number Masking
For privacy, a mobile app wants to display a user’s phone number in reverse order
when sending a one-time password (OTP).
Write a program to print every digit of a given number in reverse order.
Class Name: MobileMask
Method Name: reverseDigits(int number)
Return Type: void
Variable Suggestion: digit, reversedNumber
*/

class MobileMask {
	public static void reverseDigits(long number) {
		long rev=0;
		while(number!=0) {
			long rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("Mobile No. in Reverse : "+rev);
		
	}

	public static void main(String[] args) {
		reverseDigits(62042678886L);
		
		

	}

}
