package Sept06;
/*WAP to declare a Merthos Which takes a number as input and returns true if it is even and return false if it is false
*/

import java.util.Scanner;

public class TestNumber {
	public static boolean  isEven(int number) {
		if(number%2==0) {
			return (true);
			
		}else 
			return (false);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		boolean result=isEven(a);

		System.out.println(a+" is even. "+result);
	}

}



