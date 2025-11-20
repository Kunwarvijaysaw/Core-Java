package com.nit.multiThreading;

import java.util.Scanner;

/*WAP to create two different custom threads ,pass value of no of iteration to be done by the user
  create parameter constructor to received the  no of iteration .override run () method to execute a loop for 
  n number of iteration based of user input
  hint take a instance variable to initialize the iteration*/
public class Test {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		MyThread m1=new MyThread(n);
		MyThreadTwo m2=new MyThreadTwo(n);
		m1.start();
		m2.start();
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Task one Executed : " + i);
//		}

	}

}
class MyThread extends Thread{
	int n;
	
	public MyThread(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			System.out.println(this.currentThread().getName()+" : " + i);
		}
	}
}

class MyThreadTwo extends Thread{
	int n;
	
	public MyThreadTwo(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			System.out.println(this.currentThread().getName()+" : " + i);
		}
	}
}