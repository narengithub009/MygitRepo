package com.java;

public class LambdaEx1 {
	public static void main(String[] args) {
		
		MyLambdaStringLen lambdaStringLen= s-> s.length();
		int length=lambdaStringLen.findLength("Hello  World");
		System.out.println(length);
	}
	
	interface MyLambdaStringLen{
		public int findLength(String s);
		
	}
}


