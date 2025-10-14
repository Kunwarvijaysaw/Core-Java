package Oct10Array;

import java.util.Arrays;

class Arraysort5 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 4, 5, 0, 0, 1 };// Output as : {1,4,5,1,0,0,0,0}

		for (int i = 0; i < arr.length; i++) {
			
				for (int j = 0; j < arr.length-1; j++) {
					if (arr[j] == 0) {
						int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
