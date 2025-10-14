package Aug18LocalVariable;

class applyPromo {
public static void applyPromo(double fare, double discountPercent){
        
        double discount=fare*discountPercent/100;
        double finalFare=fare-discount;
        System.out.println("Fare Amount is : Rs. "+fare);
         System.out.println("Discount Amount is : Rs. "+discount);
          System.out.println("Fare after discount: Rs. "+finalFare);
    }

	public static void main(String[] args) {
		
		applyPromo(1200,10);	
	}


}
