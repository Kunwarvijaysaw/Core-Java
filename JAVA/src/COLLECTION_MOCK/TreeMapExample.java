package COLLECTION_MOCK;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements (unsorted order)
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(4, "Python");
        map.put(2, "JavaScript");

        // Display elements (automatically sorted by keys)
        System.out.println("Elements stored in sorted key order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}