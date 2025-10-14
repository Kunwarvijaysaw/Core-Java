package Sept13Test;
/*2.Bank_Account_GetterSetter
 (Getter and Setter Methods)
Write a Java program to implement getter and setter methods.
•	Create a class BankAccount with a private variable balance.
•	Write a getter method to return the balance.
•	Write a setter method to update the balance (but ensure balance cannot be set to a negative value).
•	In the main method, create an object of BankAccount, use the setter to set a balance, and then display it using the getter.

Sample Input
5000
Sample Output
Balance after setting: 5000.0
Explanation

*/

public class BankAccount {
	public double balance;
	
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance=balance;
		}else {
			System.out.println("Balance can't be Negative! ");
			System.exit(0);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDisplay() {
		return "Balance after setting: "+balance;
	}

}
