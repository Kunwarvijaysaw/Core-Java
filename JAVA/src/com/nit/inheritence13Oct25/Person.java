package com.nit.inheritence13Oct25;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

}
