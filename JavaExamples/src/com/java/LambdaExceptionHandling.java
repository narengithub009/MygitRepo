package com.java;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4};
		
		int key=2;
		process(numbers,key,commonLambda((v,k)->System.out.println(v/k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		
		for(int a:numbers) {
			consumer.accept(a, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> commonLambda(BiConsumer<Integer, Integer> consumer){
		return (v,k)-> {
			try {
				System.out.println(v/k);
			}catch (ArithmeticException e) {
				System.out.println("Exception Handled");
			}
			
		};
	}
}
