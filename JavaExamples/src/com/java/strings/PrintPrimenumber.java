package com.java.strings;

public class PrintPrimenumber {
	
	public static void main(String[] args) {
		
		int i,n=3,flag=0;
		if(n==0||n==1) {
			System.out.println(n+" is not prime number");
		}else {
		
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not primenumber");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+" is prime number");
		}
		}
	}
}
