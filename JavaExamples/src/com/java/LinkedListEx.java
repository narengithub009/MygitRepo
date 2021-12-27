package com.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		
		linkedList.add("Naren");
		linkedList.add("Funny");
		linkedList.add("Anny");
		linkedList.add("mittu");
		linkedList.add("Sweety");
		
			
		Iterator<String> it=linkedList.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		System.out.println("Adding element at specfic index");
		linkedList.add(0, "BIllu");
		linkedList.removeLast();
		Iterator<String> it1=linkedList.iterator();
		while (it1.hasNext()) {
			
			System.out.println(it1.next());
		}
	}
}
