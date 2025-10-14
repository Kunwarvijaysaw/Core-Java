package Sept19OverLoading;

class BankAccount {
	String holderName;
	String accountNumber;
	String branchCode;
	double balance;
	public BankAccount(String holderName, String accountNumber, String branchCode, double balance) {
		
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.branchCode = branchCode;
		this.balance = balance;
	}
	
	BankAccount(BankAccount b, String accountNumber, String branchCode ){
		this.holderName = b.holderName;
		this.accountNumber = accountNumber;
		this.branchCode = branchCode;
		this.balance = b.balance;
		
	}
	
	public String displayDetails(){
		return "HolderName: "+holderName+"\nAccount Number: "+accountNumber+
		       "\nBranch Code: "+branchCode+"\nBalance: Rs. "+balance;
		}
}
