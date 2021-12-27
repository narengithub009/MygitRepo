package com.java;

public class FinalExample extends FinalDemo {
	public static void main(String[] args) {
		final int AGE=32;
		
		//AGE=43;
		
		System.out.println(AGE);
	}
	/*
	 * public final void method() { System.out.println("Overridding"); }
	 */
	
}
class FinalDemo{
	public final void method() {
		System.out.println("Overridding");
	}
}
