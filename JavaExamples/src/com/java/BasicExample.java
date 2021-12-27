package com.java;

public class BasicExample {
	
	private int i=1;
	private boolean deci=true;
	private byte j=1;
	private short s=1;
	private double d=1.00;
	private char c='c';
	private float f= 1l;
	private long l=100;
	
	
	public static void main(String[] args) {
		int i=-1;
		System.out.println("Hello world");
		System.out.println("Print");
		
		if(i==1) {
			System.out.println(i);
		}else if(i>1) {
			System.out.println("i is not eqaul to 1");
		}else {
			System.out.println("i is negative");
		}
	}
}
