package com.java.inheritence;

abstract class Animals{
	
	String name;
	
	public Animals() {
		super();
		System.out.println("Parent class constructor");
	}

	public abstract void eat();
}
class Cat extends Animals{
	
	public Cat() {
		super();
		System.out.println("Child class constructor");
	}

	@Override
	public void eat() {
		//super.eat();
		System.out.println("Child class eat method");
	}
}
public class OverriddingEx {
	public static void main(String[] args) {
		Animals animal;
		
		animal = new Cat();
		animal.eat();
	}
	
}
