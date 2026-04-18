package COLLECTION_MOCK;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMin {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5, 20, 8, 15);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
