import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestWord {
	public static void main(String[] args) {
		String s="I love my emotion";
		
		String secondHighest=Arrays.stream(s.split(" "))
				.distinct()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.skip(1)
				.findFirst()
				.orElse("");
		
		System.out.println("Second Highest word : "+secondHighest);
	}

}
