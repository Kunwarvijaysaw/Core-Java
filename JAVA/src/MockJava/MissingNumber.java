package MockJava;

public class MissingNumber {
	public static void main(String[] args) {

		int N = 5;
		int[] arr = { 1, 2, 3, 5 }; // 4 is missing

		int expectedSum = N * (N + 1) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}

		int missing = expectedSum - actualSum;

		System.out.println("Missing Number: " + missing);
	}
}
