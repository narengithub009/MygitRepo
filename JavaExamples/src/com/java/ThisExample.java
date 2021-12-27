package com.java;

public class ThisExample {
	public static void main(String[] args) {
		ThisExample example=new ThisExample();
		example.thisMethod();
		System.out.println(example);
	}

	private void thisMethod() {
		System.out.println(this);
		
	}
}
