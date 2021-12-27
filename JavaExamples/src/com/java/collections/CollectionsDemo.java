package com.java.collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionsDemo {
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,23,34};
		
		Vector<Integer> vector=new Vector<>();
		
		Hashtable<Integer, String> hashtable=new Hashtable<>();
		
		vector.addElement(12);
		vector.addElement(24);
		
		hashtable.put(1, "Narender");
		hashtable.put(2, "Aswitha");
		
		System.out.println(arr[0]);
		System.out.println(vector.elementAt(1));
		System.out.println(hashtable.get(1));
		
		
		}
	}

