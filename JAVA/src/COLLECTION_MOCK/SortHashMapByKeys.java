package COLLECTION_MOCK;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(4, "Python");
        map.put(2, "JavaScript");

        // Sort using TreeMap
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        // Display sorted map
        System.out.println("Sorted HashMap by Keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}