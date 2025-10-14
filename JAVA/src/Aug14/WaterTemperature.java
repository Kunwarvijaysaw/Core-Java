package Aug14;

import java.util.Scanner;

class WaterTemperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tempreture");
		int temp = sc.nextInt();
		if(temp>0 && temp <=100 ) {
			System.out.println("Liquid");	
		}
		else if(temp>100 ) {
			System.out.println("Gas");	
		}
		else if(temp<0  ) {
			System.out.println("Ice");	
		}
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
