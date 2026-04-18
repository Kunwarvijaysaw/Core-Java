package COLLECTION_MOCK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListExample {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 8, 15));
		 System.out.println("List : "+list);

		 //Ascending Order
		 Collections.sort(list);
		 System.out.println("Ascending Order : "+list);
		 
		 //Descending Order
		 Collections.sort(list,Collections.reverseOrder());
		 System.out.println("Descending Order : "+list);
		 
	}

}
