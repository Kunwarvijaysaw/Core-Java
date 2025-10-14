package Sept15Constructor;
/*BankAccountTester
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
Name (String)
Initial deposit (double)

Output Format:
AccountHolder: <name>, AccountNo: <accountNumber>, Balance: <balance>

Note:
Use Scanner with next() for String input.

Sample Input
John
500
Sample Output
AccountHolder: John, AccountNo: 1001, Balance: 500.0*/

import java.util.Scanner;

class BankUser {

	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter How many object created: ");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	    	System.out.println("Enter Name: ");
	        String name=sc.next();
	        System.out.println("Enter Balance: ");
	         double balance=sc.nextDouble();
	        BankAccount b1=new BankAccount(name,balance);
	        System.out.println(b1.displayAccount());
	    }
	    
	}
	}

	class BankAccount{
	String name;
	double balance;
	int accountNumber;
	static int  nextAccountNumber=1001;

	public BankAccount(String name, double balance){
	    this.name=name;
	    this.balance=balance;
	}

	public String displayAccount() {
	    accountNumber=nextAccountNumber;
	    nextAccountNumber++;
	    return "AccountHolder: "+name+", AccountNo: "+accountNumber+", Balance: "+balance;
	}
	}
