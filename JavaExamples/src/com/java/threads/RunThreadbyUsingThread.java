package com.java.threads;

public class RunThreadbyUsingThread extends Thread {
	
	public void run() {
		System.out.println("Thread has been started by using thread classs");
	}
	public static void main(String[] args) throws InterruptedException {
		RunThreadbyUsingThread thread=new RunThreadbyUsingThread();
		System.out.println("Thread state "+thread.getState());
		thread.start();
		Thread.sleep(2000);
		System.out.println("Thread state "+thread.getState());
	}
}
