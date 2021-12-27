package com.java.collections;

import java.util.HashMap;
import java.util.Objects;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	/*
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; return id == other.id &&
	 * Objects.equals(name, other.name); }
	 */
	@Override
	public int compareTo(Employee o) {
		if(id==o.getId()) {
			return 0;
		}else if(id>o.getId()) {
			return 1;
		}else {
		return -1;
		}
	}
	
	
	
	
}
public class EmployeeOverride {
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> hm=new HashMap<>();
		
		hm.put(new Employee(1, "Narender"), "Employee1 data");
		hm.put(new Employee(2, "Aswitha"),"Employee2 data");
		
		System.out.println(hm);
	}
}
