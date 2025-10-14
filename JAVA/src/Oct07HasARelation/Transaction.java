package Oct07HasARelation;

class Transaction {
	private double amount;

	public Transaction(double amount) {
		if(amount<=0) {
		System.out.println("Invalid !");
		System.exit(0);
		}else {
		this.amount = amount;
	}
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double displayTransactionDetails() {
		return amount;
	}

}
