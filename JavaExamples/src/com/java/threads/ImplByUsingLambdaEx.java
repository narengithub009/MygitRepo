package com.java.threads;

public class ImplByUsingLambdaEx {
	public static void main(String[] args) {
		
		Runnable runnable=()->{
			System.out.println("Running thread by using lambda expression");
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName+"Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread finihsed");
		};
		
		Thread  thread=new Thread(runnable,"The Thread1");
		thread.start();
		Thread  thread1=new Thread(runnable,"The Thread2");
		thread1.start();
	}
}
