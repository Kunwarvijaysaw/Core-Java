package Sept18OverLoading;

class Course {
	String courseId; 
	String courseName;
	int  duration;
	
	public Course() {
		
	}

	public Course(String courseId, String courseName) {
		
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Course(String courseId, String courseName, int duration) {
	
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public String displayDetails() {
		return "CourseId : "+courseId+
				"\nCourseName : "+courseName+
				"\nDuration : "+duration+" month";
	}
	

}
