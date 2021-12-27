package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TempExam1 
{
	
	public static void main(String[] args) {
		List<String> autos=new ArrayList<String>();
		
		autos.add("Green");
		autos.add("black");
		autos.add("black");
		autos.add("Red");
		autos.add("Green");
		
	autos.stream().filter(s->s.equals("black")).forEach(s1->System.out.println(s1));
	

	}

}