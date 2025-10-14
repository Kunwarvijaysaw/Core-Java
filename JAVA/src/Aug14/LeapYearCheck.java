package Aug14;

import java.util.Scanner;

class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Years");
		double years = sc.nextDouble();
		if(years%400==0 ||years%4==0 && years%100!=0) {
			System.out.println("Leap year");
			
		}
		
		else {
			System.out.println("Not Leap year");
		}


	}

}
