package com.java.collections;

import java.util.Stack;

public class StatckExample {
	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<>();
		
		stack.push("Naren");
		stack.push("Anny");
		stack.push("Neeru");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("Naren"));
		System.out.println(stack.pop());
	}
}
