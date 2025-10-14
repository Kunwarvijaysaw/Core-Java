package Oct11Inheritence;

public class Manager extends Employee {
	String department;
	
	public Manager(String name, String employeeId, double salary, String department) {
		super(name, employeeId, salary);
		this.department = department;
	}
	
	 

	public void displayManagerDetails() {
		displayDetails();
		System.out.println("Department : "+department);
	}




	
	
	
	
	
	

}
