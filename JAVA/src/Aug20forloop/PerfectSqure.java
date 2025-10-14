package Aug20forloop;

import java.util.Scanner;

class PerfectSqure 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		for(int i = 1;true;i++)
		{
			int temp = i * i;
			if(temp == num)
			{
				System.out.println(i+" is perfect square root");
				break;
			}
			if(temp>num)
			{
				System.out.println("Not perfect square root");
				break;
			}
		}
	}
}
