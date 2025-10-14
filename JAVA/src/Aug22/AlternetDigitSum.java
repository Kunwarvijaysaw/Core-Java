package Aug22;

import java.util.Scanner;

class AlternetDigitSum {
	public static void addAlternate(int num) {
		int sum=0;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of number : "+rev);
		int count=0;
		while(rev!=0) {
			
			int rem1=rev%10;
			count++;
			
			if(count%2!=0) {
				sum=sum+rem1;
			}
			rev=rev/10;
		}
		System.out.println("Alternate digits sum : "+sum);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		addAlternate( num);
		
	}

}
