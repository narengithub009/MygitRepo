package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		Vector<String> strings=new Vector<>();
		
		strings.add("Narender");
		strings.add("Aswitha");
		
		for(String str:strings) {
			System.out.println(str);
		}
		
		Iterator<String> it=strings.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
