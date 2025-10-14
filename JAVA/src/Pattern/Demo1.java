package Pattern;

import java.util.Scanner;

class Employee
{
	int a=10;
	public static void Details(){
	System.out.println("hello");
    }
	
	
}



public class Demo1 {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter class name");
        String name=sc.nextLine();
		Class cs=Class.forName(name);
		Employee cs1=(Employee) cs.newInstance();
		cs1.Details();
		
		
	}

}
