package Sept13Constructor;

public class Employee {

	public static void main(String[] args) {
		EmployeeUser e1=new EmployeeUser("Kunwar Vijay","Saw",143,500000,10);
		e1.CalculateSalary();
		System.out.println(e1.getDisplayDetails());
	
	}

}

class EmployeeUser{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public EmployeeUser(String firstName,String lastName,int employeeId,double salary,int noOfProject) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.noOfProject=noOfProject;
		System.out.println("=======Previous value======="+"\n|First Name : "+firstName +" |Last Name : "+lastName+" "
				+ "|Employee Id : "+employeeId+" | Salary : "+salary +" |No of Project : "+noOfProject+" |");
		
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
	
	public String getDisplayDetails() {
		return"=======Updated value======="+ "\n|First Name : "+firstName +" |Last Name : "+lastName+" "
				+ "|Employee Id : "+employeeId+" | Salary : "+salary +" |No of Project : "+noOfProject+" |";
	}
	
}