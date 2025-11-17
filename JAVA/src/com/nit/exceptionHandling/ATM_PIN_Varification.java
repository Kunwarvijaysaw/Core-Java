package com.nit.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM_PIN_Varification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logic l=new Logic();
		
		System.out.println("Enter your choice \n1.for String\n2.For int ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1->
		{
			System.out.println("Enter the string passward: ");
			String pin=sc.next();
			l.setString_pin(pin);
			l.Validation_for_String();
			
		}
		case 2->
		{
			System.out.println("Enter the int passward: ");
			
			try
			{
			int pin=sc.nextInt();
			l.setInt_pin(pin);
			l.Validation_for_Int();
			}
			catch(InputMismatchException e)
			{
				System.out.println("not enterd number");
			}
			
		}
		}

	}

}



class Logic
{
	String String_pin;
	int Int_pin;
	
	
	public String getString_pin() {
		return String_pin;
	}
	public void setString_pin(String string_pin) {
		String_pin = string_pin;
	}
	public int getInt_pin() {
		return Int_pin;
	}
	public void setInt_pin(int int_pin) {
		Int_pin = int_pin;
	}
	
	public void Validation_for_String()
	{
		String s=getString_pin();
		String p="";
		
		try
		{
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				p+=ch;
			}else
			{
				throw new PasswardIvalidException();
			}
			
		}
		System.out.println("Pin accepted");
		}
		catch(PasswardIvalidException e)
		{
			System.out.println("Invalid input. Please enter numbers only.");
		}
		
		
	}
	
	public void Validation_for_Int()
	{
		int pin=getInt_pin();
		
		
		try
		{
		
			int c=0;
			while(pin!=0)
			{
				pin/=10;
				c++;
			
			
			}
			
			if(c==4)
			{
				System.out.println("Pin accepted");
				}else
			{
				throw new PasswardIvalidException();
			}
		
		}
		catch(PasswardIvalidException e)
		{
			System.out.println("Invalid PIN length. Must be 4 digits");
		}
		
	}
	
}

class PasswardIvalidException extends Exception {

}