package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailfastEx {
	public static void main(String[] args) {
		
		Set<Integer> integers=new CopyOnWriteArraySet<Integer>();
		
		integers.add(12);
		integers.add(23);
		integers.add(2);
		integers.add(2);
		
		Iterator<Integer> it=integers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			integers.add(434);
		}
		
		System.out.println(integers);
	}
}
