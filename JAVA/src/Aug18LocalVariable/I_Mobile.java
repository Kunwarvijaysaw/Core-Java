package Aug18LocalVariable;

class I_Mobile {
	public static void LoanEligibilityCheck(double salary, int age) {
        boolean eligible;
        if(salary>=30000 && age>=21){
            eligible=true;
            System.out.println("Loan Approved!");
        }else{
            eligible=false;
            System.out.println("Loan Rejected");
        }

    }
    public static void main(String[]args){
     LoanEligibilityCheck(32000,25);   
    }

}
