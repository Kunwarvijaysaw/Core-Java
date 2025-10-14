package Aug22;

import java.util.Scanner;

class DisariumNumber {
static int n;
	public static void checkDisarium(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
			
		}
		System.out.println("Reverse number : "+rev);
		int count=0;
		int result=0;
		while(rev!=0) {
			int remnd=rev%10;
			result=result+(int)Math.pow(remnd,++count);
			rev=rev/10;
		}
		if(n==result) {
		System.out.println(n+" Disarium Number");
		}
		else {
			System.out.println(n+" not a Disarium Number");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		checkDisarium(n);
		

	}

}
