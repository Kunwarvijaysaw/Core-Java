package Oct07HasARelation;

class AccountClass {
	private String accountHolder;
	private Transaction transaction;
	public AccountClass(String accountHolder, Transaction transaction) {
		super();
		this.accountHolder = accountHolder;
		this.transaction = transaction;
	}
	public String displayAccountDetails() {
		return "Account Holder : "+accountHolder+
				"\nTransaction : "+transaction.displayTransactionDetails();
	}
}
