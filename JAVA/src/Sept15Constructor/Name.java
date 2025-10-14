package Sept15Constructor;
/*3.Student_Grade_System
Create a class Student with a constructor that takes name and three subject marks.
Add a method getAverage() and getGrade() (A for >=85, B for >=70, else C).
Add a method displayResult() to show the name, average, and grade.

Class Name:
Student

Instance Variables:
- name (String)
- mark1 (int)
- mark2 (int)
- mark3 (int)

Constructor:
- Student(String name, int mark1, int mark2, int mark3)

Methods:
- getAverage() → returns average marks
- getGrade() → returns grade
- displayResult() → prints result

Main Class:
- StudentMain

Input Format:
Name (String)
Three subject marks (int)

Output Format:
Student: <name>, Average: <average>, Grade: <grade>

Note:
Use Scanner with next() for String input.
Sample Input
Lily
90
85
88
Sample Output
Student: Lily, Average: 87.666..., Grade: A
*/


	import java.util.Scanner;

	public class Name {
	    public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Student Name : ");
	        String name=sc.next();
	        System.out.println("Enter Marks1  : ");
	        int mark1=sc.nextInt();
	        System.out.println("Enter Marks2  : ");
	        int mark2=sc.nextInt();
	        System.out.println("Enter Marks3  : ");
	        int mark3=sc.nextInt();
	        Student s1=new Student(name,mark1,mark2,mark3);
	        s1.getAverage();
	        s1.getGrade();
	        System.out.println(s1.displayResult());
	    }
	}


	class Student{
	   String name;
	   int mark1;
	   int mark2;
	   int mark3;

	   Student(String name,int mark1,int mark2, int mark3){
	    this.name=name;
	    this.mark1=mark1;
	    this.mark2=mark2;
	    this.mark3=mark3;
	   } 

	   public double getAverage(){
	    return (mark1+mark2+mark3)/3.0;
	   }
	    public char getGrade(){
	        if(getAverage()>=85){
	            return 'A';
	        }else if(getAverage()>=70 && getAverage()<85){
	            return 'B';
	        }else{
	            return 'C';
	        }
	    } 

	    public String displayResult() {
	        return "Student: "+name+", Average: "+String.format("%.1f",getAverage())+", Grade: "+getGrade();
	    }

	}

