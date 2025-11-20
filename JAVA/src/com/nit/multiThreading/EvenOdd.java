package com.nit.multiThreading;


class EvenThread extends Thread{
	

	public void printEvenn(int n) throws InterruptedException {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
			System.out.println("Even : "+ i);
			sleep(1000);
			}
		}
	}

	public void printOdd(int n) throws InterruptedException {
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
			System.out.println("odd : "+ i);
			sleep(1000);
			}
		}
	}
	
	}


public class EvenOdd {

	public static void main(String[] args) {
	EvenThread e1=new EvenThread() {
		public void run() {
			try {
				printEvenn(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	};
	EvenThread e2=new EvenThread() {
		public void run() {
			try {
				printOdd(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};

	e1.start();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		e2.start();

	}

}
