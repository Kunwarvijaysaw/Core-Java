package Sept19OverLoading;

public class BankAccountUser {

	public static void main(String[] args) {
		BankAccount b1= new BankAccount("Ashish","ACC123","BR001",5000);
		BankAccount b2= new BankAccount(b1,"ACC456","BR002");
		System.out.println(b1.displayDetails());
		System.out.println("\n");
		System.out.println(b2.displayDetails());
	}

}
