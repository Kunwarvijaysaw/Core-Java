package A_P_Test;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		int length=String.valueOf(n).length();
		int temp=n;
		
		int res=0;
		while(temp!=0) {
			int rem=temp%10;
			res=res+(int) Math.pow(rem, length);
			temp=temp/10;
		}
		
	//	System.out.println("length : "+length);
		if(n==res) {
			System.out.println("Arm Strong number......😊");
		}else {
			System.out.println("Not armstrong number.......");
		}
	}

}
