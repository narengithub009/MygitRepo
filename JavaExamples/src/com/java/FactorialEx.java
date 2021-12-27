package com.java;

public class FactorialEx {
	public static int factorial(int n) {
		
		if(n!=0) {
			return n*factorial(n-1);
		}else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		
		int n =4, result;
		
		result=factorial(n);
		System.out.println(result);
	}
}
