package Sept11;

import java.util.Scanner;

public class OnlineShoppingApp {

	public static void main(String[] args) {
		Product p1=new Product();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Product Name : ");
		p1.setName(sc.next());
		System.out.println("Enter Price : ");
		p1.setPrice(sc.nextDouble());
		System.out.println("Enter Quantity : ");
		p1.setQuantity(sc.nextInt());
		
		System.out.println(p1.getDisplayProduct());
		
		ShoppingCart c1 =new ShoppingCart();
		c1.addToCart(p1, 2);
		System.out.println(p1.getDisplayProduct());
	}

}
