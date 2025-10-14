package InterviewQuestion;

import java.util.Scanner;

public class CheckNumPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();

			int count=0;//1
			for(int i=1;i<=n;i++)//j=2 3
			{
				if(n%i==0)
					count++;//2
				
			}
			if(count==2) {
				System.out.println("Prime No");
		}
	else {
		System.out.println("Not prime");
	}
	}

	}


