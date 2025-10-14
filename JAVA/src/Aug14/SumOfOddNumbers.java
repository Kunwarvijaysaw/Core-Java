package Aug14;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n =sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
			sum=sum+i;
			}	
		}
		System.out.println("Sum of odd  1 to "+n+" is : "+sum);

	}

}
