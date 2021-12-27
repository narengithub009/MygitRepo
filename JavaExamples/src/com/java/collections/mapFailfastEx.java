package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class mapFailfastEx {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		
		map.put(1, "h");
		map.put(2, "sd");
		
		Iterator<Integer> it=map.keySet().iterator();
		
		while(it.hasNext()) {
			int key=it.next();
			System.out.println(map.get(key));
			map.put(12, null);
		}
	}
}
