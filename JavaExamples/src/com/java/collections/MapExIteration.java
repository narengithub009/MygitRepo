package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExIteration {
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Naren");
		map.put(2, "Anny");
		map.put(3, "Neeru");
		
		//Iteration by using ketSet
		
		for(Integer i:map.keySet()) {
			System.out.println(i);
		}
		for(String string:map.values()) {
			System.out.println(string);
		}
		
		for(Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m);
		}
	}
}
