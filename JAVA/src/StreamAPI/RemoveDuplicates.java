package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "abcababbc ";
		String result=s.chars()
				.mapToObj(c->(char)c)
				.distinct()
				.map(String::valueOf)
				.collect(Collectors.joining());
		
//		 String result = Arrays.stream(s.split(" "))
//	                .distinct()
//	                .collect(Collectors.joining(" "));
//
		System.out.println(result);

	}

}
