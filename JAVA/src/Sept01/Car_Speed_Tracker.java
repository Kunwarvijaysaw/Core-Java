package Sept01;

import java.util.Scanner;

class Car {
	String carName;
	int speed=0;
	
    public void accelerate(int increment) {
       speed+=  increment;
       System.out.println(carName +" accelerated by :  "+ increment +"Km/h");
       System.out.println(carName +" Current Speed:  "+ speed +"Km/h");
    } 
    public void brake(int decrement) {
//    	speed-=decrement;
    	speed=(speed-decrement<0)?0:speed-decrement;
    	System.out.println(carName +" slowed down by :  "+decrement +"Km/h");
    	System.out.println(carName +" Current Speed:  "+ speed +"Km/h");
    }

}
	 
	public class Car_Speed_Tracker{
	public static void main(String[] args) {
		Car c1 =new Car();
		Car c2 =new Car();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car Name : ");
		String carName =sc.nextLine();
		System.out.println("Enter acceleration  : ");
		int increment =sc.nextInt();
		System.out.println("Enter break  : ");
		int brek =sc.nextInt();
		
		c1.accelerate(increment);
		c1.brake(brek);
		sc.nextLine();
		
		System.out.println("Enter Car2 Name : ");
		String carName2 =sc.nextLine();
		System.out.println("Enter acceleration2  : ");
		int increment2 =sc.nextInt();
		System.out.println("Enter break2  : ");
		int brek2 =sc.nextInt();
	
		c2.accelerate(increment2);
		c2.brake(brek2);
		
		

	}

}
