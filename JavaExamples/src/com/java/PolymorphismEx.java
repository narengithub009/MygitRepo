package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PolymorphismEx {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Narender");
		list.add("Neeraja Reddy");
		list.add("Anny");
		list.add(null);
		list.add(null);
		list.add("Narender");
		list.add("Narender");
		
		list.stream().forEach(p -> System.out.println(p));
		}
}