package MockJava_Array;

public class MatrixRotate90Degre {

	public static void main(String[] args) {
//		int matrix[][]= { {1,2,3},
//						  {4,5,6},
//						  {7,8,9}	};
		boolean found=true;
		int arr[]= {1,2,7,3,4,5};
		for (int i = 0; i <arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				found=false;
			}
		}
		
		System.out.println("Found : "+found);

	}

}
