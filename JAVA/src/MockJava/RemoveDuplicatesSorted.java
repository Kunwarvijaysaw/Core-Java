package MockJava;

public class RemoveDuplicatesSorted {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };

		int j = 0; // pointer for unique elements

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr[j] = arr[arr.length - 1]; // add last element
		j++;

		// Print unique elements
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}