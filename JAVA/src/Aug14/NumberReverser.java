package Aug14;

import java.util.Scanner;

class NumberReverser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n =sc.nextInt();
		
		while(n>0) {
			int ld =n%10;
			System.out.print(ld+" ");
			n=n/10;
			
			
		}
		
	}

}
