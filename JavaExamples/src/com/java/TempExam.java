package com.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TempExam {
	public static void main(String[] args) {
		
		int[] num= {2,3,3,2,1,44,44,56,67};
		
		int min=num[0];
		int temp = 0;
		for(int i=0;i<num.length;i++) {

			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {


					System.out.println(num[i]);
				}
			}
			
		}
		
	}
	
	
}