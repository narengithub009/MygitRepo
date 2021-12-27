package com.java;

public class ReverseString {
	public static void main(String[] args) {
		String str="abcdef";
		System.out.println(str);
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String originalStr) {
		
		char ar[] = originalStr.toCharArray();
		
		char temp;
		for(int i=0,j=ar.length-1;i<=ar.length/2;i++,j--) {
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
		}
		return new String(ar);
		
	}
}
