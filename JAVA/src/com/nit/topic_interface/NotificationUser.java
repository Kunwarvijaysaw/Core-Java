package com.nit.topic_interface;

public class NotificationUser {

	public static void main(String[] args) {
		Email email=new Email();
		email.connect();
		email.sendMessage("Hello message sent sucessfully ");
		email.disconnect();

	}

}
interface Notifivation{
	public abstract void connect();
	public abstract void sendMessage(String message);
	public abstract void disconnect();
}
class Email implements Notifivation{

	@Override
	public void connect() {
		System.out.println(" Connected to the notification server.");
		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("📩 New Message Notification: " + message);
		
	}

	@Override
	public void disconnect() {
		System.out.println(" Disconnected from the notification server.");
		
	}
	
}
