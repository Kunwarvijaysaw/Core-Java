package Sept03;

import java.util.Scanner;

class RestaurantBillingSystem {

	static String restaurantName;
	String customerName;
	String foodItem;
	int quantity;

	String pizza;
	String burger;
	String pasta;
	String sandwitch;

	void orderMenu(String customerName, String foodItem, int quantity) {

		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quantity;

	}

	void calculation() {
		double price = 0;

		if (foodItem.equals("pizza")) {
			price = 200;
		} else if (foodItem.equals("burger")) {
			price = 150;

		} else if (foodItem.equals("pasta")) {
			price = 120;
		} else if (foodItem.equals("sandwitch")) {
			price = 100;
		}

		double Amount = price * quantity;
		System.out.println("Total amount : " + Amount);
		if (Amount > 500) {
			System.out.println("Discount 10%");
			double gst = Amount * 0.05;
			double Discount = Amount * 0.10;
			System.out.println("Final Price : " + (Amount + gst - Discount));
		} else {
			double gst = Amount * 0.05;
			System.out.println("Final Price : " + (Amount + gst));
		}
	}

	void display() {
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Food Item : " + foodItem);
		System.out.println("Quantity : " + quantity);

	}

	public static void main(String[] args) {
		RestaurantBillingSystem r1 = new RestaurantBillingSystem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Restaurant Name : ");
		r1.restaurantName = sc.nextLine();
		System.out.println("Enter Customer Name : ");
		String customerName = sc.nextLine();
		System.out.println("Enter Food Item : ");
		String foodItem = sc.nextLine();
		System.out.println("Enter quantity : ");
		int quantity = sc.nextInt();
		r1.orderMenu(customerName, foodItem, quantity);
		r1.display();
		r1.calculation();

	}

}
