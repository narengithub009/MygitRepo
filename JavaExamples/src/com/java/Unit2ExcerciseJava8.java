package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExcerciseJava8 {

public static void main(String[] args) {
		
		List<Person> list=Arrays.asList(
				new Person("Naren", "Konreddy", 35),
				new Person("Anny", "Konreddy", 10),
				new Person("Funny", "Konreddy", 20),
				new Person("Mittu", "Pinniti", 14),
				new Person("Sweety", "Pinniti", 18)
				);
		
		//Step 1: Sort list by using last name
		
		Collections.sort(list, (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
		
		System.out.println("Print All persons");
		performConditonally(list,p->true,p->System.out.println(p.getFirstName()));
		
		// Step2 : Create method that prints all elements of list
		System.out.println("Print All persons with fisrt name start with A");
		performConditonally(list, (person)-> person.getFirstName().startsWith("A"),p->System.out.println(p.getFirstName()));
		
		System.out.println("Print All persons with Last name start with P");
		performConditonally(list, (person) -> person.getLastName().startsWith("P"),p->System.out.println(p.getLastName()));
				
	}

	private static void performConditonally(List<Person> list, Predicate<Person> predicate , Consumer<Person> consumer) {
		
		for(Person p:list) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

	
}
