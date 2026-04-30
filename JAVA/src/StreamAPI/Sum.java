package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,1,3,2,3,5);
//		int sum=list.stream().reduce(0,(a,b)->a+b);
//		System.out.println("sum  : "+sum);
		
		
//		list.stream()
//		.sorted(Comparator.reverseOrder())
//		.forEach(System.out::println);
		
		Map<Integer,Long> map=list.stream()
						.collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		System.out.println(map);
				

	}

}
