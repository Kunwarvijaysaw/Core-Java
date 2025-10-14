package InterviewQuestion;

import java.util.Scanner;

class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int start=(int) Math.pow(10, n-1);
		int end=(int) Math.pow(10, n)-1;
		System.out.println(start);
		System.out.println(end);
		System.out.println("============================");
		for(int i=start;i<=end;i++) {//i=2
			int count=0;//1
			for(int j=1;j<=i;j++)//j=2 3
			{
				if(i%j==0)
					count++;//2
				
			}
			if(count==2)
				System.out.println(i);
		}

	}

}
