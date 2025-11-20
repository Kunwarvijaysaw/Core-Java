/*Problem: Print Even and Odd Numbers Using Two Threads

Problem Description:
Create a Java program that demonstrates multithreading by creating two threads:
EvenThread: Prints all even numbers from 1 to 20.
OddThread: Prints all odd numbers from 1 to 20.

Requirements:
You can create threads either by extending Thread or implementing Runnable.
Each thread should print its respective numbers in the run() method.
Start both threads in the main() method using the start() method.
Numbers can appear in any order depending on thread scheduling.
Sample Output (possible):
Even: 2
Odd: 1
Even: 4
Odd: 3
Odd: 5
Even: 6
...


Hints:
Use a for loop in each thread to print numbers.
Pass a label like "Even" or "Odd" when printing to distinguish outputs.
Threads may run concurrently, so output order may vary.*/


package com.nit.multiThreading;
class EThread extends Thread{
	int n;
	public EThread(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run() { 
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
			System.out.println("Even : "+ i);
			}
		}
	}
}

	class OThread extends Thread{
		int n;
		public OThread(int n) {
			super();
			this.n = n;
		}
		@Override
		public void run() { 
			for(int i=1;i<=n;i++) {
				if(i%2!=0) {
				System.out.println("Odd : "+ i);
				}
			}
		}
	}

public class EvenOddFinder {
	public static void main(String[] args) {
		EThread e1=new EThread(20);
		OThread o1=new OThread(20);
		e1.start();
		o1.start();
	}	
}


