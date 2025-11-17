package com.nit.exceptionHandling;

import java.util.Scanner;

public class PinStringInput {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        try {
            // Check if all characters are digits
            Integer.parseInt(pin);
            // Check length
            if (pin.length() != 4) {
                System.out.println("Invalid PIN length. Must be 4 digits.");
            } else {
                System.out.println("PIN accepted.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}