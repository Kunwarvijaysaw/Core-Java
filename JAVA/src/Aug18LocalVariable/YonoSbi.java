package Aug18LocalVariable;

class YonoSbi {
	public static void ATM_WithdrawalCheck(int amount, double balance){
	    double newBalance = balance-amount;
	    if(amount % 100 != 0) {
	        System.out.println("Invalid amount!");
	    } else{
	        System.out.println("Remaining Balance: Rs "+newBalance);
	    }  
	    }
	    public static void main (String[] args){
	      ATM_WithdrawalCheck(1500,5000) ; 
	    }

}
