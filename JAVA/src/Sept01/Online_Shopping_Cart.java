package Sept01;

import java.util.Scanner;

class Online_Shopping_Cart {
	double totalPrice;
	void addItem(double price) {
		totalPrice+=price;
		
	}
	void display() {
		
		System.out.println("Total amount to pay: $ "+totalPrice);
		
	}
	public static void main(String[] args) {
		Online_Shopping_Cart c1= new Online_Shopping_Cart();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Item : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter price of item"+i+ ":");
			int price=sc.nextInt();
			c1.addItem(price);
			System.out.println("Item "+i+" Price : "+price);
		}
		c1.display();
		

	}

}
