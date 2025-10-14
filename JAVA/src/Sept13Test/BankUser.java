package Sept13Test;

import java.util.Scanner;

class BankUser {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance : ");
		double balance =sc.nextDouble();
		b1.setBalance(balance);
		System.out.println(b1.getDisplay());
	}

}
