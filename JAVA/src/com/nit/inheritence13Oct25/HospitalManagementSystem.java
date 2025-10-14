package com.nit.inheritence13Oct25;

class HospitalManagementSystem {

	public static void main(String[] args) {
		Doctor doctor=new Doctor("D001", "Dr. Smith","Cardiology" );
		Nurse nurse=new Nurse("ICU", "Naina", "N001");
		doctor.displayDoctorDetails();
		nurse.displayNurseDetails();
      
	}

}
