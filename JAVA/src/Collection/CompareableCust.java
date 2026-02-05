/*Q1) Create a record called Customer, which accepts id, name and bill as a component.
Create an ELC class CustomerComparator with main method.
Create a Customer array with dynamic size and dynamic array initialization using Scanner class. 
Sort the Customer object based on following criteria :
  a) By using Customer id
  b) By using Customer name
  c) By using Customer bill
  */
package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import com.nit.collection.CustomerCard;

public class CompareableCust {

	public static void main(String[] args) {
		Customer[] customer = new Customer[5];

		customer[0] = new Customer(101, "Kumar", 7500);
		customer[1] = new Customer(102, "Amit", 8200);
		customer[2] = new Customer(103, "Ravi", 6000);
		customer[3] = new Customer(104, "Suresh", 9500);
		customer[4] = new Customer(105, "Anil", 7000);
		
		System.out.println("=====Filter Using Name=====");
		Comparator<Customer> cust=(c1,c2)-> c1.name.compareTo(c2.name);
		Arrays.sort(customer,cust);
		print(customer);
//		for(Customer c:customer) {
//			System.out.println(c);
//		}
		
		System.out.println("\n=====Filter Using Id=====");
		Comparator<Customer> custById =(c1, c2) -> Integer.compare(c1.id, c2.id);
		Arrays.sort(customer, custById);
		print(customer);

//		for(Customer c:customer) {
//			System.out.println(c);
//		}
		
		System.out.println("\n=====Filter Using Bill=====");
		Comparator<Customer> custByBill =(c1, c2) -> Double.compare(c1.bill, c2.bill);
		Arrays.sort(customer, custByBill);
		print(customer);
	}
//		for(Customer c:customer) {
//			System.out.println(c);
//		}
		
		static void print(Customer[] customers) {
	        for (Customer c : customers) {
	            System.out.println(c);
	        }
		
	}

}

class Customer{
	int id;
	String name;
	double bill;
	public Customer(int id, String name, double bill) {
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
	
	
}