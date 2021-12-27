package com.java;

public class StringOfFirstWord {
	
	static String s="My Name is Narender";
	public static void main(String[] args) {
		String[] word=s.split(" ");
		System.out.println(s.toUpperCase());
		for(int i=0;i<word.length;i++) {
			
			System.out.print(word[i].charAt(0));}
	}
	
}
