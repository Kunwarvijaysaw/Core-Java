package com.nit.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");

        String input = sc.next(); 

        try {
            
            if (input.contains(".")) {
                throw new NumberFormatException("decimal");
            }

            int age = Integer.parseInt(input); 

            if (age < 0) {
                throw new InvalidAgeException();
            }

            System.out.println("Age recorded: " + age);

        } catch (NumberFormatException e) {
            if ("decimal".equals(e.getMessage())) {
                System.out.println("Invalid input. Age must be a whole number.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age. Age must be positive.");
        }
    }
}

class InvalidAgeException extends Exception { }