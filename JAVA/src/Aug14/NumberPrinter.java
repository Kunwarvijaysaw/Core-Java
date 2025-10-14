/*Q11. Print numbers from 1 to 10
Class Name: NumberPrinter
Variables:None
Sample Output:1 2 3 4 5 6 7 8 9 10*/

package Aug14;
import java.util.Scanner;

class NumberPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First digit : ");
		int n = sc.nextInt();
		System.out.println("Enter Last digit : ");
		int n1 = sc.nextInt();
		for(int i=n;i<=n1;i++) {
			System.out.print(" "+i);
		}
		
		

	}

}
