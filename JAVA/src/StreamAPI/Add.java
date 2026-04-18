package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Add {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,1,3,2,3,5);
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum  : "+sum);
	}

}
