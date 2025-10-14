package Aug18LocalVariable;

import java.util.Scanner;

class RideFareCalculation {
	public static void FareCalculation(double distance , int rate){
		
        double amount=distance*rate;
        System.out.println("Total Fare is : "+amount);
    }
    public static void main(String []args){
    	// FareCalculation(100,15);
    	Scanner sc= new Scanner(System.in);
		System.out.println("enter distance");
		double distance=sc.nextDouble();
		System.out.println("enter rate");
		int rate=sc.nextInt();		
        FareCalculation(distance,rate);
        
    }

}
