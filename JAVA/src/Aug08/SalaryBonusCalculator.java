
package Aug08;

import java.util.Scanner;

class SalaryBonusCalculator {
	public static void main (String[]args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Salary : ");
		double salary=sc.nextInt();
		
		
		System.out.println("Enter the Year of service : ");
		double yos=sc.nextInt();
		
		double Amt=(yos>=5)?salary+(salary*0.15):salary+(salary*0.05);
		System.out.println(Amt);
		
		
	}
	

}
