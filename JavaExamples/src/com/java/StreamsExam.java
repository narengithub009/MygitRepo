package com.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsExam {
	public static void main(String[] args) {
		
		String[] str= {"s","w","e"};
		
		Stream<String> s=Arrays.stream(str);
		
		System.out.println(s.iterator().next().indexOf("e"));
	}
}
