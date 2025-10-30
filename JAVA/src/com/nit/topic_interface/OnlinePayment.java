package com.nit.topic_interface;

public class OnlinePayment {

	public static void main(String[] args) {
		GooglePay g1=new GooglePay();
		g1.makePayment();
		g1.scanQR();

	}

}
interface Payments{
	public  void makePayment();
}
interface UPIPayment extends Payments{
	public void scanQR();
}
class GooglePay implements UPIPayment{

	@Override
	public void makePayment() {
		System.out.println("payment via Card!");
		
	}

	@Override
	public void scanQR() {
		System.out.println("Payment via Qr Code!");
		
	}
	
}