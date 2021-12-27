package com.java;

public class JavExceptionHandling {
	public static void main(String[] args) {
		
		try {
			int div=10/0;
			System.out.println(div);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage()+"exception handled");
		}
		System.out.println("No exception occurred");
	}
}
