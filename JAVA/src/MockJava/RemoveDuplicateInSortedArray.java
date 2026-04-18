package MockJava;

public class RemoveDuplicateInSortedArray {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };

		int n = arr.length;

		if (n == 0)
			return;

		int j = 1; // next unique position

		for (int i = 1; i < n; i++) {

			if (arr[i] != arr[i - 1]) {

				arr[j] = arr[i];
				j++;
			}
		}

		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
