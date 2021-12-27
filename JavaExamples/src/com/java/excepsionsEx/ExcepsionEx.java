package com.java.excepsionsEx;

public class ExcepsionEx {
	public static void main(String[] args) {
		try {
			int i=Integer.parseInt("xyz");
		}
		catch (Exception e) {
			System.out.println("It must be integer");
		}
		
	}
}
