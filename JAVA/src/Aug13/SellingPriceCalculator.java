package Aug13;
import java.util.Scanner;

class SellingPriceCalculator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cost price : ");
		double cp = sc.nextDouble();
		
		
		//double cp =200;
		double pp = (cp*10/100);
		double sp = cp+pp;
		
		System.out.println("Cost price : "+cp);
		System.out.println("Profit Percentage(10%) : "+pp);
		System.out.println("Selling Price  : "+(cp+pp));
		
		

	}

}
