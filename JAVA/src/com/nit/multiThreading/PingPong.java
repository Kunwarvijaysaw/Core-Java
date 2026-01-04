/*Problem: Print “Ping” and “Pong” Alternately Using Two Threads

Problem Description:
Create a Java program that demonstrates multithreading by creating two
threads that print “Ping” and “Pong” alternately using Thread.sleep() for timing.

Requirements:
Create two classes (or one class reused with parameters) that either extend
Thread or implement Runnable.
One thread should print “Ping”, the other “Pong”.

Use Thread.sleep() to pause between prints (e.g., 500 milliseconds) so
the output alternates clearly.
Repeat the messages multiple times (e.g., 5–10 times).
Start both threads in the main() method using start().

Sample Output (possible):
Ping
Pong
Ping
Pong
Ping
Pong
Ping
Pong
Ping
Pong

Hints:
Use Thread.sleep(500); to create a visible delay.
Because threads run concurrently, the order may vary slightly unless synchronized.
For exact alternation, consider using synchronized method with wait() and
notify().*/

package com.nit.multiThreading;

class Ping extends Thread{
	int n;
	public Ping(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run() { 
		String mes="Ping...!";
		for(int i=1;i<=n;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(mes);
			
		}
	}
}

class Pong extends Thread{
	int n;
	public Pong(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run() { 
		String mes="Pong";
		for(int i=1;i<=n;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(mes);
			
		}
	}
}


public class PingPong {

	public static void main(String[] args) {
		Ping ping =new Ping(10);
		Pong pong=new Pong(10);
		ping.start();
		
		pong.start();

	}

}
