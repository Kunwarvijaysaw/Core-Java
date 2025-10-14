package com.nit.inheritence13Oct25;

class JioMessage {

	public static void main(String[] args) {
		MessageNotification messageNotification=new MessageNotification("alex_92", "You have a new message"  ,  "sarah23");
		FriendRequestNotification friendRequestNotification=new FriendRequestNotification("mike_88", "You have a new friend request"  ,"robin77");
		messageNotification.displayMessageNotification();
		System.out.println();
		friendRequestNotification.displayFriendRequestNotification();
	}

}
