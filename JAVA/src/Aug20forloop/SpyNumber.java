package Aug20forloop;

import java.util.Scanner;

class SpyNumber {
	public static void isSpyNumber(int number) {
	int sum=0;	
	int product=1;
	while(number!=0) {
		int rem=number%10;
		product=product*rem;
		sum=sum+rem;
		number=number/10;
	}
	if(sum == product) {
	System.out.println("Spy Number ");
	}
	else {
		System.out.println(" Not Spy Number ");
	}
}

 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  Number : ");
	int number=sc.nextInt();
	isSpyNumber(number);
 }
}
	




