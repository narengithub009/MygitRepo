package com.java;

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		
		m.sum(12,13);
		m.sum(12,13.0);
	}

	private void sum(int i, int j) {
		System.out.println(i+j);
		
	}
	private void sum(int i, double j) {
		System.out.println(i+j);
		
	}
}
