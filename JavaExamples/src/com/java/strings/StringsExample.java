package com.java.strings;

public class StringsExample {
	public static void main(String[] args) {
		
		String str=new String("Hello");
		String str1=new String("Hello");
		StringBuffer buffer=new StringBuffer("Hello");
		StringBuilder builder =new StringBuilder("Hello");
		StringsExample example=new StringsExample();
		String str2=str.concat("Hi");
		buffer.append("Hi");
		builder.append("Hi");
		
		System.out.println(str.hashCode()+" "+str1.hashCode()); //Immutable
		System.out.println(buffer); //mutable
		System.out.println(builder);//mutable
		
		if(str==str1) { // references
			System.out.println("str==str1");
		}else {
			System.out.println("str!=str1");
		}
		
		if(str.equals(str1)){// Sting value
			System.out.println("str equals str1");
		}else {
			System.out.println("str not equals str1");
		}
	}
}
