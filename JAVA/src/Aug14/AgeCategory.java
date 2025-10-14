package Aug14;

import java.util.Scanner;

class AgeCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int age = sc.nextInt();
		if(age>0 && age<=10) {
			System.out.println("Child");	
		}
		else if(age>10 && age<=17) {
			System.out.println("Teen");	
		}
		else if(age>17 && age<=35) {
			System.out.println("Adult");	
		}
		else if(age>35) {
			System.out.println("Senior Citizen");	
		}
		
		
		


	}

}
