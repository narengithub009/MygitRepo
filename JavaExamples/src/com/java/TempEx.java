package com.java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TempEx   {
	
	public static void main(String[] args)  {
		
		List<String> list = new ArrayList<>();
		
		list.add("aydoidy");
		list.add("aahdkjsdh");
		list.add("aaadskjdh");
		
		
		Collections.sort(list);
		for(String l:list) {
			System.out.println(l);
		}
	}
	
}
