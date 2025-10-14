package com.nit.inheritence13Oct25;

public class User {
	String userName;
	String emailId;
	
	public User(String userName, String emailId) {
		
		this.userName = userName;
		this.emailId = emailId;
	}


	public void displayUserInfo() {
		System.out.println("User Name :  "+userName);
		System.out.println("EmailId : "+emailId);
		
	}
}
