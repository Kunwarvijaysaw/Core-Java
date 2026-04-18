package COLLECTION_MOCK;

import java.util.Vector;

 class Test extends Thread {
	static Vector<Integer> vector=new Vector<>();
	
	public void run() {
		for(int i=1;i<=5;i++) {
			vector.add(i);
			System.out.println(Thread.currentThread().getName()+" added "+i);
			
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFinal Vector: " + Test.vector);
    }
}
