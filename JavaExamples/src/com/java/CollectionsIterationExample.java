package com.java;

import java.util.Arrays;
import java.util.List;

public class CollectionsIterationExample {
	
	public static void main(String[] args) {
		
		List<Person> list=Arrays.asList(
				new Person("Naren", "Konreddy", 35),
				new Person("Anny", "Konreddy", 10),
				new Person("Billu", "Konreddy", 17),
				new Person("Mittu", "Pinniti", 12)
				
				);
		
		System.out.println("Iterating through for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterating through for in loop");
		
		for(Person person:list) {
			System.out.println(person);
		}
		
		System.out.println("Iterating through for each loop");
		
		list.forEach(System.out::println);
	}
}
