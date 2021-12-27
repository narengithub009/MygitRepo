package com.java.inheritence;


class Animal{
	public Animal() {
		System.out.println("Animal constructor");
	}
	final public void food() {
		System.out.println("Animal eats food");
	}
}
class Lion extends Animal{
	public Lion() {
		System.out.println("Lion constructor");
	}
}
public class MyClass {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.food();
				
	}
}
