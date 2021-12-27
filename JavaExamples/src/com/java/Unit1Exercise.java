package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
	public static void main(String[] args) {
		
		List<Person> list=Arrays.asList(
				new Person("Naren", "Konreddy", 35),
				new Person("Anny", "Konreddy", 10),
				new Person("Funny", "Konreddy", 20),
				new Person("Mittu", "Pinniti", 14),
				new Person("Sweety", "Pinniti", 18)
				);
		
		//Step 1: Sort list by using last name
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
					
		});
		getLastNameStartwithK(list);
		
		// Step2 : Create method that prints all elements of list
		
		printAll(list);
	}

	private static void getLastNameStartwithK(List<Person> list) {
		
		for(Person p:list) {
			if(p.getLastName().startsWith("K")) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> list) {
		
		for(Person p:list) {
			//System.out.println(p);
		}
		
	}
}
