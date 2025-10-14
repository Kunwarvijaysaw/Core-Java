package Sept13Constructor;

	
class School {
	
	private String name;
	private String department;
	private int rollNo;
	
	public School(String name,String department,int rollNo) {
		this.name =name;
		this.department=department;
		this.rollNo=rollNo;
	}
	
	public String getDisplayDetails() {
		return "| Name : "+name +" | Department: "+department+" | Roll No. : "+rollNo+" |";
	}
	
}

