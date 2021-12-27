package com.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapEx {
	
	public static void main(String[] args) {
			
		HashMap<Integer, String> hashMap = new HashMap<>();
		for(int i=1;i<10;i++) {
			
			hashMap.put(i, "Naren"+i);
		}
		
		//Set set=hashMap.entrySet();
		
		/*Iterator iterator=hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry=(Entry) iterator.next();
			
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
		for(Map.Entry mp:hashMap.entrySet()) {
			
			System.out.println(mp.getKey() +" "+mp.getValue());
		}*/
		
		
		Map<Integer,String> mmap=new HashMap<Integer, String>();
		mmap.put(12, "zxzz");
		mmap.put(1, "dffd");
		mmap.put(24, "dff");
		mmap.put(4, "sdsd");
		
		for(Map.Entry m:mmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		TreeMap<Integer,String> map=new TreeMap<>(mmap);
		Collections.synchronizedMap(map);
		System.out.println("After Sorting");
		
		Set<Entry<Integer, String>> set=map.entrySet();
		
		Iterator<Entry<Integer, String>> it=set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> ee=it.next();
			System.out.println(ee.getKey()+" "+ee.getValue());
		}
		
		System.out.println(map.containsValue("sdsd"));
	}
}
