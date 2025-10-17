package com.nit.OverridingOct17;

public class ZooManagement {
	public static void main(String[] args) {
		Lion lion=new Lion("Simba", 5, 20);
		Elephant elephant=new Elephant("Jumbo", 10,2.5f);
		System.out.println("======Lion Details:====");
		lion.displayinfo();
		lion.makeSound();
		lion.displayManeLength();
		
		System.out.println("======Elephant Details:=======");
		elephant.displayinfo();
		elephant.makeSound();
		elephant.displayTuskLength();
	}

}
