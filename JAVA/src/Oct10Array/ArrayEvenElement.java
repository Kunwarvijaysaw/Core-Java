package Oct10Array;

class ArrayEvenElement {

	public static void main(String[] args) {
		int arr[]={1,12,32,44,222,102,34,56,67,125};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int t =arr[i];
			while(t!=0) {
			if(t%10==2) {
				count++;
				System.out.print(arr[i]+" ");
				break;
			}
			t/=10;
			}
		}
		
		System.out.println("\n"+count);

	}

}
