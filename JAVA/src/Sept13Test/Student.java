package Sept13Test;

import java.util.Scanner;

/*Static_Vs_Instance_Varibles
 (Static vs Instance Variables)
Write a Java program to demonstrate the difference between static and instance variables.
•	Create a class Student with an instance variable name and a static variable schoolName.
•	Assign different names to two student objects, but keep the school name common for both.
•	Print the values to show how the instance and static variables behave differently.
Sample Input
Alice
Bob
ABC Public School
Sample Output
Student 1 Name: Alice
Student 1 School: ABC Public School

Student 2 Name: Bob
Student 2 School: ABC Public School
*/
class Student {
	String name;
	static String schoolName;
	
	public void setDetails(String name,String school) {
		this.name=name;
		schoolName=school;
		
		
	}
	

}


