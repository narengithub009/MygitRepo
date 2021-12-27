package com.java.collections;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList{

	
	@Override
	public boolean add(Object e) {
		if(this.contains(e))
		{
			return true;
		}else {
		return super.add(e);
		}
		
	}
	public static void main(String[] args) {
		
		CustomArrayList arrayList=new CustomArrayList();
		arrayList.add(21);
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(21);
		System.out.println(arrayList);
		
		
	}
}
