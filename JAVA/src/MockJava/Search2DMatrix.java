package MockJava;

public class Search2DMatrix {

	public static boolean searchMatrix(int[][] mat, int target) {

		int n = mat.length;
		int m = mat[0].length;

		int low = 0;
		int high = n * m - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			int row = mid / m;
			int col = mid % m;

			if (mat[row][col] == target) {
				return true;
			} else if (mat[row][col] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[][] mat = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };

		int target = 9;

		if (searchMatrix(mat, target)) {
			System.out.println("Target Found");
		} else {
			System.out.println("Target Not Found");
		}
	}
}