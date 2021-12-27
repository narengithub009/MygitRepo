package com.java.strings;

public class FinbonacciSeries {
	public static void main(String[] args) {
		
		int n=10;
		int temp=0;
		int first=0;
		int second=1;
		for(int i=0;i<n;i++) {
			
			temp=first+second;
			first=second;
			second=temp;
			System.out.println(temp);
		}
		
	}
}
