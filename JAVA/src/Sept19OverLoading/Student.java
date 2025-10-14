package Sept19OverLoading;

class Student {
	String name;
	int age;
	int gradeLevel;
	String schoolName;
	public Student(String name, int age, int gradeLevel, String schoolName) {
		
		this.name = name;
		this.age = age;
		this.gradeLevel = gradeLevel;
		this.schoolName = schoolName;
	}
	
	Student (Student s, int gradeLevel){
		this.name =s.name;
		this.age = s.age;
		this.gradeLevel = gradeLevel;
		this.schoolName = s.schoolName;
		
	}
	public String displayDetails(){
		return "Name: "+name+"\nAge: "+age+
		       "\nGrade Level: "+gradeLevel+"\nSchool Name :"+schoolName;
		}
	
}
