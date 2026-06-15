package Sept27Array;

public class Occurence {

	public static void main(String[] args) {
		int arr[]= {1,5,1,5,2,3,4,3,6,4};
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			int found=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i<j) {
					count++;
				}
				
				if(arr[i]==arr[j]&& i>j) {
					found=1;
					break;
				}
			}
			if(count>1&& found==0) {
				System.out.println(arr[i]+" -->"+count);
			}
		}

	}

}
