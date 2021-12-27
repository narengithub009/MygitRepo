package com.java;

public class ClosureExample {
	public ClosureExample() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		int i=10;
		int b=20;
		ClosureExample closureExample=new ClosureExample();
		doProcess(i, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i+b);
				System.out.println("dfdf"+this);
			}
		});
		closureExample.execute(10);
		//doProcess(i, (s)-> System.out.println(s+b));
	}
	
	public static void doProcess(int i, Process process) {
		process.process(i);
		
	}
	
	public void execute(int j) {
		doProcess(j, i-> {
			System.out.println(j);
			System.out.println(this);
		});
	}
}
interface Process{
	
	void process(int i);
}
