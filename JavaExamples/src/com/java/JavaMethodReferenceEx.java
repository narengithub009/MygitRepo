package com.java;

public class JavaMethodReferenceEx {
	public static void main(String[] args) {
		
		Thread thread=new Thread(JavaMethodReferenceEx::printMessage);//()-> printMessage()
		thread.start();
	}
	
	public static void printMessage() {
		for(int i=1;i<=3;i++) {
		System.out.println("Hello ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
