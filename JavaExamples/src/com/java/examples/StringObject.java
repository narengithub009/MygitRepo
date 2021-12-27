package com.java.examples;

public class StringObject {
	
	public static void main(String[] args) {
		
		//String string =new String("Java");
		String string="Java";
		
		System.out.println(string+" "+string.hashCode());
		
		string = "Updated Java";
		
		System.out.println(string+" "+string.hashCode());
		
		string = "Java";
		
		System.out.println(string+" "+string.hashCode());
		
		string.concat("Tech");
		
		System.out.println(string);
	}
}
