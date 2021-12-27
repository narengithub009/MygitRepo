package com.java;

public class ChildClass1 implements ParentClass1 {
	public static void main(String[] args) throws Exception {
		ParentClass1 class1=new ChildClass1();
		class1.m1();
	}
	
	public void m1() {
		
		System.out.println("Child Method");
		//super.m1();
	}

	@Override
	public void m2() {
		
		
	}
}
interface ParentClass1{
	
	int x=10;
	int y=20;
	default void m1() throws Exception{
		System.out.println("Parent method");
	}
	 public void m2();
}