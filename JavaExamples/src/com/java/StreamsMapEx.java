package com.java;

import java.util.ArrayList;
import java.util.List;

public class StreamsMapEx {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(2);
		//list.add(null);
		System.out.println(list);
		
		list.stream().filter(s->s>5).map(x->x*x).forEach(System.out::println);
	}
}
