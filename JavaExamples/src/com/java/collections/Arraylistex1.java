package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylistex1 {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(45);
		list.add(46);
		list.add(67);
		list.add(89);
		
		ListIterator<Integer> iterator=list.listIterator();
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
//		while(true) {
//			System.out.println("infinite loop");
//		}
		
//		for(;;) {
//			System.out.println("infinite loop");
//		}
		
		do {
			System.out.println("infinite loop");
		}while(true);
	}
}
