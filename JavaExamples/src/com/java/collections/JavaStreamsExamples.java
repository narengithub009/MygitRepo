package com.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamsExamples {
	
	private static Employee[] employees= {
			new Employee(12, "Anny"),
			new Employee(23, "Mittu"),
			new Employee(26, "Funny")
	};
	
	public static List<Employee> list=Arrays.asList(employees);
	
	
	public static void main(String[] args) {
		Stream.of(employees).forEach(s->System.out.println(s.getId()+" "+s.getName()));
		list.stream();
	}
}
