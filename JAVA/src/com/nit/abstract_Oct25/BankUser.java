package com.nit.abstract_Oct25;
/*2: Can Override With Broader Access Modifier
-------------------------------------------------
Scenario:
A Bank class has a protected abstract method processLoan(). A subclass PublicBank wants
to expose it publicly.

Question:
Create an abstract class Bank with protected abstract void processLoan(). Create a
subclass PublicBank and override it using the public modifier. Explain that this is
allowed as it's a broader access level.

ans:yes
*/
public class BankUser {

	public static void main(String[] args) {
		PublicBank p1=new PublicBank() {
		};
		p1.processLoan();

	}

}
abstract class Bank{
	protected abstract void  processLoan();
	
}
 class PublicBank extends Bank{
	@Override
	public  void  processLoan() {
		System.out.println("Loan Approved!!");
	}
	
	
}