package Aug28Variable;
import java.util.Scanner;
class Student {
	
	 String fullName;
	int rollNumber;
	 String department;
	String emailId;
	long mobileNo;
	public void setInput(String fullName,int rollNumber,String department,String emaiId,long mobileNo) {
		 this.fullName = fullName;
		    this.rollNumber = rollNumber;
		    this.department = department;
		    this.emailId = emailId;
		    this.mobileNo = mobileNo;
	}
	 public void display() {
	 System.out.println("\n--- Student Details ---");
	 System.out.println("Full Name : "+fullName);
	 System.out.println("Roll Number : "+rollNumber);
	 System.out.println("Department Name : "+department);
	 System.out.println("Email Id : "+emailId);
	 System.out.println("Mobile Number : "+mobileNo);
		
	}
	}  


