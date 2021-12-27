package com.java;

public class EnumExample {
	
	private SIZE pizzaSize;
	
	public EnumExample(SIZE pizzaSize) {
		super();
		this.pizzaSize = pizzaSize;
	}
	public void orderPiza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered SMALL size Pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered SMALL size Pizza");
			break;
		case LARGE:
			System.out.println("I ordered SMALL size Pizza");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
	public static void main(String[] args) {
		System.out.println(SIZE.LARGE);
		EnumExample enumExample=new EnumExample(SIZE.SMALL);
		enumExample.orderPiza();
	}
	
	
}
enum SIZE{
	SMALL, LARGE, MEDIUM, EXTRALARGE
}