package com.java.arrays;

public class DuplicateValinArray {
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,3,4,5,5,6,6,8};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
