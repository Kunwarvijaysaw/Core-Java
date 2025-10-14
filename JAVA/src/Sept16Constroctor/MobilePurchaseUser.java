package Sept16Constroctor;
/*Mobile_Store_Billing_System
Q. Mobile Store Billing System with Tax and Discount
A mobile store offers discounts based on the price of the smartphone and also adds 18% GST to the discounted amount.

Price Range	Discount
Up to ₹20,000	10%
₹20,001 - ₹40,000	15%
₹40,001 - ₹70,000	22%
More than ₹70,000	28%

Tasks:
Define a class MobilePurchase with the following:
Data Members:
customer_name: Name of the customer
mobile_price: Original price of the mobile
discount: Calculated discount
final_price: Final price after applying discount and GST

Member Methods:
A parameterized constructor to initialize the name and mobile price.
A method to calculate:
Discount based on the price.
GST at 18% on the discounted price.
Final price = discounted price + GST

A method to display:
Customer name
Original price
Discount amount
GST amount
Final amount to be paid
Write the main method to create an object, accept inputs, and display the full bill.

Sample Input
PawanKalyan
15000
Sample Output
---- Mobile Store Bill ----
Customer Name: PawanKalyan
Original Price: ₹15000.0
Discount: ₹1500.0
Price After Discount: ₹13500.0
GST (18%): ₹2430.0
Final Amount Payable: ₹15930.0
*/
import java.util.Scanner;

public class MobilePurchaseUser {
	public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer Name : ");
        String customerName=sc.next();
        System.out.println("Enter Price : ");
        double mobilePrice=sc.nextDouble();
        MobilePurchase m1=new MobilePurchase(customerName,mobilePrice);
        m1.Discount();
        m1.GST();
        m1.finalPrice();
        System.out.println(m1.display());
    }
}

class MobilePurchase{
    String customerName;
    double mobilePrice;
    double discount;
    double total_Price;

    MobilePurchase(String customerName,double mobilePrice){
        this.customerName=customerName;
        this.mobilePrice=mobilePrice;
    }
    public void Discount(){
        if(mobilePrice<=20000){
            discount=mobilePrice*0.1;
        }else if(mobilePrice>20000 && mobilePrice<=40000){
            discount=mobilePrice*0.15;
        }else if(mobilePrice>40000 && mobilePrice<=70000){
            discount=mobilePrice*0.22;
        }else{
            discount=mobilePrice*0.28;
        }
    }

    public double GST(){
        return (mobilePrice-discount)*0.18;
    }

    public void finalPrice(){
        total_Price=(mobilePrice-discount)+GST();
    }


    public String display(){
        return "---- Mobile Store Bill ----"+
        "\nCustomer Name: "+customerName+
        "\nOriginal Price: Rs."+mobilePrice+
        "\nDiscount: Rs."+String.format("%.1f",discount)+
        "\nPrice After Discount: Rs."+(mobilePrice-discount)+
        "\nGST (18%): Rs."+GST()+
        "\nFinal Amount Payable: Rs."+total_Price;
    }
}

