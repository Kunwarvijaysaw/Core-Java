package Sept01;


class College {
	String studentName;
	int rollNo;
	 public  void collegeDetails() {
		 System.out.println("Student  Name : "+studentName);
		System.out.println("Roll no : "+rollNo);

}
			
//}		
//			
//	class Registration{
	public static void main(String[] args) {
		
		College cd= new College();
		cd.studentName="kvd";
		cd.rollNo=1001;
		College cd2= new College();
		cd2.studentName="bijsy";
		cd2.rollNo=5001;
		cd.collegeDetails();
		cd2.collegeDetails();
		
		

	}

}
