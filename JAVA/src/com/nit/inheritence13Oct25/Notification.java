package com.nit.inheritence13Oct25;

public class Notification {
	String recipientUsername;
	String  message;
	public Notification(String recipientUsername, String message) {
		super();
		this.recipientUsername = recipientUsername;
		this.message = message;
	}
	
	public void displayNotificationInfo() {
		System.out.println("Recipient Username : "+recipientUsername);
		System.out.println("Message : "+message);
	}

}
