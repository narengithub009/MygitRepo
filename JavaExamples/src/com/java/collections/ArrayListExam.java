package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListExam {
	
	public static void main(String[] args) {
		
		Map<Integer, String> list=new HashMap<>();
		//list.add(null);
		list.put(1,"Funny");
		
		list.put(2,"Anny");
		list.put(3,"Mittu");
		//list.add(null);
		
		list.put(4,"Anny");
		list.put(5,null);
		list.put(6,null);
		System.out.println(list);
		
		Iterator<Integer> it=list.keySet().iterator();
		while(it.hasNext()) {
			int key=it.next();
			//System.out.println(key+"  "+list.get(key));
		}
		
		for(Integer integer:list.keySet()) {
			//System.out.println(integer);
		}
		
		for(String string: list.values()) {
			//System.out.println(string);
		}
		
		for(Map.Entry<Integer,String> entry:list.entrySet()) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}
}
