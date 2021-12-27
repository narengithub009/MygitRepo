package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit2Excercise {
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
		
		System.out.println("Print All persons");
		printAll(list);
		
		// Step2 : Create method that prints all elements of list
		System.out.println("Print All persons with fisrt name start with A");
		printConditonally(list, new Condition() {
			
			
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("A");
			}
		});
		
		System.out.println("Print All persons with Last name start with P");
		printConditonally(list, new Condition() {
			
			
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("P");
			}
		});


	}

	private static void printConditonally(List<Person> list, Condition condition) {
		
		for(Person p:list) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> list) {
		
		for(Person p:list) {
			System.out.println(p);
		}
		
	}
}
interface Condition{
	
	public boolean test(Person person);
}
