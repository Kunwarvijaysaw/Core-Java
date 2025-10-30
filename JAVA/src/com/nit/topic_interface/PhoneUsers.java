package com.nit.topic_interface;



public class PhoneUsers {

	public static void main(String[] args) {
		SmartPhone s1=new SmartPhone();
		s1.clickedPicture();
		s1.playMusic();

	}

}
interface Camera
{
	void clickedPicture();
}
interface Music
{
	void playMusic();

	void clickedPicture();
}

class SmartPhone implements Camera,Music{

	@Override
	public void clickedPicture() {
		System.out.println("Petrol");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Model VI");
	}
	
	}