package com.java;

public class Temp2 {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalaize method");
	}
	private  Temp2() {
		System.out.println("I'm Constructor");
	}
	
	static {
		System.out.println("I'm static block");
	}
	public static void main(String[] args) {
		Temp2 temp = new Temp2();
		System.out.println(temp.hashCode());
		temp=null;
		System.gc();
		
	}
}

class SuperClass {
	final void method() {
		System.out.println("final method");
	}

}

class ChildClass extends SuperClass {

}
