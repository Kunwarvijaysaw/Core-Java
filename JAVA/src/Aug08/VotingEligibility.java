package Aug08;

import java.util.Scanner;

	class VotingEligibility {
		
		public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		String result = (age>=18)?"Eligible to Vote" : "Not Eligible";
		System.out.println(result);
		
		
	}

}
