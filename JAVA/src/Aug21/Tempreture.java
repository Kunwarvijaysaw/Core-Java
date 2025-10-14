package Aug21;

import java.util.Scanner;

class Tempreture {
	static int preTemp1;
	static int currentTemp2;
	public static void calculateTempreture() {
//		int currentTemp1;
//		int preTemp2;
		
		int differenceTemp = (preTemp1 -currentTemp2);
		System.out.println("Tempreture : "+differenceTemp);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Previous Tempreture : ");
		preTemp1=sc.nextInt();
		System.out.println("Enter Current Tempreture : ");
		currentTemp2=sc.nextInt();
		
		calculateTempreture();

	}

}
