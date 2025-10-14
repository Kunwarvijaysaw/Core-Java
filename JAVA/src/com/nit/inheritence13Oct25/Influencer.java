package com.nit.inheritence13Oct25;

public class Influencer extends User{
	int followerCount;
	String sponsorshipStatus;
	
	public Influencer(String userName, String emailId, int followerCount, String sponsorshipStatus) {
		super(userName, emailId);
		this.followerCount = followerCount;
		this.sponsorshipStatus = sponsorshipStatus;
	}
	
	public void displayInfluencerInfo() {
		System.out.println("=============Influencer Details===============");
		displayUserInfo();
		System.out.println("Follower Count : "+followerCount);
		System.out.println("Sponsorship Status : "+sponsorshipStatus);
	}
	

}
