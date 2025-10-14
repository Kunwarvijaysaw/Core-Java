package Aug08;

 class VoterIDPortal {

	public static void main(String[] args) {
	int age=20;
	String Citizen ="Indian";
	//boolean isIndian = true ; 
	if(age>=18 && Citizen=="Indian") {
		System.out.println("You are Eligible for Voter ID");
	}
	else {
		System.out.println("You are not Eligible for Voter ID");
	}

	}

}
