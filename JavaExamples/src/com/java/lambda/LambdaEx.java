package com.java.lambda;

public class LambdaEx{
	
	public void greet(Greeting greeting) {
		
		greeting.perform();
		System.out.println("Greeting");
	}
	public static void main(String[] args) {
		
		LambdaEx ex=new LambdaEx();
		HelloWorldGreeting greeting=new HelloWorldGreeting();
		ex.greet(greeting);
	}
}
