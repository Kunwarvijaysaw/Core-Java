/*Print multiplication table for a given number
Class Name: MultiplicationTable
Variables:
    int number
Sample Input/Output:
    Input: 5 -> Output:
    5 x 1 = 5
    ...
    5 x 10 = 50
*/


package Aug14;

import java.util.Scanner;

class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n +" X "+i +" = " +n*i);
		}

	}

}
