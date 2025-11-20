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
