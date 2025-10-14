package NoukariApplication;

class Noukri {
	String userId;
	Profile profile;
	
	Noukri(String userid,Profile profile){
		this.userId=userid;
		this.profile=profile;
		
	}
	public String displayDetails() {
		return "==============Noukari Details=============="+
				"\nUser Id : "+userId+
				"\n Candidate Name : "+profile.candidateName+
				"\n Mobile No : "+profile.mobileNo+
				"\n Email Id : "+profile.emaiId+
				"\n DOB : "+profile.dob+
				"\n Qualification : "+profile.qualification+
				"\n Year Of Experience : "+profile.yoe+
				"\n Skill Set : "+profile.skillSet+
				"\n Address"+
				"\n Street Name : "+profile.address.streetName+
				"\n Pin COde : "+profile.address.pinCode+
				"\n Dist : "+profile.address.dist+
				"\n State : "+profile.address.state+
				"\n Country : "+profile.address.Country;
	}
	

}
