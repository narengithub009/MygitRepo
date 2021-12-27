package com.java.mywork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VisitorsData {
	
	List<AmusementPark> list = Arrays.asList(new AmusementPark(2323, 2323, "Monday"),
				new AmusementPark(1234, 5765, "Tuesday"),
				new AmusementPark(7343, 76, "Wendsday"));
	private AmusementPark park=null;
	public void totalVisitors(){
		
		Iterator<AmusementPark> it=list.iterator();
		
		int sum = 0;
		int femaleCount=0;
		int maleCount=0;
		for(AmusementPark park:list) {
		//	System.out.println(park.getDay()+" "+park.getFemaleCount()+" "+park.getMaleCount() );
			System.out.println(park);
		}
		
		
		
	}
			
	public static void main(String[] args) {
		
		VisitorsData data=new VisitorsData();
		data.totalVisitors();
	}
}
