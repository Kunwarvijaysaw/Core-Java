package Aug14;
import java.util.Scanner;

public class PositiveNegativeCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		double num = sc.nextDouble();
		if(num==0) {
			System.out.println("Zero");
			
		}
		else if(num>0)
		{
			System.out.println("Positive Number");
		}
		else {
			System.out.println("Negative Number");
		}
		
	}

}
