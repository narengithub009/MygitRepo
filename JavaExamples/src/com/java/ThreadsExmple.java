package com.java;

public class ThreadsExmple extends Thread{
	
	public ThreadsExmple() {
		System.out.println("Initializating object");
	}
	public void run() {
		for(int i=0; i<=2;i++) {
		System.out.println("Thread running "+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		
		
		for(int i=0;i<3;i++) {
			ThreadsExmple exmple = new ThreadsExmple();
		exmple.start();
		
		}
	}
}
