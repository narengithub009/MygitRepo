package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Narender");
		list.add("Aswitha");
		
		
		System.out.println("================ArrayConversion===============");
		
		String[] ar=new String[list.size()];
		list.toArray(ar);
		
		for(String str:ar)
		{
			System.out.println(str);
		}
		
		
	}
}
