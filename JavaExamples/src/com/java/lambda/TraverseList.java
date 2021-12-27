package com.java.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TraverseList {
	public static void main(String[] args) {
		
		String[] s= {"sd","sd","sdd"};
		List<String> list = Arrays.asList(s);
		
		list.stream().filter(s1->s1.equals("sd")).forEach(s2->System.out.println(s2));
		//System.out.println(count);
		
		Set<String> set=new HashSet<>();
		
		set.add(null);
		set.add(null);
		set.add("Anny");
		set.add("Funny");
		set.add("Anny");
		
		//System.out.println(set);
		
		set.stream().forEach(System.out::println);
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Anny");
		map.put(2, "Sweety");
		map.put(5, null);
		map.put(3, "dsd");
		map.put(4, "dsd");
		
		map.forEach((K,V)->System.out.println(K +" "+V));
		
		
		List<String> mapList=map.values().stream().collect(Collectors.toList());
		System.out.println(mapList);
		
		Set<Integer> mapSet=map.keySet().stream().collect(Collectors.toSet());
		System.out.println(mapSet);
	}
}
