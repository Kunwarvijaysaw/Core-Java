package Sept29Pattern;

public class ThreadClass implements Runnable {
	
	public void run() {
		System.out.println("Thread Start");
	}

	public static void main(String[] args) {
		ThreadClass t=new ThreadClass();
		Thread thread=new Thread(t);
		thread.start();

	}

}
