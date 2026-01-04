package com.nit.collection;
/*1. Product Catalog (Use ArrayList)
Store all available products (id, name, category, price, rating).

Provide operations to:
Add new products
Remove products
Search products by name or category
Display the full list
*/
import java.util.ArrayList;

public class ArrayList_1 {
	ArrayList<Product> a=new ArrayList<Product>();
	
	public void add()
	{
		a.add(new Product(101,"Shirt","Cloth",550,4.5));
		a.add(new Product(102,"Apple","Fruits",150,4.7));
		a.add(new Product(103,"Pea","Vegitable",50,4.8));
		a.add(new Product(104,"shoes","Sleepers",800,4.1));
		System.out.println("Product : "+a);
		a.remove(0);
		System.out.println();
		System.out.println("After Remove Product : "+a);

		//Searching Product
		for(Product p:a)
		{
			if(p.name.equalsIgnoreCase("pea"))
			{
				System.out.println("Product Available : "+p);
			}
		}
		
	}

	public static void main(String[] args) {

		ArrayList_1 b=new ArrayList_1();
		b.add();
		
		
	}

}
class Product{
	int id;
	String name;
	String category;
	double price;
	double rating;
	public Product(int id, String name, String category, double price, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", rating="
				+ rating + "]";
	}
	
}
class Card{
	
}