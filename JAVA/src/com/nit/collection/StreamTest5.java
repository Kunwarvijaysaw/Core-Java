package com.nit.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* WAP to to create a list of product each product has name id price there may be chance
 *  that  product are added into the list  with same id filter out the unique product and display them*/
public class StreamTest5 {

	public static void main(String[] args) {
		List<Products> product = Arrays.asList(
				new Products(101, "Iphone", 50000), 
				new Products(102, "tablet", 15000),
				new Products(103, "laptop", 5000), 
				new Products(101, "Iphone", 50000));
		
		System.out.println("Products are : ");
		product.forEach(System.out::println);

		System.out.println("distinct product list based on id");
		product.stream().distinct()
				.forEach(s -> System.out.print(s.getId() + "  " + s.getName() + "\n"));

	}

}

class Products {
	int id;
	String name;
	double price;

	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}