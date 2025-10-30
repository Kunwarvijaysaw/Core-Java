package com.nit.abstract_Oct25;

/*1. Abstract Class Can Be Declared Without Abstract Methods
-----------------------------------------------------------
Scenario:
To prevent direct object creation, you want a class DatabaseConnection to be abstract
even though it contains only concrete methods.

Question:
Create an abstract class DatabaseConnection with a concrete method connect(). Try to
instantiate it and explain why making it abstract still prevents instantiation
even without abstract methods. How can we invoke any concrete method of abstract class
if we cant create the object of abstract class?*/

class DatabaseConnection {
	public static void main(String[] args) {
		Data data = new Data();
		data.connect();
	}

}

abstract class Database {
	public void connect() {
		System.out.println("Concrete method!!!!");
	}

}//we can't instantiate super class without sub class so we create sub class then we execute the method of super class

class Data extends Database {

}