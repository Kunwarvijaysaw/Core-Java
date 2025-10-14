package Aug18LocalVariable;

class PhonePeBill {
	public static void SplitBillFeature(double totalAmount, int friends) {
	       double perHead = totalAmount / friends;
	       System.out.println("Each person pays: Rs. "+perHead);
	    }

	    public static void main(String[]args){
	     SplitBillFeature(2000,4);   
	    }

}
