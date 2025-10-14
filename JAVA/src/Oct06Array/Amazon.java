package Oct06Array;

import java.util.Scanner;

class Amazon {
	static double total=0;
	static double dis_amt;
	
	public static double calculateCartTotal(double[] prices) {
		
		
		for(int i=0;i<prices.length;i++) 
		{
			total=total+prices[i];
		}
		return total;
	}
	public static boolean isEligibleForFreeShipping(double total) {
		boolean isPremiumUser=false;
		if(total>=499) {
			isPremiumUser=true;
		}
		return isPremiumUser;
	}
	public static double applyDiscount(double total, boolean isPremiumUser) {
		double dis=0;
		if(isPremiumUser==true) {
			dis=(total*0.1);
			
		}
		dis_amt=total-dis;
		
		return dis_amt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		double price[]=new double[n];
		for(int i=0;i<price.length;i++) {
			price[i]=sc.nextDouble();
		}
		boolean isPremiumUser = true;
		double toalPrice = calculateCartTotal(price);
		System.out.println("Cart Total: ₹"+toalPrice);
		boolean isEligible = isEligibleForFreeShipping(toalPrice);
		System.out.println("Eligible for Free Shipping: "+(isEligible?"Yes":"No"));
		double priceAfterDiscount = applyDiscount(toalPrice, isPremiumUser);
		System.out.println("dis smount: "+priceAfterDiscount);

	}

}
