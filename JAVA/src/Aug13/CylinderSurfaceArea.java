package Aug13;

import java.util.Scanner;


class CylinderSurfaceArea {

	public static void main(String[] args) {
		//int r =5,h = 7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		System.out.println("Enter Height : ");
		double h = sc.nextDouble();
		//double pi = 3.14;
		double surfaceAreaOfCylinder =( 2*Math.PI*r*h) +( 2*Math.PI*r*r);
		System.out.println("Surface area of a Cylinder : "+surfaceAreaOfCylinder);
		

	}

}
