package Aug28Variable;

import java.util.Scanner;

class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bankAccount ac = new bankAccount();
		System.out.println(" Enter Account Holder Name : ");
		String accountHolderName = sc.nextLine();
		System.out.println(" Enter Account Balance : ");
		double balance = sc.nextDouble();
		System.out.println(" Enter Deposit Amount : ");
		double depositAmount = sc.nextDouble();
		System.out.println(" Enter withdraw Amount : ");
		double withdrawAmount = sc.nextDouble();
		ac.accountTransaction(accountHolderName, balance, depositAmount, withdrawAmount);
		ac.display();
		

	}

}
