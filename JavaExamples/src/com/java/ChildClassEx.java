package com.java;

public class ChildClassEx extends ParenClass{

	static /*@Override
	public void m1()  {
		System.out.println("Child M1 nethod");
		
	}*/
	int i=10;
	
	public void m2() {
		System.out.println("Child class");
	}
	
	public static void main(String[] args) throws Exception {
		
		ParenClass class1=new ChildClassEx();
		System.out.println(class1.hashCode());
		System.out.println(i);
		class1.m1();
	}
}
