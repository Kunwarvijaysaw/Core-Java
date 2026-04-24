package InterviewLogical;

public class AllZeroShiftedRightSide {
	public static void main(String[] args) {
		int arr[]= {1,0,4,0,3,2,0};
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
				arr[j++]=arr[i];
			}
			
		}
		
		while (j<arr.length) {
			arr[j++]=0;
		}
		
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
