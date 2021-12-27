package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<String> linkelist = new LinkedList<>();
		linkelist.add("Narender");
		linkelist.add("Aswitha");
		linkelist.add("Neeraja");
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.addAll(linkelist);
		System.out.println(linkelist);
		System.out.println(linkelist.indexOf(2));
		System.out.println(linkelist.get(0));
		System.out.println(arrayList);
		
		Iterator<String> iterator1=linkelist.iterator();
		while(iterator1.hasNext()) {
			System.out.println("While loop :"+iterator1.next());
		}
		for(String list:linkelist) {
			System.out.println(list);
		}
	}
}
