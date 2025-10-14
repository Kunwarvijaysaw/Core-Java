package com.nit.inheritence13Oct25;

class Nurse extends Staff{
	String department;

	public Nurse(String staffId, String name, String department) {
		super(staffId, name);
		this.department = department;
	}
	public void displayNurseDetails() {
		System.out.println("Nurse Department : "+department);
		System.out.println("Nurse Name : "+name);
		System.out.println("Nurse Id : "+staffId);
	}
	

}
