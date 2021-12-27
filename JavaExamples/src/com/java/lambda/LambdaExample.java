package com.java.lambda;

public class LambdaExample {
	
	public static void main(String[] args) {
		
		
		add sum=(a,b)->{
			if(b==0) return 0;
			return a/b;
		};
		System.out.println(sum.safeDivision(125, 5));
		}
		
	}

@FunctionalInterface
 interface add {
	public int safeDivision(int a,int b);
	
}