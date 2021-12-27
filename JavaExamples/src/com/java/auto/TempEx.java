package com.java.auto;

public class TempEx {
	public static void main(String[] args) {
		int n=4;
				
		boolean flag=false;
		
		/*for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}*/
		
		int i=2;
		
		while(i<=n/2) {
			if(n%i==0) {
				flag=true;
				break;
			}
			i++;
			
		}
		
		if(flag!=true) {
			System.out.println(n+ " Is Prime number");
		}else {
			System.out.println(n+ " is not prime number");
		}
		
		
	}
}
