package Aug08;

import java.util.Scanner;

	class BankLoanApproval {
		public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Credit Score : ");
		int cs = sc.nextInt();
		String result = (cs>=750)?"Loan Approved" : "Loan Rejected";
		System.out.println(result);
		
		
	}

}
