package Sept22Array;
/*Sum and Average of Elements in an Array
Problem:
Write a program to input 10 numbers in an array. Calculate and display
the sum and average of the elements.
Sample Input
1 2 3 4 5 6 7 8 9
Sample Output
Sum of elements = 55
Average of elements = 5.50*/
import java.util.Scanner;

public class SumAverageElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number store in arry : ");
		int n = sc.nextInt();
		 System.out.println("Enter arry element : ");
	        
		int arr[] = new int[n];// Array length n

		int sum = 0;
		double avg = 0;
//		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}

		avg = (double) sum / n;
		System.out.println("Sum of elements = " + sum);
		System.out.println("Average of elements = " + String.format("%.2f", avg));
	}
}