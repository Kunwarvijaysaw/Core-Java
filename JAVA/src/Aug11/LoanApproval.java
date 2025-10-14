package Aug11;

import java.util.Scanner;

	class LoanApproval {
		public static void main (String[]args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Credit Score : ");
		 int cs = sc.nextInt();
         System.out.println("Enter the AnnualIncome : ");
		 int AnnualIncome = sc.nextInt();
//        int cs=850;
//        double AnnualIncome=37000;

        if(cs>700 && AnnualIncome>40000 || cs>800 && AnnualIncome>35000){
            System.out.println("Loan Approved");
		
        }
        else{
            System.out.println("Loan  not Approved");
		
        }

	}

}

	


