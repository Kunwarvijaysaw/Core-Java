package Sept12;

class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setNoOfProject(int noOfProject) {
		this.noOfProject = noOfProject;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public int getNoOfProject() {
		return noOfProject;
	}
	
	public void CalculateSalary() {
		if(noOfProject>=5 && noOfProject<=10) {
			 salary+=5000;
		}else if(noOfProject>10 && noOfProject<=20) {
			salary+=10000;
		}else if(noOfProject>20 ) {
			salary+=15000;
		}
	}
	
	public void displayDetails() {
		System.out.println(" First Name : "+firstName);
		System.out.println(" Last Name : "+lastName);
		System.out.println(" Employee Id : "+employeeId);
		System.out.println(" Salary : "+salary);
		System.out.println(" No Of Project : "+noOfProject);
		
		
		
	}
}
