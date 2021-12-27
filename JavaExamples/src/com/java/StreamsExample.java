package com.java;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
	public static void main(String[] args) {
		List<Person> list=Arrays.asList(
				new Person("Naren", "Konreddy", 35),
				new Person("Anny", "Konreddy", 10),
				new Person("Billu", "Konreddy", 17),
				new Person("Mittu", "Pinniti", 12)
				
				);
		
		list.stream()
		.filter(p->p.getLastName().startsWith("K"))
		
		.forEach(p->System.out.println(p.getFirstName()));
	}
}
