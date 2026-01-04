package Oct10Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Arraysort5 {

	public static void main(String[] args) {
	int [] arr = { 1, 0, 0, 4, 5, 0, 0, 1 };// Output as : {1,4,5,1,0,0,0,0}
//
//		for (int i = 0; i < arr.length; i++) {
//			
//				for (int j = 0; j < arr.length-1; j++) {
//					if (arr[j] == 0) {
//						int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j+1]=temp;
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		List<Integer>set1=new ArrayList<Integer>();
		List<Integer>set2=new ArrayList<Integer>();
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				set1.add(arr[i]);
			}
			else
			{
			set2.add(arr[i]);
			}
			
		}
		set1.addAll(set2);
		System.out.println(set1);
	}

}
