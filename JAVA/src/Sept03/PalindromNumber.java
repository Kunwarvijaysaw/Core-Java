package Sept03;

import java.util.Scanner;

class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int fn =sc.nextInt();
		System.out.println("Enter Last Number");
		int ln =sc.nextInt();
		System.out.println("Pealindroms Numbers: ");
//		int count=0;
		for (int i = fn; i <= ln; i++) {
			int rev = 0;
			
			int temp=i;
			while(temp!=0) {
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if (i == rev) {
//				count++;
				System.out.println(i );
			}

		}
//		System.out.println("Count : "+count);
	}

}
