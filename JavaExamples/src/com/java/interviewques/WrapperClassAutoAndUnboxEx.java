package com.java.interviewques;

public class WrapperClassAutoAndUnboxEx {
	
	public static void main(String[] args) {
		
		int i=10;// Single value container, primitive data type
		Integer iRef=new Integer(i); // Boxed (Constructing an Object)
		
		Integer iRef1=Integer.valueOf(i);
		int j=iRef.intValue();// unboxing (Extracting value from Obejct)
		
		Integer  kRef=i; //Auto boxing ( equals to Integer kRef= new Integer(i)
		int l= kRef;// Auto unboxing
		//OOPs --> objects
		
	}
}
