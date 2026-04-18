package MockJava;

public class ShiftZeroInLast {
	public static void moveZeros(int[] arr) {
		int j = 0; // position for next non-zero element

		// Step 1: Move non-zero elements forward
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}

		// Step 2: Fill remaining positions with zero
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 4, 0, 5 };

		moveZeros(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}