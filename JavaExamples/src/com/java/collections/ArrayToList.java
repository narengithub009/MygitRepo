package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		
		
		String[] arr= {"Naren","Anny","Funny"};
		
		System.out.println("Array Elemnets");
		
		for(String str:arr) {
			System.out.println(str);
		}
		
		System.out.println("List Conversion");
		
		List<String> list=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
	}
}
