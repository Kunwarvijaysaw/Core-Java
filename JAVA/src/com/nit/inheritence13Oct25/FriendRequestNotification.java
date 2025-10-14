package com.nit.inheritence13Oct25;

public class FriendRequestNotification extends Notification {
	String requesterUsername;

	public FriendRequestNotification(String recipientUsername, String message, String requesterUsername) {
		super(recipientUsername, message);
		this.requesterUsername = requesterUsername;
	}
	
	public void displayFriendRequestNotification() {
		System.out.println("To : "+recipientUsername);
		System.out.println("From : "+requesterUsername);
		System.out.println("Mesage : "+message);
	}

}
