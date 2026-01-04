package abstractionImplemetationofjdbcapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		
//		List<Integer> list=List.of(1,2,3,4,5);
//		List<Integer> list2 = list.stream().toList();
//		System.out.println(list2);
		
		//Remove duplicate
//		List<Integer> list = Arrays.asList(1,2,2,3,4,4);
//		 list.stream().distinct().toList().forEach(System.out::println);
//	

		//Even no 
//		 List<Integer> list=List.of(1,2,3,4,5);
//		 list.stream().filter(n->n%2==0).forEach(System.out::println);
	
		
		//Sorted in ascending order
//		List<Integer> list=List.of(1,2,3,4,5);
//		list.stream().sorted().forEach(System.out::println);
	
	
		
		//Check if any number divisible by 5 
//		 List<Integer> list=List.of(1,2,3,4,5);
//		 boolean anyMatch = list.stream().anyMatch(n->n%5==0);
//		 System.out.println(anyMatch);
		 
		 
		//Convert List to Set
//		List<Integer> list=List.of(1,2,3,4,5);
//		Set<Integer> set=list.stream().collect(Collectors.toSet());
//		System.out.println(set);
		
		
		 //Find max element
		List<Integer> list=List.of(1,2,3,4,5);
		int max=list.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
		 //Find min element
//		List<Integer> list=List.of(1,2,3,4,5);
//		int min=list.stream().min(Integer::compareTo).get();
//		System.out.println(min);
		
		
		//Sum of all elements
//		List<Integer> list=List.of(1,2,3,4,5);
//		int sum=list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
		
		
		//Convert list of strings to uppercase
//		List<String> list=List.of("kumar","sk","amit","amar");
//		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
		//Employee salary > 50,000
		List<Integer> sal=List.of(40000,55000,77000,600);
		sal.stream().filter(n->n>50000).forEach(System.out::println);
		
	}

}
