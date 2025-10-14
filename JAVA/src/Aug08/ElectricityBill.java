package Aug08;

import java.util.Scanner;

class ElectricityBill {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Unit : ");
		int units=sc.nextInt();
		int rate=units<=100?5:7;
		int billamount=rate*units;
		System.out.println(billamount);
		

	}

}
