package com.nit.inheritence13Oct25;

import java.util.Scanner;

class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car car=new Car("Honda",80,"City","Petrol");
		car.displayCarDetails();
		car.displayDetails();
	}

}
