package Sept16Constroctor;
/*Laptop_Discount
Q. Croma has announced a special discount on the purchase of
Laptops as given below:
Price Discount on Laptop
Up to ₹35,000 15.0%
₹35,001 - ₹60,000 20.5%
₹60,001 - ₹1,00,000 30.0%
More than ₹1,00,000 35.0%
Define a class Product described as follows:
Data members/instance variables:
1. name: to store name of customer
2. price: to store price of product
3. dis: to calculate and store the discount
4. amt: calculate and store the amount to be paid
Member Methods:
1. Create a parameterised constructor to initialize the data
members.
2. To accept the details (name of the customer and the price)
3. To compute the discount
4. To display the name, discount and amount to be paid after
discount.
Write a main method to create an object of the class and call the
member method
Sample Input
Ravi
30000
Sample Output
Customer Name: Ravi
Discount: ₹4500.0
Amount Payable: ₹25500.0*/
import java.util.Scanner;

class LaptopUser {
	public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName=sc.next();
        System.out.println("Enter Price: ");
        double price=sc.nextDouble();
        Product p1=new Product(customerName,price);
        p1.Discount();
        
        p1.amount();
        System.out.println(p1.display());
    }
}

class Product{
    String customerName;
    double price;
    double discount;
    double amount;
Product(String customerName,double price){
        this.customerName=customerName;
        this.price=price;
    }
    public void Discount(){
        if(price<=35000){
            discount=price*15/100;
        }else if(price>35000 && price<=60000){
            discount=price*20.5/100;
        }else if(price>60000 && price<=100000){
            discount=price*30/100;
        }else{
            discount=price*35/100;
        }
    }


    public void amount(){
       amount=(price-discount);
    }


    public String display(){
        return "Customer Name: "+customerName+
        "\nDiscount: Rs."+discount+
        "\nAmount Payable: Rs."+amount;
    }
}

