package com.nit.inheritence13Oct25;

public class MessageNotification extends Notification {
	String senderUsername;

	public MessageNotification(String recipientUsername, String message, String senderUsername) {
		super(recipientUsername, message);
		this.senderUsername = senderUsername;
	}
	public void displayMessageNotification() {
		System.out.println("To : "+recipientUsername);
		System.out.println("From : "+senderUsername);
		System.out.println("Mesage : "+message);
	}
	
}
