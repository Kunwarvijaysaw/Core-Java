package COLLECTION_MOCK;

import java.util.*;

public class TreeMapDescendingOrder {
    public static void main(String[] args) {

        // Custom Comparator for descending order
        Comparator<Integer> descComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;  // Reverse order
            }
        };

        // Create TreeMap with custom comparator
        TreeMap<Integer, String> map = new TreeMap<>(descComparator);

        // Add elements
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(4, "Python");
        map.put(2, "JavaScript");

        // Display elements (sorted in descending order)
        System.out.println("TreeMap in Descending Key Order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}