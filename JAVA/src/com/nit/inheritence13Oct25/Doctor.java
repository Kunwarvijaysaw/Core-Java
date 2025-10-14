package com.nit.inheritence13Oct25;

class Doctor extends Staff {
	String specialization;

	public Doctor(String staffId, String name, String specialization) {
		super(staffId, name);
		this.specialization = specialization;
	}
	
	public void displayDoctorDetails() {
		System.out.println("Doctor Specialization : "+specialization);
		System.out.println("Doctor Name: "+name);
		System.out.println("Doctor Id: "+staffId);
	}

}
