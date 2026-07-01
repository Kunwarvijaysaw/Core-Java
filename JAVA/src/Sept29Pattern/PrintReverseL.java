package Sept29Pattern;

import java.util.Scanner;

public class PrintReverseL {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(j==(n*2)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
;