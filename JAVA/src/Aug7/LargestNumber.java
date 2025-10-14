package Aug7;
/*Q1. Find the Largest of Three Numbers
Question: Write a Java program to find the largest among three numbers 
using if-else statements.  */

class LargestNumber {
	public static void main(String[] args) {

		int a = 10, b = 50, c = 50;
		if (a >= b && a >= c)
			System.out.println("A is Greater");

		else if (b >= a && b >= c)
			System.out.println("b is Greater");
		else if (c >= a && c >= b)
			System.out.println("C is Greater");
	}
}
