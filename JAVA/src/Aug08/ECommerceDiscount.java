package Aug08;

import java.util.Scanner;

class ECommerceDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		int amount=sc.nextInt();
		
		double Amt= (amount<=2000) ? amount-(amount*0.1) :  amount-(amount*0.2);
		 
		 
		 
		System.out.println("Final Amt :"+Amt);

	}

}
