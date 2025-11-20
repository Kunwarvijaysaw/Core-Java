package com.nit.exceptionHandling;


interface OrderOperations{
	public void placeOrder(); 
	public void cancelOrder();
}


abstract class Product{
	private String productName;
	private double price; 
	private int stock;
	public Product(String productName, double price, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	
}


























public class EcommerceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
