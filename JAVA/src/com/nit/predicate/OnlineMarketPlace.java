package com.nit.predicate;

import java.util.Scanner;

@FunctionalInterface
interface PricingStategery {
	double calculatePrice(double totalAmount, boolean frequentShopper);
}

@FunctionalInterface
interface ProductCategoryChecker {
	double applyCategoryDiscount(double totalAmount, String category);
}

public class OnlineMarketPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Online Marketplace!\n");

        System.out.print("Enter the total order amount in rupees: ");
        double totalAmount = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Are you a frequent shopper? (yes/no): ");
        String frequent = sc.nextLine().trim().toLowerCase();
        boolean isFrequentShopper = frequent.equals("yes");

        System.out.print("Enter the product category: ");
        String category = sc.nextLine().trim().toLowerCase();


		ProductCategoryChecker categoryDiscount = (amount, cate) -> {
			switch (category) {
			case "electronics":
				return amount * 0.90;
			case "cloth":
				return amount * 0.95;
				default :return amount;
			}

		};
		
		PricingStategery pricingStategery =(amount,frequentShopper)->{
			if(frequentShopper==true) {
				return amount*0.95;
			}else {
				return amount;
			}
			
		};
		double afterCategoryDiscount = categoryDiscount.applyCategoryDiscount(totalAmount, category);
        double finalPrice = pricingStategery.calculatePrice(afterCategoryDiscount, isFrequentShopper);


        System.out.printf("\nTotal cost after pricing strategy : "+ finalPrice);
        sc.close();
		

	}
}
