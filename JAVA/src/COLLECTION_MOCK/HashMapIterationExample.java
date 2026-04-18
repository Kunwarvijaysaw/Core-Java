package COLLECTION_MOCK;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationExample {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        // 1. Using entrySet()
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 2. Using keySet()
        System.out.println("\nIterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // 3. Using values()
        System.out.println("\nIterating using values():");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}