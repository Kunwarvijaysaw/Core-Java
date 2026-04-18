package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Kumar","Vijay","Saw");
		
//		List<String> result=list.stream()
//							.map(str->str.toUpperCase())
//							.collect(Collectors.toList());
//		System.out.println(result);

		list.stream().map(str->str.toUpperCase()).forEach(System.out::println);

	}

}
