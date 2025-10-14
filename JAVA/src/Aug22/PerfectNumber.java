package Aug22;

import java.util.Scanner;

public class PerfectNumber {
	public static void checkPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		checkPerfect(num);

	}

}
