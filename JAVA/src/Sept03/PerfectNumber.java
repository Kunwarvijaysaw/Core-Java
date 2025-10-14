package Sept03;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
//		int fn = 1, ln = 1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int fn =sc.nextInt();
		System.out.println("Enter Last Number");
		int ln =sc.nextInt();
		System.out.println("Perfect Numbers: ");
		for (int i = fn; i <= ln; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (i == sum) {

				System.out.println(i );
			}

		}

	}

}
