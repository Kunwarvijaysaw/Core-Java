package com.nit.method.aug29;

public class PhonePay {
	public static void main(String[] args) {
		Account a = new  Account();
		Account b = new  Account();
		a.setAccountDetails("9090909090@ybl", 9090909090L, 1234567890L, 500);
		b.setAccountDetails("8080808080@ybl", 8080808080L, 9876543210L, 2000);
		b.transfer(a, 300);
		a.checkBalance();
		
		
		
		

	}

}
