/*Scenario 1 — User Authentication Check
---------------------------------------
Write a program using Predicate<User> to validate if a login attempt is valid.
A user is valid only if:
Email contains "@"
Password length ≥ 8 characters

Real-world application: Cutting down expensive orders for audit.*/

package com.nit.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String mail;
	String password;
	public User(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [mail=" + mail + ", password=" + password + "]";
	}
	
}
public class CheckAuthentication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many user  you want to create");
		int size=Integer.parseInt(sc.nextLine());
		User users[]=new User[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter User details no : "+(i+1));
			System.out.println("Enter mailId : ");
			String mail=sc.nextLine();
			System.out.println("Enter Password : ");
			String password=sc.nextLine();
			 users[i]=new User(mail,password);
		}
		Predicate<User> p=(u)-> {if(u.getMail().contains("@") && u.getPassword().length()>=8) {
								return true;
								}else {
								return false;
								}
									
								};
		for(User user:users) {
			if(p.test(user)==true) {
				System.out.println("Valid Cradential Please Login... "+user);
			}else {
				System.out.println("Invalid Cradential Try Again... "+user);
			}
		}

	}

}
