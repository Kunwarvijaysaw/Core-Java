package Sept08;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ShoppingCartDiscountCalculator  s1 = new ShoppingCartDiscountCalculator ();
		System.out.println("Enter item Price : ");
		double itemPrice=sc.nextDouble();
		
		System.out.println("Enter quantity : ");
		int quantity=sc.nextInt();
		
		System.out.println("Enter Tax Percentage : ");
		double taxPercentage=sc.nextDouble();
		s1.setItemPrice(itemPrice);
		s1.setQuantity(quantity);
		s1.setDiscountPercentage(taxPercentage);
		System.out.println("Total price : "+s1.calculateTotalPrice());
		System.out.println("Discount price : "+s1.calculateDiscountedPrice());

	}

}
