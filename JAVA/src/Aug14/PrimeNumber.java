package Aug14;

import java.util.Scanner;

class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n =sc.nextInt();
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		}
		else {
			for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			isPrime=false;

			}
			}
		}
		if(isPrime) {
			System.out.println(n+" : is Prime Number");
		}
		else {
			System.out.println(n+" : is not Prime Number");
		}
			
		

	}

}
