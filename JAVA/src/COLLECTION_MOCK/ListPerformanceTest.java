package COLLECTION_MOCK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
	 public static void main(String[] args) {

	        int n = 100000; // number of elements

	        // Create ArrayList and LinkedList
	        List<Integer> arrayList = new ArrayList<>();
	        List<Integer> linkedList = new LinkedList<>();

	        // -------------------------------
	        // 🔹 Insertion Performance
	        // -------------------------------
	        
	        long startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            arrayList.add(i);
	        }
	        long endTime = System.nanoTime();
	        long arrayListInsertTime = endTime - startTime;

	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            linkedList.add(i);
	        }
	        endTime = System.nanoTime();
	        long linkedListInsertTime = endTime - startTime;

	        // -------------------------------
	        // 🔹 Retrieval Performance
	        // -------------------------------

	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            arrayList.get(i);
	        }
	        endTime = System.nanoTime();
	        long arrayListGetTime = endTime - startTime;

	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            linkedList.get(i);
	        }
	        endTime = System.nanoTime();
	        long linkedListGetTime = endTime - startTime;

	        // -------------------------------
	        // 🔹 Results
	        // -------------------------------

	        System.out.println("Insertion Time:");
	        System.out.println("ArrayList: " + arrayListInsertTime + " ns");
	        System.out.println("LinkedList: " + linkedListInsertTime + " ns");

	        System.out.println("\nRetrieval Time:");
	        System.out.println("ArrayList: " + arrayListGetTime + " ns");
	        System.out.println("LinkedList: " + linkedListGetTime + " ns");
	    }
	}