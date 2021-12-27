package com.java;

public class Employee1 extends Person1{
	
	public Employee1() {
		super();
		System.out.println(this);
	}
	public void walk() {
		super.walk();
		System.out.println("employee walking implementation");
	}
	public static void main(String[] args) {
		
		Person1 person1=new Employee1();
		person1.walk();
	}
}
class Person1{
	public Person1() {
		System.out.println("Parent constructor");
	}
	public void walk() {
		System.out.println("walking implementation");
	}
}