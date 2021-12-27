package com.java;

public class TestEx {
	public static void main(String[] args) {
		
		String s="madam";
		
		String reverse="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			reverse=ch+reverse;
		}
		
		System.out.println(reverse);
		System.out.println(reverse.equals(s));
		
		
		char search='k';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==search) {
				count++;
			}
		}
		System.out.println(count);
		
		
		System.out.println("*************************");
		
		int vowel=0;
		int consnonents=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}else {
				consnonents++;
			}
		}
		//System.out.println(vowel+" "+consnonents);
		
		System.out.println("*************************");
		
		int num[] = {1,1,4,4,7};
		
		for(int i=0;i<num.length;i++) {
			for(int k=i+1;k<num.length;k++) {
				if(num[i]==num[k]) {
					System.out.println(num[i]);
				}
			}
		}
		
		System.out.println("*************************");
		
		int n=num.length;
		
		for(int i=n-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
		System.out.println("*************************");
		
		int a=5;
		int b=20;
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println(a+" "+b);
		
		System.out.println("*************************");
		
		System.out.println(fibonacci(a));
		
		System.out.println("*************************");
		
		int n1=0,n2=1,fib;
		int x=5;
		for(int i=0;i<x;i++) {
			
			fib=n1+n2;
			System.out.println(fib);
			n1=n2;
			n2=fib;
		}
		
		System.out.println("*************************");
		
		int fac=1;
		for(int i=1;i<=x;i++) {
			fac=fac*i;
			
		}
		System.out.println(fac);
		
		System.out.println("*************************");
		
		System.out.println(factorial(x));
	}

	private static int factorial(int x) {

		if(x==1) {
			return 1;
		}else {
			return (x*factorial(x-1));
		}
		
	}

	private static int fibonacci(int a) {
		if(a<=1) {
			return 1;}else {
		return fibonacci(a-1)+fibonacci(a-2);
			}
	}
}
