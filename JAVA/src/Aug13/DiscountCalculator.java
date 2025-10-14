package Aug13;
import java.util.Scanner;

import java.util.Scanner;

class DiscountCalculator {

	public static void main(String[] args) {
		//double mrp = 80000;
		double mrp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Cost : ");
		double totalCost = sc.nextDouble();
		//double totalCost = mrp;
		System.out.println("Total Cost : "+totalCost);
		
		if(totalCost<10000 && totalCost>0) 
		{
			
			System.out.println("You are Eligible for 5% Discount");
			double discount =  (totalCost*0.05);
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+(totalCost - discount));
			}
		else if(totalCost>=10000 && totalCost<50000) 
		{
			
			System.out.println("You are Eligible for 15% Discount");
			double discount =  (totalCost*0.15);
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+(totalCost - discount));
			}
		if(totalCost>=50000 && totalCost<80000) 
		{
			
			System.out.println("You are Eligible for 25% Discount");
			double discount =  (totalCost*0.25);
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+(totalCost - discount));
			}
		else if(totalCost>=80000 ) 
		{
			
			System.out.println("You are Eligible for 35% Discount");
			double discount =  (totalCost*0.35);
			System.out.println("Discount : "+discount);
			System.out.println("Final Amount : "+(totalCost - discount));
			}

}
}