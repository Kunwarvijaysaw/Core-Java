package Oct07HasARelation;

class User {
	private String name;
	private String profession;
	private Profile profile;
	
	public User(String name, String profession, Profile profile) {
		
		this.name = name;
		this.profession = profession;
		this.profile = profile;
	}
	public String displayUserDetails() {
		return "User Name :"+name+
				"\nProfession : "+profession+
				"\nHeadline : "+profile.displayProfile();
	}

}
