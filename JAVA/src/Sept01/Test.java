package Sept01;

import java.util.Scanner;

class Test {
	static String collegeName;
	static String collegeCode;
	String studentName;
	int rollNo;
	 public  static void collegeDetails() {
			collegeName="JRU";
			collegeCode="JRU-2000";
			Test t1=new Test();
			t1.studentName="kumar";
			t1.rollNo =1001;
			Test t2=new Test();
			t2.studentName="Vijay";
			t2.rollNo =5001;
			Scanner sc= new Scanner(System.in);
			System.out.println("==========College Details======");
			System.out.println("College Name : "+collegeName);
			
			System.out.println("College Code : "+collegeCode);
			System.out.println("Student 1 Name : "+t1.studentName);
			System.out.println("College Name : "+t1.rollNo);
			System.out.println("==========College Details======");
			System.out.println("College Name : "+collegeName);
			System.out.println("College Code : "+collegeCode);
			System.out.println("Student 2 Name : "+t2.studentName);
			System.out.println("College Name : "+t2.rollNo);
			
			
	
	}
//}
// 	class user{
	public static void main(String[] args) {
		Test.collegeDetails();
		

	}

}
