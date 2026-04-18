package COLLECTION_MOCK;

import java.util.HashMap;

public class DuplicateArray {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements are:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}