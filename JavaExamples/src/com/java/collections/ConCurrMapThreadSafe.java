package com.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrMapThreadSafe  extends Thread{
	
	static Map<Integer,String> map=new Hashtable<Integer, String>();
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put(11, "modif");
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		map.put(1, "anny");
		map.put(2, "Funny");
		map.put(3, "anny");
		
		ConCurrMapThreadSafe conCurrMapThreadSafe=new ConCurrMapThreadSafe();
		conCurrMapThreadSafe.start();
		
		for(Object o: map.entrySet()) {
			Object s=o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}
}
