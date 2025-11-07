/*Question 2: Temperature Sensor Reading (Double Wrapper)
----------------------------------------------------------
Problem Statement:
Convert string temperature data into Double wrapper and determine if it is normal (≤ 40°C) or high.

Class Name: TemperatureReader

Instance Variables:
private String temperature;

Constructor:
public TemperatureReader(String temperature)

Methods:
public Double convertToDouble() — Converts to Double, prints "Invalid temperature" if invalid.
public void showStatus() — Prints "Normal" if ≤ 40 else "High Temperature Alert".

Input Format:
<temperature as string>

Output Format:
Normal / High Temperature Alert / Invalid temperature

Sample Test Cases:
Input: 36.5 → Normal
Input: 41.2 → High Temperature Alert
Input: temp → Invalid temperature
Input: 40.0 → Normal
Input: (empty) → Invalid temperature*/

package com.nit.wrapperClass;

import java.util.Scanner;

public class TemperatureReader {
	private String temperature;

	public TemperatureReader(String temperature) {
		super();
		this.temperature = temperature;
	}

	public Double convertToDouble(String temperature) {
		return Double.parseDouble(temperature);
	}

	public void showStatus() {
		if (convertToDouble(temperature) > 40) {
			System.out.println("Hight Temperature Alert!");
		} else {
			System.out.println("Normal....");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Word");
		String temperature = sc.nextLine();
		TemperatureReader t1 = new TemperatureReader(temperature);
		t1.showStatus();

	}

}
