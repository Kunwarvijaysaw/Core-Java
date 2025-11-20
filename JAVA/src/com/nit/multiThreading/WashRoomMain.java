package com.nit.multiThreading;
/* thwo people wants to use single washroom , but only one person can use the 
 * washroom  as only one can stay inside the at a time . if the washroom  is occupied the 
 * other person must wait outside untill*/


class Washroom{
	boolean washroomOccupied=false;
	public synchronized void useWashRoom(String user) throws InterruptedException {
		while(washroomOccupied) {
			System.out.println(user+" waiting outside. ");
			wait();
			
		}
		washroomOccupied=true;
		System.out.println(user+" Enter the washroom...");
		Thread.sleep(2000);
		System.out.println(user+" left the ws");
		washroomOccupied=false;
		notify();
		
	}
}


public class WashRoomMain {

	public static void main(String[] args) {
		Washroom washroom=new Washroom();
		Thread user1 =new Thread(()->{
			try {
				washroom.useWashRoom("Raj");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread user2 =new Thread(()->{
			try {
				Thread.sleep(20);
				washroom.useWashRoom("taj");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		user1.start();
		
		user2.start();

	}

}
