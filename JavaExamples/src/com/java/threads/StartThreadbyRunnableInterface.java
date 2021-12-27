package com.java.threads;

public class StartThreadbyRunnableInterface  implements Runnable{

	public  StartThreadbyRunnableInterface() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("Thread has been started by using Runnble Interface");
		
	}
	public static void main(String[] args) {
		
		Thread thread1=new Thread(new StartThreadbyRunnableInterface());
		thread1.start();
	}
}
