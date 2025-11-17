package com.nit.exceptionHandling;

import java.util.Scanner;

public class PinIntegerInput {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        try {
            int pin = sc.nextInt();
            String pinStr = String.valueOf(pin);
            if (pinStr.length() != 4) {
                System.out.println("Invalid PIN length. Must be 4 digits.");
            } else {
                System.out.println("PIN accepted.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }

}
