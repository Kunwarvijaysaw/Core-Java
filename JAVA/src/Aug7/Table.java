package Aug7;
/*Q3. Print Multiplication Table
Question: Write a program to print the multiplication table of a given
number using a for loop. */

class Table {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X" + i + " = " + n * i);
		}
	}
}