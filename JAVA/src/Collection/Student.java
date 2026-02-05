package Collection;

import java.util.Arrays;
import java.util.Comparator;

class Result{
	int rollNo;
	String name;
	int marks;
	public Result(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Result [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Student {

	public static void main(String[] args) {
		Result[] result = new Result[5];

		result[0] = new Result(101, "Kunwar", 80);
		result[1] = new Result(103, "Amit", 75);
		result[2] = new Result(105, "Ravi", 68);
		result[3] = new Result(102, "Suresh", 90);
		result[4] = new Result(103, "Anil", 72);
		
		Comparator<Result> res=(r1,r2)->Integer.compare(r1.rollNo,r2.rollNo);
		Arrays.sort(result,res);
		System.out.println("\n=====by Rollno=====");
		print(result);
		
		Comparator<Result> res1=(r1,r2)->r1.name.compareTo(r2.name);
		Arrays.sort(result,res1);
		System.out.println("\n=====by Name=====");
		print(result);
		

	}
	public static void print(Result[] result) {
	for(Result r:result) {
		System.out.println(r);
	}

	}
}
