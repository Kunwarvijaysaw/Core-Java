package Sept15Constructor;
/**BankAccountTester
Create a class BankAccount with fields for name, accountNumber (auto-generated), and balance.
Use a static variable to generate unique account numbers starting from 1001.
Use a constructor to initialize the name and initial deposit.
Include a method displayAccount() to print the account details.

Class Name:
BankAccount

Instance Variables:
- name (String)
- balance (double)
- accountNumber (int)
- static nextAccountNumber (int) initialized to 1001.

Constructor:
- BankAccount(String name, double balance)

Method:
- displayAccount() → prints account details.

Main Class: 
- BankMain

Input Format:

First  line just take an integer input for how many objects you want (E.g 1,2,3) based on the test cases execute it.
Name (String)*/
class Sample {

	public static void main(String[] args) {
		
		Bank b1=new Bank("kvs",1000,"sbi");
		Bank b2=new Bank(b1,"boi");
		System.out.println(b1.display());
		System.out.println(b2.display());

	}

}
class Bank{
	String name;
	double balance;
	String branch;
	int acNo;
	static int nextAcNo=1001;
	
	public Bank(String name,double balance,String branch){
		this.name=name;
		this.balance=balance;
		this.branch=branch;
	}
	public Bank(Bank b,String branch) {
		this.name=b.name;
		this.balance=b.balance;
		this.branch=branch;
	}
	
	
	public String display(){
		acNo=nextAcNo;
		nextAcNo++;
		return "Name : "+name+" Ac No :"+acNo+" Balance : "+balance+" Branch: "+branch;
		
	}
}
