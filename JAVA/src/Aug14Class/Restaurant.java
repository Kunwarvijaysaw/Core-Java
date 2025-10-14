package Aug14Class;
/*A restaurant owner in Ameerpet want to develop an application for the restaurant
named as Mehfil.
The requirement is as follows:

-> Waiter will take orders from the customers from separate tables.
⁃ There must be an automatred sytem due to which the Total Bill will be
calculated and sent as a message to the customers mobile no.
As a developer you have to design an application to fulfill the above
requirements
 */

class Restaurant {
	public static void Order(String itemName,double qty,double price) {
		System.out.println("Dish Name : "+itemName);
		System.out.println("Quantity : "+qty);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Price : "+price);
		System.out.println("Total Amount : "+(qty*price));
	}


	public static void main(String[] args) {
		Order("Biryani",2,160);

		}

}
