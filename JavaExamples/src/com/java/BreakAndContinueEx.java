package com.java;

public class BreakAndContinueEx {
	
	public static void main(String[] args) {
			
		int n=10;
		
		for(int i=1;i<=n;i++) {
			
			if(i>4&&i<9) {
				continue;
			}
			
			System.out.println(i);
		}
	}
	
	
}
