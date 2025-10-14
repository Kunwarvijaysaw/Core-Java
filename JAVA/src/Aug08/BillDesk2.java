package Aug08;

import java.util.Scanner;

class BillDesk2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Bill Amount");
		double amount=sc.nextInt();
		System.out.println("Welcome in KVS Mall");
		System.out.println("Total Bill Amount"+amount);
		
				
		if(amount>=30000)
		{
		System.out.println("you are Eligibile for 20% Discount");
		double discount= amount*0.2;
		System.out.println("Discount Amount: "+discount);
		System.out.print("Final Amount : ");

		System.out.println(amount-(amount*0.2));
		}
		else
		{			 
		System.out.println("Final Amount : "+amount);
		}
		System.out.println("Thank You Visit again in KVS Mall");

	}

}
