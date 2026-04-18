package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,1,3,2,3,5);
		
		Map<Integer,Long> map=list.stream()
								.collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println("Frequency : "+map);
		
//		Map<Integer,Long> map=list.stream()
//				.collect(Collectors.groupingBy(n->n,Collectors.counting()));
//		map.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}
