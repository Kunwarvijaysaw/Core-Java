package Sept04;

import java.util.Scanner;

/*1. Twitter – User & Tweet System

Instance variables: userId, username, followersCount
Static variable: platformName = "Twitter"
Methods (all void):
postTweet(String content) -> prints tweet with username
followUser(String anotherUser) -> prints follow action & increases followersCount
displayUserInfo() -> prints user details

Task: Create 2 users, make them follow each other, post tweets, and display their info.
*/

class TwitterUserSystem {
	String userId;
	String userName;
	int followersCount;
	static String platformName = "Twitter";

	public void postTweet(String content) 
	{
			System.out.println(content);
	}

	public void followUser(String anotherUser) {
		System.out.println("======User Details=====");
		followersCount++;
		System.out.println("Following : "+followersCount+" users");
	}

	public void displayUserInfo() {
		
		System.out.println("User Id : "+userId);
		System.out.println("User Name : "+userName);
		System.out.println("User followers  : "+followersCount);
		System.out.println("Platform Name : "+platformName);
	
	}

	public static void main(String[] args) {
		TwitterUserSystem t1 = new TwitterUserSystem();
		TwitterUserSystem t2 = new TwitterUserSystem();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id : ");
		t1.userId =sc.nextLine();
		System.out.println("Enter User Name : ");
		t1. userName =sc.nextLine();
		
		
//		sc.nextLine();
		while(true) {
			System.out.println("Press 1 for Twit a meaasage");

			System.out.println("Press 2 for Following");

			System.out.println("Press 3 for Dispay profile");
			System.out.println("Press 4 Exit");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter message");
			String message=sc.nextLine();
			t1.postTweet(message);
			break;
			
		case 2:
			t1.followUser("anotherUser");
			
			break;
			
		case 3:
			t1.displayUserInfo();
			
			break;
		case 4:
			System.out.println("Operations ended: ");
			System.exit(0);
		}
		}
//		System.out.println("Enter User Id : ");
//		t2. userId =sc.nextLine();
//		System.out.println("Enter User Name : ");
//		t2. userName =sc.nextLine();
//		t2.postTweet("Feeling good at KVS Technologies");
//		t2.followUser("anotherUser");
//		t2.displayUserInfo();
				
	}

}
