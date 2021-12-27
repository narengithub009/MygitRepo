package com.java;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	public LambdaExample() {
		System.out.println("Interface calling");
	}
	public static void main(String[] args) {
		
	IntBinaryOperator lambda = (a, b) -> a+b;
	System.out.println(lambda.applyAsInt(20, 30));
		}
}	

