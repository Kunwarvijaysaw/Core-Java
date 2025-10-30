package com.nit.topic_interface;

public class Test {

	public static void main(String[] args) {
		Paytm paytm=new Paytm();
		paytm.pay();
		paytm.message();

	}

}
interface Payment{
	public abstract void pay();
	public abstract void message();
	
	
}
abstract class PhonePay implements Payment{
	@Override
	public  void pay() {
		System.out.println("Payment done by PhonePay!");
	}

}
 class Paytm extends PhonePay{
	 @Override
	public void message() {
		System.out.println("Message Transection Successfully Completed!");
	}
}