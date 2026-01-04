package com.nit.collection;
/*Write a Java program to create a vector to store objects of a class*/
import java.util.Vector;

public class VectorObject {

	public static void main(String[] args) {
		Vector<Student> v= new Vector();
		v.add(new Student(101, "KVS"));
		v.add(new Student(102, "SR"));
		v.add(new Student(105, "AK"));
		System.out.println(v);
		
	}

}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	
	
}
