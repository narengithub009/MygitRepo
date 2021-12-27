package com.java.strings;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=121313;
		System.out.println(num);
		System.out.println(reverseNumber(num));
	}
	
	public static int reverseNumber(int num) {
		
		int reverse=0;
		int remiander;
		
		while(num>0) {
			remiander=num%10;
			System.out.println("remiander"+remiander);
			num=num/10;
			System.out.println("num"+num);
			reverse=reverse*10+remiander;
			System.out.println("reverse"+reverse);
		}
		
		return reverse;
		
	}
}
