package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExam1 {
	public static void main(String[] args) {
		
		
		List<Integer> integers=new ArrayList<Integer>();
		
		integers.add(12);
		integers.add(34);
		integers.add(1);
		integers.add(32);
		
		Stream s=integers.stream().filter(i->i==12);
		s.forEach(x->System.out.println(x));
		
		System.out.println("*******************");
		
		Stream s2=integers.stream().map(i1->i1*i1);
		
		s2.forEach(System.out::println);
		System.out.println("*******************");
		List<Integer> integers2=new ArrayList<Integer>();
		
		integers2=integers.stream().filter(x->x<15).collect(Collectors.toList());
		integers2.stream().forEach(s1->System.out.println(s1));
	}
}
