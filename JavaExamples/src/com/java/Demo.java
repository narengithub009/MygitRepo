package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
	
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
			list.add("dsd");
			list.add("sdsds");
			list.add("dfdf");
			list.add("sdsss");
			list.add("dsdsdsds");
			
			synchronized (list) {
				Iterator<String> it=list.iterator();
				System.out.println("Synchronized list");
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}
			List<String> list1 = new ArrayList<String>();
			list1.add("dsd");
			list1.add("sdsds");
			list1.add("dfdf");
			list1.add("sdsssds");
			list1.add("dsdsdsds");
			
			for(String com:list) {
				System.out.println(list1.contains(com) ? "yes" : "no");
			}
		System.out.println(list.contains(null));
		
		
		List<TempDelete> names = new ArrayList<TempDelete>();
		names.add(new TempDelete("Narender", "Konreddy", 35));
		names.add(new TempDelete("aeeraja","Bommeneni", 34));
		names.add(new TempDelete("Narender", "Konreddy", 9));
		

		Collections.sort(names);
		
		for(TempDelete list2:names) {
			System.out.println(list2);
		}
		}
}

