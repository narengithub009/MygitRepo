package com.java;

public class JavaLambdaEx {
	public static void main(String[] args) {
		
		MathImpl impl=(a,b)->System.out.println(a*b);
		impl.add(20, 30);
	}
	
	
}

interface MathImpl{
	public void add(int a, int b);
}
