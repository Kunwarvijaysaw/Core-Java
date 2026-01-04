package com.nit.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*WAP to  create a list of word convert each one of them into uppercase and display*/
public class StreamTest3 {

	public static void main(String[] args) {
	Stream<String>words=Stream.of("Kunwar","Vijay","Saw","Ready","Chinnu");
	List<String>upperCaseWords=words.map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(upperCaseWords);
	

	}

}
