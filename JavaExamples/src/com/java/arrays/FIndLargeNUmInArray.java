package com.java.arrays;

public class FIndLargeNUmInArray {
	public static int secondLargeInt(int[] x, int total) {
		
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]<x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		
		return x[total-3];
	}
	public static void main(String[] args) {
		int arr[] = {23,34,54,45,232,334,454,23};
		System.out.println(secondLargeInt(arr, 8));
	}
}
