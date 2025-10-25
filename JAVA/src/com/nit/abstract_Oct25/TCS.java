package com.nit.abstract_Oct25;

/**/

class TCS {

	public static void main(String[] args) {
		Manager manager = new Manager("Manager");
		Developer developer = new Developer("Developer");
		Tester tester = new Tester("Tester");
		manager.work();
		developer.work();
		tester.work();

	}

}

abstract class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public abstract void work();
}

class Manager extends Employee {
	public Manager(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " Work from Monday to Friday!");
	}
}

class Developer extends Employee {
	Developer(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " Work from monday to thursday!");
	}
}

class Tester extends Employee {
	Tester(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "Work from monday to Saturday!");
	}
}