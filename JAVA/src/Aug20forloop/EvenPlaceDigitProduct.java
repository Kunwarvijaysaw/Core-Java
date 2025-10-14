package Aug20forloop;

/*Q10. Odd Place Digit Product – Lottery Code

Another lottery check uses the product of digits at odd places.
Write a program to print the product of digits at odd places.
Class Name: OddDigitProduct
Method Name: productOddPosition(int number)
Return Type: void
Variable Suggestion: product, position*/

import java.util.Scanner;

class EvenPlaceDigitProduct {
	public static void productOddPosition(int number) {
		int epds=1;
		int opds=1;
		int pos = 0;
		while(number!=0) {
			int rem=number%10;
			pos++;
			number = number/10;
			if(pos%2==0) {
			epds=epds*rem;
			}else {
				opds=opds*rem;
			}
		}
		
		System.out.println("Product of digit at Even Position: "+epds);
		System.out.println("Product of digit at odd Position: "+opds);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
		productOddPosition(number);
		
		

	}

}
