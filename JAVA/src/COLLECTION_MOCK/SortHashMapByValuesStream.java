package COLLECTION_MOCK;

import java.util.*;

public class SortHashMapByValuesStream {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C++");
        map.put(1, "Java");
        map.put(4, "Python");
        map.put(2, "JavaScript");

        // Sorting using streams
        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue())
           .forEach(entry -> 
               System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}