package com.java;

public class SynchronizedStringBuilderExample {
	
	private StringBuilder stringBuilder=new StringBuilder();
	
	public synchronized void appendString(String text) {
		stringBuilder.append(text);
	}
	
	public synchronized String getStringBuilderContent() {
		return stringBuilder.toString();
	}
	
	public static void main(String[] args)  {
		
		SynchronizedStringBuilderExample example = new SynchronizedStringBuilderExample();
		
		Thread thread1 = new Thread(()-> {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				example.appendString("Thread1 : "+i+ "\n");
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				example.appendString("Thread2 : " +i+ "\n");
			}
		});
		
		thread1.start();
		
		thread2.start();
		
		try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		String result = example.getStringBuilderContent();
		System.out.print(result);
	}
}
