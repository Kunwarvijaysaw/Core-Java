package MockJavaString;

public class Occurence {

	public static void main(String[] args) {
		int arr[]={1,1,2,1,2,7,8,2,5,6};
        for(int i=0;i<arr.length;i++){
            int c=1;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    c++;
                    arr[j]=0;
                }
                
            }
            if(arr[i]!=0)
            System.out.println(arr[i]+"-> "+c);
        }

	}

}
