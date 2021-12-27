package com.java.arrays;

public class ArrayIniializationEx {
	public static void main(String[] args) {
		
		String str[] = new String[20];
		int i;
		for(i=0;i<str.length;i++) {
			str[i]=i+"array";
			System.out.println(str[i]);
		}
		int sum=0;
		double avearge=0.0;
		int[] arr= {1,2,3,4,5};
		
		for(int a:arr) {
			sum=sum+a;
		}
		
		int len=arr.length;
		
		System.out.println("sum "+sum);
		System.out.println("Avarage "+((double)sum/(double)len));
		for(int a=0;a<arr.length;a++) {
			System.out.println(arr[a]);
		}
	}
}
