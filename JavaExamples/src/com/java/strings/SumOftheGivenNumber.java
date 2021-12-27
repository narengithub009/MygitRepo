package com.java.strings;

public class SumOftheGivenNumber {
	public static void main(String[] args) {
		int num=4654;
		System.out.println(sumOfNumber(num));
		
	}
	
	public static int sumOfNumber(int num) {
		
		int sum=0;
		int remainder;
		
		while(num>0) {
			
			remainder=num%10;
			num=num/10;
			sum+=remainder;
		}
		return sum; 
	}
}
