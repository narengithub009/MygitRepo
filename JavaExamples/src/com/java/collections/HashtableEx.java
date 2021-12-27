package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableEx {
	public static void main(String[] args) {
		
		Map<Integer, String> map= new Hashtable<>();
		
		map.put(1, "anny");
		map.put(2, "Mittu");
		map.put(3, "Biilllu");
		map.put(4, "Sweety");
		map.put(5, "Funny");
		
		//System.out.println(map);
		
		map.forEach((k,v)->System.out.println(k+"  "+v));
		
		Set<Integer> key=map.keySet();
		for(Integer keys:key) {
			System.out.println(keys+"   "+map.get(keys));
		}
		
		Iterator<Integer> it = key.iterator();
		
		while (it.hasNext()) {
			int key1=it.next();
			
			System.out.println(key1+ " "+map.get(key1));
			
		}
		
		Set<Entry<Integer, String>> entryset=map.entrySet();
		for(Entry<Integer, String> entry:entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
