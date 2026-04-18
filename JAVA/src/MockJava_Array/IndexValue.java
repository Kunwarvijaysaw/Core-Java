package MockJava_Array;

public class IndexValue {

	public static void main(String[] args) {
		  int[] arr = {10, 20, 30, 40, 50};
		  int index=-1;
		  int num=4;
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]==num) {
				  index=i;
				  break;
			  }
		  }
		  
		  System.out.println("Index Value : "+index);


	}

}
