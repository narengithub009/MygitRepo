package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new TreeMap<>();
		map.put(12, "Naren");
		map.put(2, "Anny");
		map.put(3, "Neeru");
		map.put(23, "Sweety");
		map.put(34, "Billu");
		
		
		for(Map.Entry<Integer, String> maps:map.entrySet()) {
			System.out.println(maps.getKey()+" "+maps.getValue());
		}
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		/*Collections.sort(entries, new Comparator<Entry<Integer, String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

					
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		for(Entry<Integer, String> entry:entries){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}*/
		
		Collections.sort(entries, (e1,e2)->e1.getValue().compareTo(e2.getValue()));
		for(Entry<Integer, String> entry:entries){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
	}
	
}
