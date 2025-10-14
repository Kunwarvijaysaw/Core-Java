package com.nit.inheritence13Oct25;

public class RegularUser extends User {
	int postCount;
	int friendsCount;
	
	public RegularUser(String userName, String emailId, int postCount, int friendsCount) {
		super(userName, emailId);
		this.postCount = postCount;
		this.friendsCount = friendsCount;
	}
	
	public void displayRegularUserInfo() {
		System.out.println("=============RegularUser Details===============");
		displayUserInfo();
		System.out.println("Post Count : "+postCount);
		System.out.println("Friends Count : "+friendsCount);
	}
}
