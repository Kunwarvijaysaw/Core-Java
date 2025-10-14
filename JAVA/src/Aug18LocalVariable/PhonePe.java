package Aug18LocalVariable;

class PhonePe {
	public static void makePayment(double amount, double balance){
        boolean success;
        if(balance>=amount ){
           success=true;
            System.out.println("Payment successful");
        }
        else{
            success=true;
           System.out.println("Payment failed. Insufficient balance!"); 
        }
        
    }
    public static void main (String[]args){
     makePayment(1000,5000);  
    }

}
