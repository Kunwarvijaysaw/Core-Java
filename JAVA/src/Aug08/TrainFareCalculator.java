package Aug08;

import java.util.Scanner;

public class TrainFareCalculator {
	public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		
		
		System.out.println("Enter the no of Ticket : ");
		double ticket=sc.nextInt();
		
		double Amt=(age<12)?ticket*50:ticket*100;
		System.out.println(Amt);
		
		
	}

}
