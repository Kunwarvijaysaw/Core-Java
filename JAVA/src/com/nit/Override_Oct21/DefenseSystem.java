package com.nit.Override_Oct21;

public class DefenseSystem{
	public static void main(String[] args) {
		
		PrecisionAirstrike precisionAirstrike=new PrecisionAirstrike("Generating a precision airstrike plan...\n", "Targeting coordinates locked. Minimum collateral damage ensured.");//1010
		precisionAirstrike.getAirstrikePlan();
		CarpetBombingAirstrike carpetBombingAirstrike=new  CarpetBombingAirstrike("Generating a carpet bombing airstrike plan...\n", "All coordinates in a 5km radius will be bombed for maximum impact.");
		carpetBombingAirstrike.getAirstrikePlan();
	}
}

class Airstrike {
	static String name;
	String missionSetails;

	public Airstrike(String name, String missionSetails) {
		super();
		this.name = name;
		this.missionSetails = missionSetails;
	}
	public Airstrike getAirstrikePlan() {
		System.out.println(this);
		//System.out.println("Generating a generic airstrike plan...");
		return this;
	}
	@Override
	public String toString() {
		return "Airstrike [name=" + name + ", missionSetails=" + missionSetails + "]";
	}
	
}

class PrecisionAirstrike extends Airstrike{

	public PrecisionAirstrike(String name, String missionSetails) {
		super(name, missionSetails);
		System.out.println(super.name);
	}
	@Override
	public PrecisionAirstrike getAirstrikePlan() {
//		System.out.println("Generating a precision airstrike plan...");
//		System.out.println("Targeting coordinates locked. Minimum collateral damage ensured.");
	
		System.out.println(this);
		return this;
	}
	
	@Override
	public String toString() {
		return "PrecisionAirstrike [name=" + name + ", missionSetails=" + missionSetails + "]";
	}
	
	
	
}

class CarpetBombingAirstrike extends Airstrike{

	public CarpetBombingAirstrike(String name, String missionSetails) {
		super(name, missionSetails);
	}
	
	@Override
	public CarpetBombingAirstrike getAirstrikePlan() {
//		System.out.println("Generating a carpet bombing airstrike plan...");
//		System.out.println("All coordinates in a 5km radius will be bombed for maximum impact.");
		System.out.println(this);
		return this;
	}

	@Override
	public String toString() {
		return "CarpetBombingAirstrike [name=" + name + ", missionSetails=" + missionSetails + "]";
	}
	
}
