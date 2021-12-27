package com.java.example;

import java.util.Scanner;

public class TempClass {
	public static void main(String[] args) {
		
		int marks=30;
		char grade;
		
		if(marks>=80) {
			grade='A';
		}else if(marks>=60) {
			grade='B';
		}else if(marks>=40) {
			grade='C';
		}else {
			grade='D';
		}
		System.out.println(grade);		
		
	}
}
