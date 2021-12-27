package com.java;

public class FibonacciEx {
	
	public static void main(String[] args) {
		
		int i=1,n=10;
		int firstValue=0;
		int secondValue=1;
		
		while(i<=n) {
			System.out.print(firstValue+",");
			
			int fib=firstValue+secondValue;
			firstValue=secondValue;
			secondValue=fib;
			i++;
		}
	}
}
