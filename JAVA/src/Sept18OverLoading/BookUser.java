package Sept18OverLoading;

import java.util.Scanner;

public class BookUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Title :");
		String title=sc.next();
		System.out.println("Enter Author :");
		String author=sc.next();
		System.out.println("Enter price :");
		double price=sc.nextDouble();
		
		System.out.println("Enter Discountc: ");
		double discount=sc.nextDouble();
		
		Book b1=new Book(title,author,price);
		if(discount<=0) {
			System.err.println("Error: Invalid discount percentage.");
			System.out.println(b1.displayDetails());
		}
		else if(price<0) {
			System.out.println("Title: Negative Price Book");
			System.out.println("Author: No Author");
			System.out.println("Price: ₹"+price);
		}
		else {
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Price: ₹"+(price-(price*discount/100)));
		}
	}

}
