package Oct6HasARelation;

/*WAP to Represent sinple banking System withn
 the following requirement
 ==>Name
 ==>address
 2.A bank Account has:
 -AccountNumber
 -Balance
 -A reference to the Customer who owns it
 3.You should be able to 
 -
 create a customer
 -link the customer to an account
 -display all details
 */
class Banking {
	String bankName;
	long accountNumber;
	double balance;
	Customer customer;
	
	double deposit;
	


	
	public Banking(String bankName, long accountNumber, double balance, Customer customer) {
	
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}

	 public void deposit(double amount) {
	        this.balance += amount; // Add deposit to balance
	    }

	public String displayDetails() {
		return "Customer Name : "+this.customer.name+
				"\nBank Name : "+this.bankName+
				"\nAccount No : "+this.accountNumber+
				"\nBalance Rs."+this.balance+
				"\nStreet Name : "+this.customer.address.streetName+
				"\nCity : "+this.customer.address.city+
				"\nState :"+this.customer.address.state+
				"\nPin Code :"+this.customer.address.pinCode+
				"\nCountry : "+this.customer.address.country;
	}
	
	
}


	
	
	
	



