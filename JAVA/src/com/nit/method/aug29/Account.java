package com.nit.method.aug29;

class Account {
	String upi;
	long mobileNiumber;
	long acNo;
	double balance;
	
	public  void setAccountDetails(String upi,long mobileNiumber,long acNo,double balance) {
		this.upi = upi;
		this.mobileNiumber=mobileNiumber;
		this.acNo=acNo;
		this.balance= balance;
		
		
	}
	public void transfer(Account ac,int amount) { //ac=a , this=b
		if(this.balance>=amount) {
		this.balance=this.balance-amount;
		ac.balance =ac.balance+amount;
		System.out.println("transfer Successfully ");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void checkBalance() {
		System.out.println("Current Ballance of  : "+this.balance);
		
		
	}

	
}

