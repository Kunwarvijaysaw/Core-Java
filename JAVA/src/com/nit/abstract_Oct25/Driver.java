package com.nit.abstract_Oct25;

public class Driver {

	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1();
		v.fuelType();

	}

}
interface Fuel
{
	void fuelType();
}
interface Electric
{
	void fuelType();
}
class Vehicle1 implements Fuel,Electric
{

	@Override
	public void fuelType() {
		System.out.println("For Fuel → \"\"Fuel Type: Petrol\"\"\r\n"
				+ "For Electric → \"\"Fuel Type: Electric\"\"\r\n"
				+ "");
		
	}
	
	
}