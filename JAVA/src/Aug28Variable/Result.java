package Aug28Variable;

class Result {
	int sub1;
	int sub2;
	int sub3;
	int total;
	float average;
	String resultStatus;

	public  void calculateResult(int sub1,int sub2,int sub3){
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.average = average;
		this.resultStatus = resultStatus;
		
		
		total=sub1+sub2+sub3;
		average=total/3.0f;
		resultStatus = (average>=35)?"Pass" :"Fail"	;	

	}
	public  void displayResult(){
		System.out.println("======Student Result====");
		System.out.println("Subject 1 Marks : "+sub1);
		System.out.println("Subject 2 Marks : "+sub2);
		System.out.println("Subject 3 Marks : "+sub3);
		System.out.println("Total Marks : "+total);
		System.out.println("Average : "+average);
		System.out.println("Result : "+resultStatus);
		System.out.println("======Thank you 🙏❤️=======");
		
	}
}
