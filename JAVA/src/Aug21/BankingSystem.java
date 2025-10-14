package Aug21;

import java.util.Scanner;

class BankingSystem {
	//static int amt=15000;//Static Variable 
	public static void accountBalance(int amt) {
		//int amt = 10000;//Local Variable 
		System.out.println("Account Balance : Rs. "+amt);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amt= sc.nextInt();
		accountBalance(amt);

	}

}
