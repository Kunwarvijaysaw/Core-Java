package com.nit.topic_interface;

public class DriverUser {

	public static void main(String[] args) {
		Cars car=new Cars();
		car.drive();
		car.playSong();

	}

}
abstract class Vehicles{
	public abstract void drive();
}
interface MusicSystem{
	public abstract void playSong();
}
class Cars extends Vehicles implements MusicSystem{

	@Override
	public void playSong() {
		System.out.println("Music Start..........");
		
	}

	@Override
	public void drive() {
		System.out.println("Drive car.");
		
	}
	
}