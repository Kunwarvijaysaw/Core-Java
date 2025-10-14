package Oct07HasARelation;

class MainClassLinkedIn {

	public static void main(String[] args) {
		Profile p1=new Profile("Full Stack Developer");
		User u1=new User("KVS","Engineer",p1);
		System.out.println(u1.displayUserDetails());

	}

}
