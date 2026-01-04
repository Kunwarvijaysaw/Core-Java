package ExamNIT;

import java.util.Scanner;

// ---------- Custom Exception ----------
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

// ---------- Validator Class ----------
class PasswordValidator {

    public static void validatePassword(String username, String pass)
            throws InvalidPasswordException {

        int l = 0, u = 0, d = 0, s = 0;

        String allowedSpecial = "@#!$*&";

        if (pass.length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                u++;
            } else if (ch >= 'a' && ch <= 'z') {
                l++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            } else if (allowedSpecial.indexOf(ch) != -1) {
                s++;
            } else {
                throw new InvalidPasswordException("Invalid character used in password.");
            }
        }

        if (u == 0)
            throw new InvalidPasswordException("Must contain at least one uppercase letter.");
        if (l == 0)
            throw new InvalidPasswordException("Must contain at least one lowercase letter.");
        if (d == 0)
            throw new InvalidPasswordException("Must contain at least one digit.");
        if (s == 0)
            throw new InvalidPasswordException(
                    "Must contain at least one special character (@ # ! $ * &).");

        // If password is valid
        System.out.println("Username: " + username);
        System.out.println("Password Set Successfully");
        System.out.print("Password (masked): ");
        for (int i = 0; i < pass.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// ---------- Main Class ----------
public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            PasswordValidator.validatePassword(username, password);
        } 
        catch (InvalidPasswordException e) {
            System.out.println("InvalidPasswordException: " + e.getMessage());
        }
    }
}
