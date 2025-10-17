package com.nit.OverridingOct17;

class Elephant extends Animal{
	float  tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		this.tuskLength = tuskLength;
	}
	@Override
	public void makeSound() {
		System.out.println("The elephant trumpets.");
	}
	public void displayTuskLength() {
		System.out.println("TuskLength : "+tuskLength);
	}
	

}
