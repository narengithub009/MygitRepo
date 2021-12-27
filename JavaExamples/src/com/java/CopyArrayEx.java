package com.java;

import java.util.Arrays;

public class CopyArrayEx {
	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6};
		int[] copyArray=num;
		
		for(int value:copyArray) {
			System.out.println(value);
		}
		
		System.out.println(Arrays.toString(copyArray));
	}
}
