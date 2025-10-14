package InterviewQuestion;

import java.util.Scanner;

public class ArmStrongA_N {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int start=(int) Math.pow(10, n-1);
		int end=(int) Math.pow(10, n)-1;
		System.out.println(start);
		System.out.println(end);
		System.out.println("");
		
		for(int i=start;i<=end;i++) {
			int sum=0;
			int temp =i;
			while(temp!=0) {
				int rem= temp%10;
				sum= sum+(int) Math.pow(rem, n);
				temp=temp/10;
			}
			if(i==sum) {
				System.out.println(sum);
			}
		}
		

	}

}

