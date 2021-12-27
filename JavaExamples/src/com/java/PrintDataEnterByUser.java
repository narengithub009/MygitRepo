package com.java;

import java.util.Scanner;

public class PrintDataEnterByUser {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter a Value");
		
		int num=scanner.nextInt();
		System.out.println("You have entered "+num);
	}
}
