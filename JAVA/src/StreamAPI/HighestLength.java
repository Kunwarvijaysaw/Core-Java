package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {

	public static void main(String[] args) {
		String s="Java is my Lifeline";
		
		String highestLength=Arrays.stream(s.split(" "))
				.max(Comparator.comparingInt(String::length))
				.orElse("");
		
		System.out.println("Longest Word : "+highestLength);
	}

}
