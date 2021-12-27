package com.java;

import java.util.function.Predicate;

public class MethodReferencesEx {
	public static void main(String[] args) {
		
		Predicate<String> predicate=s -> s.equals("test");
		
		System.out.println(predicate.test("Test"));
	}
}
