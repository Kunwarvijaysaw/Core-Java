package Aug28Variable;

class bankAccount {
	String accountHolderName;
	double balance;
	double depositAmount;
	double withdrawAmount;
	

	public  void accountTransaction(String accountHolderName,double balance,double depositAmount,double withdrawAmount) {
		
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;

	}
	
	public void display() {
		System.out.println("======Customer Bank Details======");
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance);
		System.out.println("Deposit Amount : "+depositAmount);
		System.out.println("Total Amount : "+(balance+depositAmount));
		System.out.println("Withdraw Amount : "+withdrawAmount);
		System.out.println("Current Amount : "+(balance+depositAmount -withdrawAmount));
	}

}
