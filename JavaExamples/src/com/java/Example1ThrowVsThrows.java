package com.java;

import java.util.Scanner;

public class Example1ThrowVsThrows {
	
	public static void main(String[] args) {
		
	
		
		ArthOperation(12,0);
	}

	private static void ArthOperation(int i, int j)  {
		try {
		System.out.println(i/j);
		}
		catch (Exception e) {
			System.out.println("Value cannot be zero");
		}
	}
}
