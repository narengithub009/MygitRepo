package com.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		Set<Integer> set2=new HashSet<>(set);
		
		set2.add(11);
		set2.add(21);
		set2.add(31);
		
		System.out.println(set2);
		
		Set<String> str=new TreeSet<String>();
		
		str.add(null);
		str.add("Naren");
		str.add("Naren");
		System.out.println(str);
		
	}
}
