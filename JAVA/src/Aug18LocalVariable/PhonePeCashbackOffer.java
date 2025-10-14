package Aug18LocalVariable;

class PhonePeCashbackOffer {
	public static void applyCashback(double amount) {
	double cashback = 0 ;
	if(amount>=1000) {
		cashback=amount * 0.05;
		System.out.println("Cashback Amount is : "+cashback);
	}
	else {
		System.out.println("Not Earn Cashback. Better luck next time  ");
	}
	}

	public static void main(String[] args) {
		
		applyCashback(800);	
	}

}
