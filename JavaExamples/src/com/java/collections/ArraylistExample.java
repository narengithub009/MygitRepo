package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArraylistExample {
	public static void main(String[] args) {

		List<String> list = new Vector<String>();
		list.add("Narender");
		list.add("Aswitha");
		list.add("Aswitha2");
		list.add("Aswitha1");
		list.add(null);
		System.out.println(list);
		try {

			list.remove(5);
		} catch (Exception e) {
			System.out.println("No element to be removed " + e);
		} finally {
			System.out.println("Allways");
		}

		System.out.println(list);
		
		Object[] toarray=list.toArray();
		
		System.out.println(toarray[0]);
	}
}
