package com.java;

public class RunnableExample {
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable aninimous Innerclass");
				
			}
		});
		
		thread.start();
		
		Thread thread2=new Thread(()-> System.out.println("Runnable aninimous lambda expresssion"));
		thread2.start();
	}
}
