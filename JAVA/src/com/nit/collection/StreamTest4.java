package com.nit.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest4 {

	public static void main(String[] args) {
	List<Students> student=Arrays.asList(
			new Students("KVS",4,"A"),new Students("SK",1,"B"),new Students("AKU",2,"C"));
	System.out.println("Student  in the classe are : ");
			student.forEach(System.out::println);
			System.out.println("After sorted student list based on roll no");
			student.stream().
			sorted(Comparator.comparing(s->s.getRollNo())).
			forEach(s->System.out.print(s.getRollNo()+"  "+s.getName()+"\n"));
			
			
	}

}
class Students{
	String name;
	int rollNo;
	String section;
	public Students(String name, int rollNo, String section) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", section=" + section + "]";
	}
	
}