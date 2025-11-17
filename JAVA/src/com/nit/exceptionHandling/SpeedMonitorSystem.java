/*Q2. Speed Monitoring System – Vehicle Tracking
Scenario:
A traffic control system records distance traveled and time taken by a
vehicle, and needs to compute speed.

Requirements:
Input the distance (in km).
Input the time taken (in hours).

Compute: speed = distance / time
If the time entered is 0, catch ArithmeticException and display:
"Time cannot be zero. Cannot compute speed."*/

package com.nit.exceptionHandling;

import java.util.Scanner;

public class SpeedMonitorSystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter distance in km");
		int distance=sc.nextInt();
		System.out.println("Enter time in hour");
		int time=sc.nextInt();
		
		try {
			double speed=distance/time;
			System.out.println("Speed : "+speed+"Km/h");
			
		} catch (ArithmeticException e) {
			System.out.println("Time cannot be zero. Cannot compute speed.");
		}

	}

}
