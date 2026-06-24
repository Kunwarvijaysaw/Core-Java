package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,1,3,2,3,5);

		int sum = list.stream()
		              .reduce(0, Integer::sum);

		double avg = list.stream()
		                 .mapToInt(Integer::intValue)
		                 .average()
		                 .orElse(0.0);

		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);

	}

}
