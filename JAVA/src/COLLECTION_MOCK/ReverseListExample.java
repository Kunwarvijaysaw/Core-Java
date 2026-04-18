package COLLECTION_MOCK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		Collections.reverse(list);
		System.out.println("Reverse using Collections : "+list);
		
		//manually
		System.out.print("Manually Print : ");
		for (int i= list.size();i>0; i--) {
			System.out.print(i+" ");
			
		}
	}

}
