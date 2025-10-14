package Sept06;

class Student {
	String firstName;
	String lastName;
	int age;
	String gender;
	String department;
	long contactNo;
	String address;
	
	public Student(String firstName,String lastName,int age,String gender,
			String department,long contactNo,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender =gender;
		this.department = department;
		this.contactNo = contactNo;
		this.address = address;
		
		
	}
	public void displayDetails() {
        System.out.println("\n--- Student Registered ---");
        System.out.println("Name       : " + firstName + " " + lastName);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Department : " + department);
        System.out.println("Contact No : " + contactNo);
        System.out.println("Address    : " + address);
    }

}
