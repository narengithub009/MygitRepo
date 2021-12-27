package com.java;

public class SingletonEx {
	
	private static SingletonEx singleton_instance=null;
	
	private String s;
	
	private SingletonEx() {
		s="Singleton constructor";
	}
	
	private static SingletonEx getInstance() {
		if(singleton_instance==null) 
			singleton_instance=new SingletonEx();
			return singleton_instance;
		
	}
}
