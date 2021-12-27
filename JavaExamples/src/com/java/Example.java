package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Example {
	
	public static void main(String[] args) {
		
		List<TempDelete> list= Arrays.asList(
				new TempDelete("Narender", "Konreddy", 35),
				new TempDelete("aeeraja","Bommeneni", 34),
				new TempDelete("Narender", "Konreddy", 9)
				);
		
		list.forEach((names) -> System.out.println(names.getName()+" "+names.getLastName()+" "+names.getAge() ));
		
		Collections.sort(list, new SortingEx());
		
		list.forEach((names) -> System.out.println(names.getName()+" "+names.getLastName()+" "+names.getAge() ));
	}

	

}

class SortingEx implements Comparator<TempDelete>{
	@Override
	public int compare(TempDelete o1, TempDelete o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
