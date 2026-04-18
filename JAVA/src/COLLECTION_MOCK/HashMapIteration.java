package COLLECTION_MOCK;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Using entrySet()
        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Using keySet()
        System.out.println("Using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        // Using values()
        System.out.println("Using values:");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}