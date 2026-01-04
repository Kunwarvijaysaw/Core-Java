package com.nit.collection;

import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		Stream<String> name=Stream.of("KVS","SK","AKU","KB","JK");
		name.forEach(System.out::println);
	}

}
//wap to  create employee object .each employee will have name,designation,salary,yoe
//filter and display employee whose salary is more then 50000