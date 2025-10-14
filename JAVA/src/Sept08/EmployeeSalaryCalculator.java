package Sept08;

class EmployeeSalaryCalculator {
	 double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;
	
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public void setDa(double da) {
		this.da = da;
	}
	
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double getHra() {
		return hra;
	}
	
	public double getDa() {
		return da;
	}
	
	public double getTaxPercentage() {
		return taxPercentage;
	}
	
	public double calculateGrossSalary() {
		double grossSalary = basicSalary + hra + da;
		return grossSalary;
		
	}
	
	public double calculateNetSalary() {
		
		double netSalary = (calculateGrossSalary())-(calculateGrossSalary() * (taxPercentage / 100.0));
		return netSalary;
		
	}

}
