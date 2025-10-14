package com.nit.inheritence13Oct25;

class SocialMediaAccount {

	public static void main(String[] args) {
		Influencer influencer=new Influencer("kumarvijay", "kumar@gmail.com", 5000,"Active");
		RegularUser regularUser=new RegularUser("Punnu","punnu143@gmail.com", 150, 320);
		influencer.displayInfluencerInfo();
		regularUser.displayRegularUserInfo();

	}

}
