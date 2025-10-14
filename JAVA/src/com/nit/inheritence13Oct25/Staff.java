package com.nit.inheritence13Oct25;

public class Staff {
	String staffId;
	String name;
	public Staff(String staffId, String name) {
		super();
		this.staffId = staffId;
		this.name = name;
	}
	public void displayStaffDetails() {
		System.out.println("Staff Id : "+staffId);
		System.out.println("Staff Name :"+name);
	}

}
