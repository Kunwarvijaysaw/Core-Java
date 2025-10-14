package Sept18OverLoading;

public class Employee {
	private String empName;
	private int empId;
	private double empSalary;
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}

	public Employee(String empName, int empId, double empSalary) {
		
		if(empName.isEmpty()) {
			System.err.println("invalid Name Input");
			System.exit(0);
		}
		else if(empId<=0) 
		{
			System.err.println("invalid empID. Input");
			System.exit(0);
		}
		else if(empSalary<=0) {
			System.err.println("invalid Salary Input");
			System.exit(0);
		}
		else {
			this.empName=empName;
			this.empId=empId;
			this.empSalary=empSalary;
		}
	}
	public String displayDetails() {
		return "Valid input. Display all Employee details."+
				"\nEmp Name : "+empName+
				"\n Emp Id. : "+empId+
				"\n Salary : "+empSalary;
	}
	

}
