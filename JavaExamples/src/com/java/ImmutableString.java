package com.java;

public class ImmutableString {

	public static void main(String[] args) {
        String str="ab";
    String str1=str.concat("cd");
        System.out.println(str+" "+str.hashCode()+" "+str1+" "+str1.hashCode()); //ab
        
        StringBuffer buffer = new StringBuffer("hjj");
        
        buffer.append("jkh");
        
        System.out.println(buffer);
 }
}
