package com.java.examples;

import java.util.Objects;

public class Employees {
	
	private int id;
	private String name;
	
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
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
	
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		
		Employees employees=new Employees(101,"Anny");
		Employees empl=new Employees(101,"Anny");
		
		System.out.println(employees.hashCode()==empl.hashCode());
		System.out.println(employees.equals(empl));
	}
}
