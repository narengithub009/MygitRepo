package com.java.lambda;

public class HelloWorldGreeting implements Greeting {

	public HelloWorldGreeting() {
		System.out.println("Object is creaing");
	}
	@Override
	public void perform() {
		System.out.println("Hello world greeting");
		System.out.println(Greeting.class);
	}

}
