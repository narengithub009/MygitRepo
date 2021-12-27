package com.java;

public class Test {
	public static void main(String[] args) {
		demo1 d= ()->"Hello Java";
		d.demo1();
		int j=20;
		for(int i=1;i<=10;i++) {
			System.out.println(j+"*"+i+"="+(j*i));
		}
	}
	
	
}
interface demo1
{
	public String demo1();
}