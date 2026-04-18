package COLLECTION_MOCK;

	import java.util.Deque;
	import java.util.LinkedList;

	public class DequeExample {
	    public static void main(String[] args) {

	        // Create Deque
	        Deque<String> deque = new LinkedList<>();

	        // Add elements at both ends
	        deque.addFirst("A");
	        deque.addLast("B");
	        deque.addFirst("C");
	        deque.addLast("D");

	        System.out.println("Deque after additions: " + deque);

	        // Remove elements from both ends
	        String firstRemoved = deque.removeFirst();
	        String lastRemoved = deque.removeLast();

	        System.out.println("Removed from front: " + firstRemoved);
	        System.out.println("Removed from rear: " + lastRemoved);

	        System.out.println("Deque after removals: " + deque);
	    }
	}