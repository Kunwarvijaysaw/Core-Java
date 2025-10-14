package Aug28Variable;

class OnlineCourse {
	 String name;
	 String courseName;
	 int rating;
	 String feedback;
	public void collectFeedback(String name,String courseName,int rating,String feedback) {
	
		this.name = name;
		this.courseName = courseName;
		this.rating = rating;
		this.feedback = feedback;

	}
	
	public void displayFeedback() {
		System.out.println("======Student Feedback======");
		System.out.println("Student Name : "+name);
		System.out.println("Course Name : "+courseName);
		System.out.println("Rating (out of 5) : "+rating);
		System.out.println("Feedback : "+feedback);
		System.out.println("======❤❤❤ Thank you ❤❤❤======");
	}
}
