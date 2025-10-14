package Oct10Array;

import java.util.Arrays;

/*You are given an array of integers and a number of steps.
 *  Implement a function to rotate the array to the left by 
 *  the given number of steps.
 
Input:
nums = [1, 2, 3, 4, 5] 
steps = 2
Output:
[3, 4, 5, 1, 2]
*/
class Arraysort {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };// [3, 4, 5, 1, 2]

		int pos = 2;

		for (int i = 0; i < pos; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}
			arr[arr.length - 1] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
