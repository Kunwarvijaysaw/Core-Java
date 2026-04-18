package MockJava_Array;

public class Sorted {

	public static void main(String[] args) {
		//int[] arr = { 1,2,3,4,5};
		int[] arr = { 10, 5, 20, 8, 25, 15 };
		
		boolean isSorted=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
			}else {
				isSorted=true;
			}
		}
		
		System.out.println("Array is Sorted : "+isSorted);


	}

}
