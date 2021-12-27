package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		
		set.add("Naren");
		set.add("Naren");
		set.add("Funny");
		set.add("Billu");
		set.add("Mittu");
		set.add("Anny");
		set.add(null);
		set.add(null);
		
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("************Hashset to Araay converstion***********");
		String[] str=set.toArray(new String[set.size()]);
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("************Hashset to ArrayList converstion***********");
		
		List<String> list=new ArrayList<String>(set);
		
		for(String str1:list) {
			System.out.println(str1);
		}
	}
}
