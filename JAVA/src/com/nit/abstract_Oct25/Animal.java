package com.nit.abstract_Oct25;

/*//wap  for the foloowing requirement
-create an abstract method
-camplete the abstract method in the immediate sub class
-create object and call the complete method*/

abstract class AnimalClass {
	public abstract void makeSound();

}

class Lion extends AnimalClass {
	@Override
	public void makeSound() {
		System.out.println("Lion Roars");
	}

}

public class Animal {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.makeSound();
	}
}