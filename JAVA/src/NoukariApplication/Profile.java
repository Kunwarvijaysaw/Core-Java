package NoukariApplication;

class Profile {
	String candidateName;
	long mobileNo;
	String emaiId;
	String dob;
	String qualification;
	int yoe;
	String skillSet;
	Address address;

	public Profile(String candidateName, long mobileNo, String emaiId, String dob, String qualification, int yoe,
			String skillSet, Address address) {

		this.candidateName = candidateName;
		this.mobileNo = mobileNo;
		this.emaiId = emaiId;
		this.dob = dob;
		this.qualification = qualification;
		this.yoe = yoe;
		this.skillSet = skillSet;
		this.address = address;
	}

}

class Address {
	String streetName;
	int pinCode;
	String dist;
	String state;
	String Country;

	public Address(String streetName, int pinCode, String dist, String state, String country) {

		this.streetName = streetName;
		this.pinCode = pinCode;
		this.dist = dist;
		this.state = state;
		Country = country;
	}

}