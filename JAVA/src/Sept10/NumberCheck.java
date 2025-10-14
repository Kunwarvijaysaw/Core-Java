package Sept10;

import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserNumber n1= new UserNumber();
		 System.out.println("Enter First number : ");
		int n=sc.nextInt();
		
		n1.isRiteshn(n);
		
		
	}

}
class UserNumber{
	int n;
	
	
	public  boolean isRiteshn(int n) {
		
		if((n/2)*2==n) {
            System.out.println("Riteshn Number");
			return true;
		}else {
            System.out.println("Odd Number");
			return false;
		}
		
	}
}



