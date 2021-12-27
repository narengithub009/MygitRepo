package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
	
	public static void main(String[] args) {
		Employee e=new Employee(12, "Anny");
		Employee e2=new Employee(23, "Funny");
		Employee e3=new Employee(1, "Mittu");
		Employee e4=new Employee(24, "Sweety");
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(e);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(employees);
		//Collections.sort(employees,new IdComaprator());
		Collections.sort(employees,new NameComparator());
		System.out.println(employees);
		
	}
}
