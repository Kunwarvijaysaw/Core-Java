package Sept03;

import java.util.Scanner;

class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n =sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			temp=temp/10;
			sum=sum+fact;
		}
	
		if(n==sum) {
			System.out.println(n+" : is Strong Number");
		}else {
			System.out.println(n+" : is Not Strong Number");
		}
	}

}
