package InterviewQuestion;

import java.util.Scanner;

class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n =sc.nextInt();
		int temp =n;
		int count =0;
		while(n!=0) {
			count++;
			n=n/10;
		}
//		System.out.println(count);
		
		n=temp;
		int armNo=0;
		while(n!=0) {
			int rem =n%10;
			armNo=armNo+(int) Math.pow(rem,count);
			n=n/10;
			
		}
		if(temp == armNo) {
		System.out.println(" Arm Strong Number");
		}
		else {
			System.out.println(" Not a Arm Strong Number");
		}

	}
	

	}


