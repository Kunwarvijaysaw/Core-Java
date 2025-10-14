package Oct07HasARelation;

class TestAccount {

	public static void main(String[] args) {
		Transaction t1 = new Transaction(5000);
		AccountClass a1 = new AccountClass("KVS", t1);
		System.out.println(a1.displayAccountDetails());

	}

}
