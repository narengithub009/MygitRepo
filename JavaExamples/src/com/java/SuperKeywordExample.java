package com.java;

class Parent{
	
	 int num=2;
	
	 public Parent() {
		 System.out.println("Parent class default Constructor");
	}
	 
	 public  void foo() {
		 System.out.println("Parent class foo()");
	 }
	 public static void foo(int j) {
		 System.out.println("Parent class foo()");
	 }
}
public class SuperKeywordExample extends Parent {
	
	int num=23;
	public SuperKeywordExample() {
		System.out.println("Child class default Constructor");
	}
	
	public void printNum() {
		System.out.println("Parent class variable "+super.num);
	}
	public void foo() {
		super.foo();
		System.out.println("Child class foo()");
	}
	public static void main(String[] args) {
		SuperKeywordExample example =new SuperKeywordExample();
		example.printNum();
		example.foo();
		example.foo(12);
	}
	
	public static void foo(int j) {
		 System.out.println("Parent class foo()"+j);
	 }
}
