/*Q13. Find the sum of first N natural numbers
Class Name: SumOfNaturals
Variables:
    int n

Sample Input/Output:
    Input: 5 -> Output: Sum = 15
    Input: 10 -> Output: Sum = 55 */


package Aug14;

import java.util.Scanner;

class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			sum =sum+i;
			
		}
		System.out.println("Total number of sum is : "+sum);

	}

}
