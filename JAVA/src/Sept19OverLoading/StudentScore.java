package Sept19OverLoading;

class StudentScore {

	public static void main(String[] args) {
		Student s1=new Student("Sachin",15,9,"Green Valley High ");
		Student s2=new Student(s1,10);
		System.out.println(s1.displayDetails());
		System.out.println("\n");
		System.out.println(s2.displayDetails());
		

	}

}
