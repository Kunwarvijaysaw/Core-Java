package com.nit.OverridingOct17;

class Lion extends Animal{
	int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		this.maneLength = maneLength;
	}
	@Override
	public void makeSound() {
		System.out.println("The lion roars loudly.");
	}
	public void displayManeLength() {
		System.out.println("ManelLength : "+maneLength);
		
	}
	

}
