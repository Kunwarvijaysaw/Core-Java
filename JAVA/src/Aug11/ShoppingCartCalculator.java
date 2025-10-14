package Aug11;
import java.util.Scanner;
class ShoppingCartCalculator {

	    public static void main (String []args){
	        //double price1 = 800, price2 = 700;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Price One");
	        double price1 = sc.nextInt();
	        System.out.println("Enter Price Two");
	        double price2 = sc.nextInt();


	        double Subtotal = price1 + price2 ;//1200
	        double discount = (Subtotal*0.10);//120
	        double discountAmount = Subtotal - discount;//1200-120=1080
	        double tax = discountAmount*0.08;
	        double finalTotal = discountAmount +tax;

	        System.out.println(Subtotal);
	        System.out.println(discountAmount);
	        System.out.println(tax);
	        System.out.println(finalTotal);

	    }
	}


